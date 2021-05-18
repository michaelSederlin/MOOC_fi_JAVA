
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scanner = new Scanner(System.in);
        
        DataBase dbase = new DataBase(); 
        
        while (true) {
            System.out.println("?");
            String input = scanner.nextLine(); 

            if (input.equals("Add")) {
                System.out.println("Name:");
                String name = scanner.nextLine(); 
                System.out.println("Name in latin:");
                String latinName = scanner.nextLine();
                dbase.addBird(new Bird(name, latinName));

            } else if (input.equals("Observation")) {
                System.out.println("Bird?");
                String bird = scanner.nextLine(); 
                dbase.addObservation(bird);
                
            } else if (input.equals("All")) {
                dbase.printAll();
                
            } else if (input.equals("One")){
                System.out.println("Bird?");
                String bird = scanner.nextLine(); 
                dbase.printOne(bird);
                
            } else if (input.equals("Quit")) {
                break;
            }


        }


    }

}
