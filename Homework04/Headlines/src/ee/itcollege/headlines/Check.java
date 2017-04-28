package ee.itcollege.headlines;

import java.io.IOException;
import java.util.Date;

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

	private static EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory("headlines");

	public static void saveHeadline(Headline headline) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(headline);
		transaction.commit();
		em.close();
	}

	public static Headline findHeadline (String title) {

		EntityManager em = emf.createEntityManager();
		TypedQuery<Headline> query = em.createQuery("from Headline where title = :title", Headline.class); 
		query.setMaxResults(1); 
		query.setParameter("title", "title");
		try {
			Headline headline = query.getSingleResult();
			return headline;
		} 
		catch (NoResultException e) {
			return null;
		}
		finally {
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
				System.out.println("I have already seen that title: " + headline);
				System.out.println("It points to: " + headline.getPointsToUrl());
				System.out.println();
			}

			else {
				System.out.println("New headline: " + title);
				System.out.println();

				headline = new Headline();
				headline.setTitle(title);
				headline.setFirstSeen(new Date());
				//System.out.println(new Date());
				headline.setFoundOnUrl(url);
				headline.setPointsToUrl(element.absUrl("href"));
				//System.out.println(element.absUrl("href"));
				saveHeadline(headline);
			}

		}

		System.out.println();
		emf.close();

	}
}