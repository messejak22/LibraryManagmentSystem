import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        
        // Welcome to the Library's data base 
        Scanner scan = new Scanner(System.in);
        int userChoice = 0;
        Bookshelf bs1 = new Bookshelf();
        Borrower b1 = new Borrower("ReaderMan", 1234);
        System.out.println("Welcome to the Seven Hills' Library Database!");
        System.out.println();
        // ask if user is a borrower or librarian (1) (2)
       
        System.out.print("Enter (1) if you are a borrower or (2) if you are a librarian: ");
        userChoice = scan.nextInt();
        String temp = scan.nextLine(); 
         if (userChoice == 1) {
            boolean run = true;
            while (run == true) {
                System.out.print("Enter ID: ");
                String id = scan.nextLine();
                if (id.equals(b1.getUserName())) {
                    System.out.print("Enter password: ");
                    int password = scan.nextInt();
                    if (password == b1.getPassword()) {
                        run = false;
                    } else {
                      System.out.println("Wrong");  
                    } // password 
                } else {
                    System.out.println("Wrong");
                } // userName info  
            } // end while loop 
            

         } else {
            System.out.println("Coming soon");
         } // librarian tree

        



    } // end main method 
    




} // end class 