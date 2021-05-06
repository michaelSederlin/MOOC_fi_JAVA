
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                        
        int longestNameLength = 0; 
        String longestName = ""; 
        int sum = 0; 
        int counter = 0; 
        
        while (true) {
            String input = scanner.nextLine(); 
            
            if (input.equals("")) {
                break;
            }
            
            String[] stringArray = input.split(",");
            sum += Integer.valueOf(stringArray[1]); 
            counter++; 
            String name = stringArray[0]; 
            
            if (name.length() > longestNameLength) {
                longestNameLength = name.length();
                longestName = name; 
            }
        }      
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of birth years: " + (double)sum/counter);
        
    }
}
