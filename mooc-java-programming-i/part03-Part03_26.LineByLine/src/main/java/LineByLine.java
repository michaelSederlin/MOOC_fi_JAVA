
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine(); 
            if (input.equals("")) {
                break; 
            }

            String[] stringPieces = input.split(" ");

            for (String piece: stringPieces) {
                System.out.println(piece);
            }
        }
    }
}
