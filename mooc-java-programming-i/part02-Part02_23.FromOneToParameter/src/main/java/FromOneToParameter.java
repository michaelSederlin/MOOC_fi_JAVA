

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }
    public static void printUntilNumber(int number) {
        for (int ii = 1; ii <= number; ii++) {
            System.out.println(ii);
        }
    }
}
