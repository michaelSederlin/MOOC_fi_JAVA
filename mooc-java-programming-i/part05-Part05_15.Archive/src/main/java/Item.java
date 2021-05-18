/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michael
 */
public class Item {
    private String identifier; 
    private String name; 
    
    public Item(String identifier, String name){
        this.identifier = identifier;
        this.name = name; 
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getIdentifier() {
        return this.identifier;
    }
    
    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }
    
    public boolean equals(Object other) {
        if (this == other) {
            return true; 
        }
        
        if (!(other instanceof Item)) {
            return false;
        }
        
        Item otherItem = (Item) other;
        
        if (otherItem.identifier.equals(this.identifier)) {
            return true; 
        }
        
        return false; 
    }
    
}
