
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        int input; 
        int sum = 0; 
        int counter = 0; 
        int numEven = 0; 
        int numOdd = 0; 
        
        System.out.println("Give numbers");
        while (true) {
            input = Integer.parseInt(scanner.nextLine()); 
            if (input == -1) {
                break;
            }
            sum = sum + input;
            counter++;
            
            if ( input % 2 == 0 ) {
                numEven++; 
            } else {
                numOdd++; 
            }
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + counter); 
        System.out.println("Average: " + (double)sum/counter);
        System.out.println("Even: " + numEven);
        System.out.println("Odd: " + numOdd);
    }
}
