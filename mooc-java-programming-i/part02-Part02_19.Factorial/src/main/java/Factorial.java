
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number:");
        int myInt = Integer.parseInt(scanner.nextLine()); 
        
        int prod = 1; 
        
        for (int ii = 1; ii <= myInt; ii++) {
            prod = prod*ii;
        }
        
        System.out.println("Factorial: " + prod);
        
        

    }
}
