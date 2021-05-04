
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int myInt = Integer.parseInt(scanner.nextLine()); 
        
        for (int ii = myInt; ii <= 100; ii++) {
            System.out.println(ii);
        }

    }
}
