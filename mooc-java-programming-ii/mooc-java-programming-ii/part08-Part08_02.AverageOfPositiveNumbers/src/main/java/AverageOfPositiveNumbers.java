
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int counter = 0; 
        int sum = 0; 
        
        while (true) {
            int number = Integer.parseInt(scanner.nextLine()); 
            
            
            if (number == 0) {
                break; 
            }
            
            if (number > 0) {
                sum += number;
                counter++;
            }
        }
        
        if (counter == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((double)sum/counter  );
        }

    }
}
