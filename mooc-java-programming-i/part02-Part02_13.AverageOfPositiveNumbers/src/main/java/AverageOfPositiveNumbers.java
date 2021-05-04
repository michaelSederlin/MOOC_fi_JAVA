
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0; 
        int counter = 0; 
        
        while (true) {
            System.out.println("Give a number:");
            int input = Integer.parseInt(scanner.nextLine()); 

            if ( input == 0 ) {
                break; 
            } else if (input > 0 ) {
                sum = sum + input; 
                counter++; 
            }
        }
        
        if ( counter == 0 ) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((double)sum/counter);
        }
    }
}
