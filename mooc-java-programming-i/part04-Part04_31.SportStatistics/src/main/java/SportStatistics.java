
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String file = scan.nextLine(); 
        
        System.out.println("Team:");
        String team = scan.nextLine();
        
//        home team, visiting team, home team points, and visiting team points
        int gameCounter = 0;
        int wins = 0; 
        int losses = 0; 
        
        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String[] row = reader.nextLine().split(","); 
                String homeTeam = row[0];
                String awayTeam = row[1];
                int homeTeamPoints = Integer.parseInt(row[2]);
                int awayTeamPoints = Integer.parseInt(row[3]);
                
                if (homeTeam.equals(team) | awayTeam.equals(team)) {
                    gameCounter++;
                    if ((homeTeam.equals(team) & homeTeamPoints > awayTeamPoints) | awayTeam.equals(team) & awayTeamPoints > homeTeamPoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                } 
            }
            
            System.out.println("Games: " + gameCounter);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
            
        } catch (Exception e) {
            System.out.println("Failed to read file " + file);
        }
    }

}

