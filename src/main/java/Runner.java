import db.DBHelper;
import models.Book;
import models.Borrower;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {


        Borrower borrower1 = new Borrower("Zsolt");
        DBHelper.save(borrower1);

        Book book1 = new Book("Harry Potter", "JK Rowling", borrower1);
        DBHelper.save(book1);

        Book book2 = new Book("Book", "John Smith", borrower1);
        Book book3 = new Book("Book", "John Smith", borrower1);
        DBHelper.save(book2);
        Book book4 = new Book("Boooook", "James Jones", borrower1);
        DBHelper.save(book3);

        List<Book> books = new ArrayList<Book>();
        books.add(book1);
        books.add(book2);
        books.add(book3);





    }
}
