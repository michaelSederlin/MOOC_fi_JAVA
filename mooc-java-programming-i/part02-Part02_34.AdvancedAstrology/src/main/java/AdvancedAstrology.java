
public class AdvancedAstrology {
    public static void printStars(int number) {
        String myString = ""; 
        for (int ii = 0; ii < number; ii++) {
            myString += "*"; 
        }
        System.out.println(myString);
    }

    public static void printSpaces(int number) {
        String myString = ""; 
        for (int ii = 0; ii < number; ii++) {
            myString += " ";  
        }
        System.out.print(myString);
    }

    public static void printTriangle(int size) {
        
        for (int row = 1; row <= size; row++) {
            int numSpaces = size - row; 
            printSpaces(numSpaces);
            printStars(row); 
            
        }
    }

    public static void christmasTree(int height) {
        
        int counter = 0; 
        for (int row=1; row <= height; row++) {
            printSpaces(height - row );
            printStars(row + counter);
            counter++;
        }
        printSpaces(height - 2); 
        printStars(3);
        printSpaces(height - 2); 
        printStars(3);        
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
