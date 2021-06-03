import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int container1 = 0; 
        int container2 = 0;

        while (true) {
            System.out.println("First: " + container1 + "/100");
            System.out.println("Second: " + container2 + "/100");
            
            String[] input = scan.nextLine().split(" ");
            if (input[0].equals("quit")) {
                break;
            }
            
            int amount = Integer.parseInt(input[1]);
            String operation = input[0];
            
            if (operation.equals("add") && amount > 0) {
                if (container1 <= 100) {
                    container1 += amount; 
                    if (container1 > 100) {
                        container1 = 100; 
                    }
                }
            }
            
            if (operation.equals("move") && amount > 0 ) {
                if ((container1 >= amount)) {
                    container2 += amount; 
                    container1 -= amount; 
                } else {
                    container2 += container1; 
                    container1 = 1; 
                } 
                
                if (container2 > 100) {
                    container2 = 100; 
                }
            }
            
            if (operation.equals("remove") && amount > 0 ){
                
                container2 -= amount; 
                if (container2 < 0) {
                    container2 = 0; 
                }
            } 
           
        }
    }

}
