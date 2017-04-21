DESCRIPTION
------------


Homework 3 - Maven/Jsoup html parse

Write a program that finds the headlines of your favourite news site and saves them to the file with the time each headline was first seen by the program (new Date()) and the URL to the news. Every time the program is executed it displays headlines that it has not seen before separated from the ones it has seen before.

Save the data about the headlines to a file by using either

  -  org.json:json (preferred), a Maven dependency to serialize objects into JSON;
  -  com.google.code.gson:gson (preferred);
  -  Java's built-in serialization;
  -  your own syntax to write and parse a plain-text file.

Use Jsoup to fetch the headlines. If you do not know and do not want to learn CSS selector, use the following code, otherwise choose the site that you truly want to keep track to.



<pre>
Document document = Jsoup.connect("http://www.thehackernews.com").get();
Elements headlines = document.select("a.entry-title"); // here you can write a CSS selector
for (Element headline : headlines) {}
</pre>


USAGE
------------

run: <br/>
- ee.itcollege.maven.HW03_v01.java

my files: <br/>
- output.txt

