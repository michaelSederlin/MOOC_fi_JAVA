
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String usr = scanner.nextLine(); 
        String pwd = scanner.nextLine(); 
        boolean condition1 = (usr.equals("alex") && pwd.equals("sunshine")); 
        boolean condition2 = (usr.equals("emma") && pwd.equals("haskell"));
        if (condition1 | condition2) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
