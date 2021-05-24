import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class Bookshelf {

    private static List<Book> bookList; 

    public Bookshelf() {
        Book b1 = new Book("Green Eggs and Ham", "Dr. Seuss", "12514312X");
        Book b2 = new Book("Harry Potter", "JK Rowling", "12314312X");
        Book b3 = new Book("The Great Gatsby", "F.Scott Fitzgerald", "007462542X");
        bookList = new ArrayList<Book>();
        bookList = new ArrayList<Book>();
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        sort();
    }


    public List<Book> getShelf() {
        return bookList;
    }


    public static void sort() {
        int n = bookList.size();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n-1; j++) {
               if (bookList.get(i).getTitle().compareTo(bookList.get(j).getTitle()) < 0) {
                   Collections.swap(bookList, i, j);
               } 
            }
        }        

    }
    



    
}