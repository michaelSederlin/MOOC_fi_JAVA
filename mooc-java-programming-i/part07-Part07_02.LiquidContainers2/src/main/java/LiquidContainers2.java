
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Container c1 = new Container(); 
        Container c2 = new Container();

        while (true) {
            System.out.println("First: " + c1);
            System.out.println("Second: " + c2);
            
            String[] input = scan.nextLine().split(" ");
            if (input[0].equals("quit")) {
                break;
            }
            
            int amount = Integer.parseInt(input[1]);
            String operation = input[0];
            
            if (operation.equals("add")) {
                c1.add(amount); 
            } else if (operation.equals("move")) {
                if (c1.contains() > amount){
                    c1.remove(amount);
                    c2.add(amount);
                } else {
                    c2.add(c1.contains());
                    c1.remove(amount);
               }
            } else if (operation.equals("remove")) {
                c2.remove(amount);
            }
        }
    }

}
