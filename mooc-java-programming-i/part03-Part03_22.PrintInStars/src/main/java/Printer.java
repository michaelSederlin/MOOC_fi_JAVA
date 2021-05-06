
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        for (int number: array) {
            printStars(number);
        }
    }
    
    public static void printStars(int N) {
        for (int ii = 0; ii < N-1; ii++) {
            System.out.print("*");
        }
        System.out.println("*");
    }

}
