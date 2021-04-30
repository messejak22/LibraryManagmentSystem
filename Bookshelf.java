import java.util.ArrayList;
public class Bookshelf {

    public static ArrayList<Book> bookList; 
    public void shelf() {
        Book b1 = new Book("JK Rowling", "Harry Potter", "12314312X");
        Book b2 = new Book("Dr. Seues", "Green Eggs and Ham", "12514312X");
        bookList = new ArrayList<Book>();
        bookList.add(b1);
        bookList.add(b2);
    }
    public String getShelf() {
        int count = 1;
        String bookIndex = "";
        for (Book b : bookList) {
            bookIndex += b.getTitle() + " (" + count + ") "+ "\n";
            count++;
        }
        return bookIndex;
    }
    

    
}