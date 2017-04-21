package ee.itcollege.maven;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;

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
		ArrayList<String> text = new ArrayList<>();
		String info = " 📈  Estonian news in English from news.err.ee:\n"
				+ "-----------------------------------------------\n\n";
		text.add(info);

		for (Element title : titles) {
			nt++;
			String line1 = (nt + ") " + title.text() + " (" + new Date() + ") " + "\n");  //parse titles
			String line2 = (" >>> " + title.attr("href") + "\n\n");  //parse title links			
			text.add(line1 + line2);
			String textS = text.toString().replace(",", "").replace("[", " ").replace("]", "");
			System.out.println(textS);
		} 
		
		String textS = text.toString().replace(",", "").replace("[", " ").replace("]", "");
		Files.write(Paths.get("output/output.txt"), textS.getBytes());

	}
}

