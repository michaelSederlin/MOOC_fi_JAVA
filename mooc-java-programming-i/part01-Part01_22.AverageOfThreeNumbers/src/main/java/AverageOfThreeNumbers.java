// Submitted
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int val1 = Integer.valueOf(scanner.nextLine()); 

        System.out.println("Give the second number:");
        int val2 = Integer.valueOf(scanner.nextLine()); 
        
        System.out.println("Give the third number:");
        int val3 = Integer.valueOf(scanner.nextLine()); 
           
        double result = 1.0 * (val1 + val2 + val3)/3; 
        System.out.println("The average is " + result);

    }
}
