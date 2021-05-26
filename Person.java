import java.util.ArrayList;
import java.util.List;


public class Person {
    private String userName;
    private int password;

    private List<Book> inventory;
    
    public Person(String userName, int password) {
        this.userName = userName;
        this.password = password;
        inventory = new ArrayList<Book>();
    }

    public String getUserName() {
        return userName;
    }
    public int getPassword() {
        return password;
    }


    public List<Book> getInventory() {
       

        return inventory;
    }

    
        

    
}