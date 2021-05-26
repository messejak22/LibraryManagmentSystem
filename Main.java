import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Main {

    public static void main(String[] args)  {

        int const NUMBOOKS = 100;
     
        // Welcome to the Library's data base 
        // load in book data from textfile
        try {
            File myObj = new File("books.txt");
            Scanner scan = new Scanner(myObj);

            int j = 0;
            String[][] catalog = new String[NUMBOOKS][6];

            while(scan.hasNext()) {
                String data = scan.nextLine();
                fields[j] = data.split(",");
                j++;
            }
            scan.close();
            // come back and build out books
            Bookshelf bs1 = new Bookshelf(catalog);
       

        } catch (FileNotFoundException e ) {
            System.out.println("error");
            e.printStackTrace();

        }




        int userChoice = 0;
        Borrower b1 = new Borrower("ReaderMan", 1234);
        Librarian l1 = new Librarian("Librarian1", 4321);
        System.out.println("Welcome to the Seven Hills' Library Database!");
        System.out.println();
        // ask if user is a borrower or librarian (1) (2)
    
        System.out.print("Enter (1) if you are a borrower or (2) if you are a librarian: (3) to create a new borrower account: ");
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
        
            // Check out vs return 
            System.out.println("Enter (1) to check out or (2) to return: ");
            int checkOut = scan.nextInt();
            if (checkOut == 1) {
                // list books (isbn used to check out) 
                for (int i = 0; i < bs1.getShelf().size(); i++) {
                    System.out.println(bs1.getShelf().get(i).getTitle() + " by, " + bs1.getShelf().get(i).getAuthor() + " " + bs1.getShelf().get(i).getIsbn());
                }

                System.out.print("Enter ISBN for checkout: ");
                String temp1 = scan.nextLine();
                String bookChoice = scan.nextLine();
            

                for (int i = 0; i < bs1.getShelf().size(); i++) {
                    if (bookChoice.equals(bs1.getShelf().get(i).getIsbn())) {
                        b1.getInventory().add(bs1.getShelf().get(i));

                    }
                }
                
            } else {
                // list inventory with return number (isbn used to return books)
                System.out.println("Coming soon");

            }

        } else if (userChoice == 3) {
            /*
                This branch will be used to create new users.

            */
            
            
        } else {
            boolean run = true;
            while (run == true) {
                System.out.print("Enter ID: ");
                String id2 = scan.nextLine();
                if (id2.equals(l1.getUserName())) {
                    System.out.print("Enter password: ");
                    int password2 = scan.nextInt();
                    if (password2 == l1.getPassword()) {
                        run = false;
                    } else {
                    System.out.println("Wrong");  
                    } // password 
                } else {
                    System.out.println("Wrong");
                } // userName info  
            } // end while loop 
        
            // ask to return or checkout or add book
            System.out.println("Enter (1) Checkout (2) return (3) add book: ");
            int choice3 = scan.nextInt();
            if (choice3 == 1) {
                // checkout 
                for (int i = 0; i < bs1.getShelf().size(); i++) {
                    System.out.println(bs1.getShelf().get(i).getTitle() + " by, " + bs1.getShelf().get(i).getAuthor() + " " + bs1.getShelf().get(i).getIsbn());
                }
                
                System.out.print("Enter ISBN for checkout: ");
                String temp2 = scan.nextLine();
                String bookChoice2 = scan.nextLine();

                for (int i = 0; i < bs1.getShelf().size(); i++) {
                    if (bookChoice2.equals(bs1.getShelf().get(i).getIsbn())) {
                        l1.getInventory().add(bs1.getShelf().get(i));
                    }
                }
                
            

            } else if (choice3 == 2) {
                // return 
            } else {                    
                // add book
            }


        } // librarian tree
       

    
       

    
    } // end main method 
    




} // end class 