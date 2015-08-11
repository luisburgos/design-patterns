package adapter.examples.books;

/**
 * Created by luisburgos on 11/08/15.
 */
public class AdapterBook implements Book{

    private SimpleBook book;

    public AdapterBook(SimpleBook book) {
        this.book = book;
    }

    @Override
    public String getTitleAndAuthor(){
        return book.getTitle() + " .by " + book.getAuthor();
    }

}
