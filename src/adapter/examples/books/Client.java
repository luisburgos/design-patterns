package adapter.examples.books;

/**
 * Created by luisburgos on 11/08/15.
 */
public class Client {
    public static void main(String[] args) {
        Book book;
        book = new AdapterBook(new SimpleBook("Refactoring", "Martin Fowler"));
        System.out.println(book.getTitleAndAuthor());
    }
}
