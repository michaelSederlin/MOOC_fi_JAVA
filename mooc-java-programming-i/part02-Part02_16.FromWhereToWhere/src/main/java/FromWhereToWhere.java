
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to?");
        int myStop = Integer.parseInt(scanner.nextLine()); 
        System.out.println("Where from?");
        int myStart = Integer.parseInt(scanner.nextLine()); 
        
        for (int ii = myStart; ii <= myStop; ii++) {
            System.out.println(ii);
        }
    }
}
