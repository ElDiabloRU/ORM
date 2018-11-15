package Jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;


public class Test {
    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect("https://ria.ru/").get();

        Elements elements = document.getElementsByAttributeValue("itemprop","name");



        for (Element element: elements){
            System.out.println(element.text());
        }
    }
}