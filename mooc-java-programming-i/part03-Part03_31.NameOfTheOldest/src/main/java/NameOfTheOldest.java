
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                        
        int ageOldest = 0; 
        String nameOldest = ""; 
        
        while (true) {
            String input = scanner.nextLine(); 
            
            if (input.equals("")) {
                break;
            }
            
            String[] stringArray = input.split(",");
            
            int age = Integer.valueOf(stringArray[1]); 
            
            if (age > ageOldest) {
                ageOldest = age;
                nameOldest = stringArray[0];
            }
            
            System.out.println("Name of the oldest: " + nameOldest);
        }      
        

    }
}
