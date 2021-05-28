public class Librarian extends Person {

    public Librarian(String userName, int password) {
        super(userName, password);
    }


    public static boolean isbnChecker(String isbn) {
        // if x 
        int sum = 0;

        
        int j = 0;
        for (int i = 10; i > isbn.length(); i--) {
            if (isbn.charAt(i) == 'X') {
                sum = sum + i*10;
            } else {
                sum = sum + i*(Integer.valueOf(isbn.charAt(j)));
                j++;
 
            }
        }
            if (sum%11 == 0) {
                return true;
            } else {
                return false; 
            }

            
      
        
    }
    
}