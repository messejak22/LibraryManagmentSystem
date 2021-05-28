import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class Bookshelf {

    private static List<Book> bookList; 

    public Bookshelf(String[][] catalog1) {
        
        String[][] catalog = catalog1;
        bookList = new ArrayList<Book>();

        for (int i = 0; i < catalog.length; i++) {
            //  public Book(String title, String author, String isbn, String genre, boolean checkedOut, int yearPub) {
            Book b1 = new Book(catalog[i][0], catalog[i][1], catalog[i][2], catalog[i][3], Boolean.parseBoolean(catalog[i][4]), Integer.parseInt(catalog[i][5]) );
        }

      


        /*
        Book b1 = new Book("Green Eggs and Ham", "Dr. Seuss", "12514312X");
        Book b2 = new Book("Harry Potter", "JK Rowling", "12314312X");
        Book b3 = new Book("The Great Gatsby", "F.Scott Fitzgerald", "007462542X");
        bookList = new ArrayList<Book>();
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        sort();
        */
    }


    public List<Book> getShelf() {
        return bookList;
    }



    



    
}