package ee.itcollege.maven;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
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
		String info = "\n----------------------------------------------\n "
				+ " 📈  Estonian news in English from news.err.ee:\n"
				+ "     (" + new Date() + ")\n"
				+ "-----------------------------------------------\n\n";
		text.add(info);

		for (Element title : titles) {
			nt++;
			String line1 = (nt + ") " + title.text() + "\n");  //parse titles
			String line2 = (" >>> " + title.attr("href") + "\n\n");  //parse title links			
			text.add(line1 + line2);
			String textS = text.toString().replace(",", "").replace("[", " ").replace("]", "");
			System.out.println(textS);
			//print only first 10 headlines:
			if (nt == 10) {		
				break;
			}
		}

		//write to file:
		String textS = text.toString().replace(",", "").replace("[", " ").replace("]", "");
		Path path = Paths.get("output/output.txt");
		File news = new File("output/output.txt"); 

		if (news.exists()){
			java.util.List<String> rlines = Files.readAllLines(path);
			rlines.add(1, textS);
			Files.write(path, rlines);
		} else {
			Files.write(path, textS.getBytes(), StandardOpenOption.CREATE);
			//CREATE = create new file if not exist; APPEND = add new data to same file when program is run
		}
	}
}

