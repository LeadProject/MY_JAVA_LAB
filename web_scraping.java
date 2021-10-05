import javax.swing.text.Document;
import org.jsoup.Jsoup;

public class Main {

    public static void main(String[] args[])
    {
        System.out.println(Scrap("https://www.naver.com"));
    }

    public String Scrap(String url)
    {
        Document doc = Jsoup.connect(url).get();
        return doc;
    }
}
