
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }

            list.add(input);
        }
        
        int smallest = list.get(0); 
        
        for (int number: list) {
            if (smallest > number) {
                smallest = number; 
            }
        }
        
        System.out.println("Smallest number: " + smallest);
        
        for (int ii = 0; ii < list.size(); ii++) {
            if (list.get(ii) == smallest) {
                System.out.println("Found at index: " + ii);
            }
        }

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        
    }
}
