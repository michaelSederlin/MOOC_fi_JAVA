
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Last number?");
        int input = Integer.parseInt(scanner.nextLine()); 
        
        int sum = 0; 
        
        for (int ii = 0; ii <= input; ii++) {
            sum = sum + ii; 
        }
        System.out.println("The sum is " + sum);
    }
}
