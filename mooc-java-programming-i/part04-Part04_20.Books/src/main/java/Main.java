import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<> () ;
        
        while (true) {
            System.out.println("Title:");
            
            String title = scanner.nextLine(); 
            if (title.isEmpty()) {
                break;
            }
            
            System.out.println("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine());
            
            System.out.println("Publication year: ");
            int pubYear = Integer.parseInt(scanner.nextLine());
            
            books.add(new Book(title, pages, pubYear));
        }
        
        System.out.println("What information will be printed?");
        String printInfo = scanner.nextLine();
        
        for (Book book: books) {
           if (printInfo.equals("everything")) {
                System.out.println(book.getEverything());
           } else if (printInfo.equals("name")) {
               System.out.println(book.getTitle());
           }
        }
    }
}
