import java.util.ArrayList;
import java.util.List;


public class Bookshelf {

    private List<Book> bookList; 

    public Bookshelf() {
        Book b1 = new Book("Harry Potter", "JK Rowling", "12314312X");
        Book b2 = new Book("Green Eggs and Ham", "Dr. Seuss", "12514312X");
        bookList = new ArrayList<Book>();
        bookList.add(b1);
        bookList.add(b2);
    }


    public List<Book> getShelf() {
        return bookList;
    }


    



    
}