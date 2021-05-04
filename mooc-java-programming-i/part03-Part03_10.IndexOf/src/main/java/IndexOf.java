
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("Search for?");
        int number = Integer.parseInt(scanner.nextLine()); 
        int index = -1; 
        
        for (int ii=0; ii < list.size(); ii++) {
            if (list.get(ii) == number) {
                System.out.println( number + " is at index " + ii);
            }
        }
        

        // implement here finding the indices of a number
    }
}
