package ee.itcollege.maven;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HW03_v01 {

	static Document document;

	static {
		try {
			document = Jsoup.connect("http://news.err.ee/k/news").get();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {

		Elements titles = document.select(".category-news-header > a[href]");

		int nt = 0;
		int nl = 0;
		for (Element title : titles) {
			nt++;
			System.out.println(nt + ") " + title.text());  //parse titles
			System.out.println(">>> " + title.attr("href"));  //parse title links			
			System.out.println();
		}
	}
}

