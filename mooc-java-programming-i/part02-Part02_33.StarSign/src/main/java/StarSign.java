
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(4);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        String myString = ""; 
        for (int ii = 0; ii < number; ii++) {
            myString += "*"; 
        }
        System.out.println(myString);
    }

    public static void printSquare(int size) {
        String myString = "";
        
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                myString += "*"; 
            }
            myString += "\n"; 
        }
        System.out.println(myString);
    }

    public static void printRectangle(int width, int height) {
        String myString = "";
        
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                myString += "*"; 
            }
            myString += "\n"; 
        }
        System.out.println(myString);
    }

    public static void printTriangle(int size) {
        String myString = "";
        
        

        for (int row = 0; row < size; row++) {
            for (int col = 0; col <= row; col++) {
                myString += "*"; 
            }
            myString += "\n"; 
        }
        System.out.println(myString);        

    }
}
