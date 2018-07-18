import db.DBHelper;
import models.Book;
import models.Borrower;
import models.Library;

import java.io.BufferedOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        DBHelper.deleteAll(Book.class);
        DBHelper.deleteAll(Borrower.class);

        Book book1 = new Book("Harry Potter", "JK Rowling");
        DBHelper.save(book1);
        Book book2 = new Book("Book", "John Smith");
        DBHelper.save(book2);
        Book book3 = new Book("Boooook", "James Jones");
        DBHelper.save(book3);

        List<Book> books = new ArrayList<Book>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        Borrower borrower1 = new Borrower("Zsolt");
        DBHelper.save(borrower1);

        Test








    }
}
