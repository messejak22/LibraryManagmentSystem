import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.*;
public class Main {

    public static String[][] catalog;
    public static String[][] peeps;
    public static void main(String[] args)  {


       
        int NUMBOOKS = 97;
        Bookshelf bs1;
        catalog = new String[NUMBOOKS][6]; 
        peeps = new String[3][2];
        // Welcome to the Library's data base 
        // load in book data from textfile
        // read in books.txt
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
            
            //rewrite();
           

   

        } catch (FileNotFoundException e ) {
            System.out.println("error");
            e.printStackTrace();

        }

        // read in people 
        try {
            File obj = new File("People.txt");
            Scanner scanK = new Scanner(obj);

            int k = 0;

            while(scanK.hasNext()) {
                String data1 = scanK.nextLine();
                peeps[k] = data1.split(",");
                k++;
            }


        } catch (FileNotFoundException e) {
            System.out.println("error");
            e.printStackTrace();
        }

        Scanner scan = new Scanner(System.in);

        int userChoice = 0;
        /*
        Borrower b1 = new Borrower("ReaderMan", 1234);
        Librarian l1 = new Librarian("Librarian1", 4321);
        */
        System.out.println("Welcome to the Seven Hills' Library Database!");
        System.out.println();
        // ask if user is a borrower or librarian (1) (2)
        
        System.out.print("Enter (1) if you are a borrower or (2) if you are a librarian: ");
        userChoice = scan.nextInt();
        String temp = scan.nextLine(); 
        int k = 0;
        int x = 0;
        String id = "";
        if (userChoice == 1) {
            boolean run = true;
            
            while (run == true) {
                System.out.print("Enter ID: ");
                id = "\"" + scan.nextLine() + "\"";
                for (int i = 0; i < 3; i++) {
                    if (peeps[i][0].equals(id)) {
                        System.out.print("Enter password: ");
                        String pass = scan.nextLine();
                        for (int j = 0; j < 3; j++) {
                            if (peeps[j][1].equals(pass)) {
                                run = false;
                            }
                        }
                    }
                }
    
            } // while loop
            
                
        
                
            // ask to check out or return 

            Scanner scanf = new Scanner(System.in);
            boolean go = true;
            while (go == true) {
                System.out.print("Enter first letter of book title: ");
                String letterChoice = scanf.nextLine();
                
                for (int i = 0; i < catalog.length; i++) {
                    if (catalog[i][0].substring(1, 2).equalsIgnoreCase(letterChoice)) {
                        System.out.println(catalog[i][0]);
                    }
                }
                
                System.out.print("Enter title to learn more: ");
                String title0 = scanf.nextLine();
                String title = "\"" +title0+ "\"";

                
                for (int i = 0; i < catalog.length; i++) {
                    if (catalog[i][0].equals(title)) {
                        System.out.println(catalog[i][0] + " " + catalog[i][1]+ " " +  catalog[i][2]+ " " + catalog[i][3]+ " " + ((catalog[i][4].equals("False"))?"Available":"Checked Out") + " " + catalog[i][5] );

                      
                        if (catalog[i][4].substring(1, 2).equals("F")) {
                            System.out.print("Enter (1) to check out book (2) to leave: ");
                            int checkOut = scan.nextInt();
                            if (checkOut == 1) {
                                catalog[i][4] = "\"True\"";
                                rewrite();
                              
                            } else {
                                go = false;
                            }
                             
                        } else {
                            // ask if wish to leave or keep going 
                            System.out.print("Enter (1) to leave or (2) to stay: ");
                            int leave = scan.nextInt();
                            if (leave == 1) {
                                go = false;
                            }
                        }
                    }// end if 
                }
                


            }
            
            
            


        } else { 
            boolean go = true;
            Scanner scanf = new Scanner(System.in);
            while (go == true) {
                // search by letter
                System.out.print("Enter first letter of book title: ");
                String letterChoice = scanf.nextLine();
                
                // searches through 
                for (int i = 0; i < catalog.length; i++) {
                    if (catalog[i][0].substring(1, 2).equalsIgnoreCase(letterChoice)) {
                        System.out.println(catalog[i][0]);
                    }
                }
                
                System.out.print("Enter title to learn more: ");
                String title0 = scanf.nextLine();
                String title = "\"" +title0+ "\"";

                
                for (int i = 0; i < catalog.length; i++) {
                    if (catalog[i][0].equals(title)) {
                        System.out.println(catalog[i][0] + " " + catalog[i][1]+ " " +  catalog[i][2]+ " " + catalog[i][3]+ " " + ((catalog[i][4].equals("\"False\""))?"Available":"Checked Out") + " " + catalog[i][5] );

                      
                        if (catalog[i][4].substring(1, 2).equals("T")) {
                            System.out.print("Enter (1) to return out book (2) to leave: ");
                            int checkOut = scan.nextInt();
                            if (checkOut == 1) {
                                catalog[i][4] = "\"False\"";
                                rewrite();
                              
                            } else {
                                go = false;
                            }
                             
                        } else {
                            // ask if wish to leave or keep going 
                            System.out.print("Enter (1) to leave or (2) to stay: ");
                            int leave = scan.nextInt();
                            if (leave == 1) {
                                go = false;
                            }
                        }
                    }// end if 
                }
                


            }
            



            

            
        } // end else

        
           
            
       

    } // end main method 
    

    public static void rewrite() {
        try {
            FileWriter myWriter = new FileWriter("books.txt");

            for (int i = 0; i < 97; i++) {
                myWriter.write(catalog[i][0] + "," + catalog[i][1]+ "," +  catalog[i][2]+ "," + catalog[i][3]+ "," + catalog[i][4]+ "," + catalog[i][5]+ "\n");

            }


            myWriter.close();


        } catch (IOException e) {
            System.out.println("error");
            e.printStackTrace();

        }
    } // end rewrite 




} // end class 