public class Librarian extends Person {

    public Librarian(String userName, int password) {
        super(userName, password);
    }


    public static void isbnChecker(String isbn) {
        // if x 
        int sum = 0;
        if (isbn.contains("X") == true) {

        } else {
            // no x   
            int isbn2 = Integer.valueOf(isbn);
            int k = 0;
            for (int i = 10; i > isbn.length(); i--) {
                 sum = sum + i*(Integer.valueOf(isbn.charAt(k)));
                 k++;
            }
        }
    }
    
}