package ee.itcollege.headlines;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Check {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("headlines");

	public static void saveHeadline(Headline headline) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(headline);
		transaction.commit();
		em.close();
	}

	// TODO use the search
	public static void findHeadlines() {
		EntityManager em = emf.createEntityManager();
		System.out.println("Please type the headline to search: ");
		String[] search = TextIO.getlnString().toLowerCase().split(" ");

		String q = "from Headline where";
		String q2 = " lower(title) like :word";
		String q4 = " and lower(title) like :word";

		for (int i = 0; i < search.length; i++) {
			String q3 = Integer.toString(i);
			if (i == 0) {
				q += q2 + q3;
			}
			q += q4 + q3;
		}

		TypedQuery<Headline> query = em.createQuery(q, Headline.class);
		for (int i = 0; i < search.length; i++) {

			query.setParameter("word" + (i), "%" + search[i] + "%");
		}

		List<Headline> headlines = query.getResultList();

		if (headlines.isEmpty()) {
			System.out.println("Headline not found!");
		} else {
			System.out.println("Found the following headlines: ");
			for (Headline headline : headlines) {
				System.out.println(headline);
			}
		}

		em.close();
	}

	public static void listAll() {
		EntityManager em = emf.createEntityManager();
		TypedQuery<Headline> query = em.createQuery("from Headline", Headline.class);
		List<Headline> headlines = query.getResultList();
		for (Headline headline : headlines) {
			System.out.println(headline);
		}
		em.close();
	}

	public static Headline findHeadline(String title) {

		EntityManager em = emf.createEntityManager();
		TypedQuery<Headline> query = em.createQuery("from Headline where title = :title", Headline.class);
		query.setMaxResults(1);
		query.setParameter("title", title);
		try {
			Headline headline = query.getSingleResult();
			return headline;
		} catch (NoResultException e) {
			return null;
		} finally {
			em.close();
		}
	}

	public static void main(String args[]) throws IOException {

		String url = "http://news.err.ee/k/news";
		Document document = Jsoup.connect(url).get();

		Elements headlines = document.select(".category-news-header a");
		System.out.println();

		for (Element element : headlines) {
			String title = element.text();
			Headline headline = findHeadline(title);
			if (null != headline) {
				// System.out.println("I have already seen that title: " +
				// headline);
				// System.out.println("It points to: " +
				// headline.getPointsToUrl());
				// System.out.println();
			}

			else {
				System.out.println("New headline: " + title);
				System.out.println();

				headline = new Headline();
				headline.setTitle(title);
				headline.setFirstSeen(new Date());
				// System.out.println(new Date());
				headline.setFoundOnUrl(url);
				headline.setPointsToUrl(element.absUrl("href"));
				// System.out.println(element.absUrl("href"));
				saveHeadline(headline);
			}

		}

		System.out.println("------------------------");
		// listAll("PEter pan");
		EntityManager em = emf.createEntityManager();
		// String search = "Reform mayoral candidate: Tallinn must be driving
		// force of Estonia";

		while (true) {
			System.out.println("\nPlease choose:");
			System.out.println("1 - search headline");
			System.out.println("2 - list all the headlines");
			System.out.println("3 - any other number to exit");

			int selection = TextIO.getlnInt();

			em.getTransaction().begin();

			switch (selection) {
			case 1:
				findHeadlines();
				break;
			case 2:
				listAll();
				break;
			default:
				em.close();
				System.exit(0); // stop program
				return;
			}

			em.getTransaction().commit();
		}

		// emf.close();

	}
}