

public class FromParameterToOne {

    public static void main(String[] args) {    
        printFromNumberToOne(5);
    }
    
    public static void printFromNumberToOne(int number) {
        for (int ii = number; ii >= 1; ii--) {
            System.out.println(ii);
        }
    }
}
