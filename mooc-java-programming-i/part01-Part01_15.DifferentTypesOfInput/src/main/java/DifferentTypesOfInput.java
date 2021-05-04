//Submitted
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a string:");
        String strValue = scanner.nextLine(); 
        
        System.out.println("Give an integer:");
        int intValue = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give a double:");
        double dblValue = Double.valueOf(scanner.nextLine()); 
        
        System.out.println("Give a boolean:");
        boolean boolValue = Boolean.valueOf(scanner.nextLine()); 
        
        System.out.println("You gave the string " + strValue);
        System.out.println("You gave the integer " + intValue);
        System.out.println("You gave the double " + dblValue);
        System.out.println("You gave the boolean " + boolValue);
    }
}
