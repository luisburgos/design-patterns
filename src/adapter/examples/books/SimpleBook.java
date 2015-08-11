package adapter.examples.books;

/**
 * Created by luisburgos on 11/08/15.
 */
public class SimpleBook {

    private String title;
    private String author;

    public SimpleBook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
