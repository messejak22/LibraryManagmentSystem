import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        
        // Welcome to the Library's data base 
        Scanner scan = new Scanner(System.in);
        int userChoice;
        Bookshelf bs1 = new Bookshelf();
        System.out.println("Welcome to the Seven Hills' Library Database!");
        System.out.println();
        // ask if user is a borrower or librarian (1) (2)
        bs1.shelf();
        System.out.println("Enter (1) if you are a borrower or (2) if you are a librarian: ");
        userChoice = scan.nextInt();
        
         if (userChoice == 1) {
            // if borrower branch 
            // ask if they want to return a book (1) or check one out (2) 
            System.out.println("Enter (1) to return a book or (2) to check a book out: ");
            int borrowerChoice1 = scan.nextInt();
            if (borrowerChoice1 == 1) {
                // if return book 
                
            } else {
                // else check one out 
                // print out all books 
                System.out.println(bs1.getShelf());
            }
        } else {
            // else librarian branch 
            System.out.println("Feature coming soon!");
        } // end else if  




    }
    




} // end class 