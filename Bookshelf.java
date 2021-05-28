import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class Bookshelf {

    private static List<Book> bookList; 

    public Bookshelf(String[][] catalog1) {
        
        String[][] catalog = catalog1;
        bookList = new ArrayList<Book>();

        // read in books
        for (int i = 0; i < catalog.length; i++) {
            //  public Book(String title, String author, String isbn, String genre, boolean checkedOut, int yearPub) {
            Book b1 = new Book(catalog[i][0], catalog[i][1], catalog[i][2], catalog[i][3], Boolean.parseBoolean(catalog[i][4]), Integer.parseInt(catalog[i][5]) );
        }

      


      
    }

    // read in shelf 

    public List<Book> getShelf() {
        return bookList;
    }



    



    
}