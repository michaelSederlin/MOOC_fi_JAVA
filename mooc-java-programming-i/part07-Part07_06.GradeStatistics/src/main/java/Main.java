
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        Course course = new Course(); 
        
        int point; 
        int sum = 0; 
        int counter = 0; 
        while (true) {
            System.out.println("Give a grade:");
            point = Integer.parseInt(scanner.nextLine());    
            
            if (point == -1) {
                break; 
            }
            course.addPoint(point);
        }
        
        System.out.println("Point average (all): " + course.getAverageAll());
        System.out.println("Point average (passing): " + course.getAveragePassing());
        System.out.println("Pass percentage: " + course.getPassPercentage());
        System.out.println("Grade distribution:");
        
        for (int ii = 5; ii >= 0; ii--) {
            int N = course.countGradeOccurence(ii);
            
            System.out.println(ii + ": " + getStars(N));
            
        }
    }
    
    public static String getStars(int N) {
        String starString = ""; 
        for (int ii = 0; ii < N; ii++) {
            starString += "*";
        }
        return starString;
    }
}
