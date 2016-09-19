package Chapter8.bookpack;

/**
 * Created by KSM on 2016/8/28.
 */
public class Book {
    private String title;
    private String author;
    private int pubDate;


    public Book(String t, String a, int d) {
        title = t;
        author = a;
        pubDate = d;
    }

    public void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
    }
}