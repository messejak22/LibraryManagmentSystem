public class Book {

   // build a book
   private String title; 
   private String author;
   private String isbn; 
   private String genre;
   private boolean checkedOut;
   private int yearPub;

   public Book(String title, String author, String isbn) {
       this.title = title;
       this.author = author;
       this.isbn = isbn;
   }

   public Book(String title, String author, String isbn, String genre, boolean checkedOut, int yearPub) {
     this.title = title;
     this.author = author;
     this.isbn = isbn;
     this.genre = genre;
     this.checkedOut = checkedOut;
     this.yearPub = yearPub;
   }


   public String getTitle() {
        return title;
   }

   public String getAuthor() {
        return author;
   }

   public String getIsbn() {
        return isbn;
   }
    
}