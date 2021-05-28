import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.*;
public class Main {

    public static void main(String[] args)  {

        int NUMBOOKS = 97;
        Bookshelf bs1;
        String[][] catalog = new String[NUMBOOKS][6]; 
        // Welcome to the Library's data base 
        // load in book data from textfile
        try {
            File myObj = new File("books.txt");
            Scanner scanF = new Scanner(myObj);
            //BufferedWriter bw = new BufferedWriter(myObj);

            int j = 0;

            while(scanF.hasNext()) {
                String data = scanF.nextLine();
                catalog[j] = data.split(",");
                j++;
            }

           

   

        } catch (FileNotFoundException e ) {
            System.out.println("error");
            e.printStackTrace();

        }


        Scanner scan = new Scanner(System.in);

        int userChoice = 0;
        Borrower b1 = new Borrower("ReaderMan", 1234);
        Librarian l1 = new Librarian("Librarian1", 4321);
        System.out.println("Welcome to the Seven Hills' Library Database!");
        System.out.println();
        // ask if user is a borrower or librarian (1) (2)
    
        System.out.print("Enter (1) if you are a borrower or (2) if you are a librarian:: ");
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
            // start borrower 
            // ask to check out or return 

            Scanner scanf = new Scanner(System.in);

            System.out.print("Enter first letter of book title: ");
            String letterChoice = scanf.nextLine();
            
            for (int i = 0; i < catalog.length; i++) {
                if (catalog[i][0].substring(1, 2).equals(letterChoice)) {
                    System.out.println(catalog[i][0]);
                }
            }
            
            System.out.print("Enter title to learn more: ");
            String title0 = scanf.nextLine();
            String title = "\"" +title0+ "\"";

         
            for (int i = 0; i < catalog.length; i++) {
                if (catalog[i][0].equals(title)) {
                    System.out.println(catalog[i][0] + " " + catalog[i][1]+ " " +  catalog[i][2]+ " " + catalog[i][3]+ " " + catalog[i][4]+ " " + catalog[i][5]);
                    if (catalog[i][4].substring(1, 2).equals("F")) {
                        System.out.println("You may check this out!");
                        System.out.print("Enter (1) to check out: ");
                        int checkOut = scan.nextInt();
                        if (checkOut == 1) {
                            catalog[i][4] = "\"True\"";
                            System.out.println(catalog[i][4]);
                        }
                        
                    }
                }
            }
            
            
            


        } // end borrower
       

    } // end main method 
    




} // end class 