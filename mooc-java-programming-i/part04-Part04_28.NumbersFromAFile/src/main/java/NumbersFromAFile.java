
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int counter = 0;
        
        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                int number = Integer.parseInt(reader.nextLine());
                if (number >= lowerBound & number <= upperBound) {
                    counter++;
                }
            }
            System.out.println("Numbers: " + counter);
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }        
    }

}

//
//
//import java.util.ArrayList;
//import java.nio.file.Paths;
//import java.util.Scanner;
//
//public class IsItInTheFile {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Name of the file:");
//        String file = scanner.nextLine();
//
//        System.out.println("Search for:");
//        String searchedFor = scanner.nextLine();
//        
//        ArrayList<String> list = new ArrayList<>();
//        
//        try (Scanner reader = new Scanner(Paths.get(file))) {
//            while (reader.hasNextLine()) {
//                list.add(reader.nextLine());
//            }
//        } catch (Exception e) {
//            System.out.println("Reading the file " + file + " failed.");
//        }
//        
//        if (list.contains(searchedFor)) {
//            System.out.println("Found!");
//        } else {
//            System.out.println("Not found.");
//        }
//    }
//}
