
import java.util.ArrayList;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michael
 */
public class Recipes {
    private ArrayList<Recipe> recipes;
    
    public Recipes() {
        this.recipes = new ArrayList<>(); 
    }
    
    public void addRecipe(Recipe recipe){
        this.recipes.add(recipe);
    }
    
    public ArrayList<String> getRecipeNames(){
        ArrayList<String> recipeNames = new ArrayList <>();
        for (Recipe recipe: this.recipes) {
            recipeNames.add(recipe.getName()); 
        }
        return recipeNames; 
    }
    
    public void printRecipes() {
//        System.out.println("Recipes:");
        for (Recipe recipe: this.recipes) {
            System.out.println(recipe);
        }
    }
    
    public void printByName(String word) {
//        System.out.println("Recipes:");
        for (Recipe recipe: this.recipes) {
            if (recipe.getName().contains(word)) {
                System.out.println(recipe);
            }
        }
    }
    
    public void printByTime(int number) {
        for (Recipe recipe: this.recipes) {
            if (recipe.getCookTime() <= number) {
                System.out.println(recipe);
            }
        }
    }    
    
    public void printByIngredients(String ingredient) {
        for (Recipe recipe: this.recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
            }
        }
    }        
    
//    public void findName(String name) {
//        System.out.println("Recipes:");
//        for (Recipe recipe: this.recipes) {
//            if (Arrays.asList(recipe.getName().split(" ")).contains(name)) {
//                System.out.println(recipe);
//            }
//        }
//    }
}
