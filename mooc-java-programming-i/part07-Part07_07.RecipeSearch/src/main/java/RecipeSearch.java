
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File to read: ");
        String file = scanner.nextLine(); 
//        String file = "recipes.txt";
        
        Recipes recipes = new Recipes();
        ArrayList<String> recipeInformation; 
        try (Scanner reader = new Scanner(Paths.get(file))) {
            recipeInformation = new ArrayList<>();
            
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                recipeInformation.add(line); 
                
                if (line.isEmpty()){
                    recipes.addRecipe(new Recipe(recipeInformation)); 
                    recipeInformation.clear();
                }
            }
            
            recipes.addRecipe(new Recipe(recipeInformation));
            
            System.out.println("Commands:");
            System.out.println("list-lists the recipes");
            System.out.println("stop-stops the program");
            System.out.println("find name-searches recipes by name");
            System.out.println("find cooking time - searches recipes by cooking time");
            System.out.println("find ingredient - searches recipes by ingredient");            

            while (true) {
                System.out.println("Enter command:");
                String input = scanner.nextLine(); 
                
                if (input.equals("list")) {
                    recipes.printRecipes();
                } else if (input.equals("stop")) {
                    break; 
                } else if (input.equals("find name")) {
                    System.out.println("Searched word:");
                    String word = scanner.nextLine(); 
                    recipes.printByName(word);
                } else if (input.equals("find cooking time")){
                    System.out.println("Max cooking time: ");
                    int maxCookTime = Integer.parseInt(scanner.nextLine()); 
                    recipes.printByTime(maxCookTime);
                } else if (input.equals("find ingredient")) {
                    System.out.println("Ingredient:");
                    String ingredient = scanner.nextLine();                     
                    recipes.printByIngredients(ingredient);
                    
                }
                
                
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

    }
    
    
    

}
