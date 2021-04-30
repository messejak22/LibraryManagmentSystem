import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        
        // Welcome to the Library's data base 
        Scanner scan = new Scanner(System.in);
        int userChoice;
        Bookshelf bs1 = new Bookshelf();
        Borrower b1 = new Borrower("ReaderMan", 1234);
        System.out.println("Welcome to the Seven Hills' Library Database!");
        System.out.println();
        // ask if user is a borrower or librarian (1) (2)
       
        System.out.println("Enter (1) if you are a borrower or (2) if you are a librarian: ");
        userChoice = scan.nextInt();
        
         if (userChoice == 1) {
            // if borrower branch 
            // ID and password check 
            System.out.println("Enter ID: ");
            String id = scan.nextLine();
            if (id.equals(b1.getUserName())) {
                System.out.println("Enter password: ");
                int password = scan.nextInt();
                if (password == b1.getPassword()) {

                }
            }
            // ask if they want to return a book (1) or check one out (2) 
            System.out.println("Enter (1) to return a book or (2) to check a book out: ");
            int borrowerChoice1 = scan.nextInt();
            if (borrowerChoice1 == 1) {
                // if return book 
                
            } else {
                // else check one out 
                // print out all books 
                System.out.println();
                System.out.println(bs1.getShelf());
                System.out.println("Enter desired book number: ");
                int bookChoice = scan.nextInt();
                
            }
        } else {
            // else librarian branch 
            System.out.println("Feature coming soon!");
        } // end else if  




    }
    




} // end class 