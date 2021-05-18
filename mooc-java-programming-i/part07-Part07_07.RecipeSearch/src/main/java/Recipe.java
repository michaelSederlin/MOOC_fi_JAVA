
import java.text.MessageFormat;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michael
 */
public class Recipe {
    private ArrayList<String> ingredients; 
    private String name; 
    private int cookingTime; 
    
    public Recipe(ArrayList<String> recipeInformation) {
        this.name = recipeInformation.get(0); 
        this.cookingTime = Integer.parseInt(recipeInformation.get(1));
        this.ingredients = new ArrayList<>(); 

        for (int ii = 2; ii < recipeInformation.size(); ii++) {
            this.addIngredient(recipeInformation.get(ii));
        }
    }
    
    public void addIngredient(String ingredient) {
        this.ingredients.add(ingredient);
    }

    public String getName() {
        return this.name; 
    }
    
    public int getCookTime() {
        return this.cookingTime; 
    }
    
    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }
    
    @Override
    public String toString() {
        return MessageFormat.format("{0}, cooking time: {1}", this.name, this.cookingTime);
    }
}
