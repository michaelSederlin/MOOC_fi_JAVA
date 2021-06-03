
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michael
 */
public class Container {
    private int amount; 
    private int maxAmount; 
    
    public Container() {
        this.amount = 0; 
        this.maxAmount = 100; 
    }
    
    public void add(int addAmount) {
        
        if (addAmount > 0) {
            this.amount += addAmount; 

            if (this.amount > this.maxAmount) {
                this.amount = this.maxAmount; 
            }        
        }
    }
    
    public void remove(int removeAmount) {
        if (removeAmount > 0) {
            this.amount -= removeAmount; 
            if (this.amount < 0) {
                this.amount = 0; 
            }
        }
    }
    
    public String toString(){
        return this.amount + "/" + this.maxAmount;
    }
    
    public int contains() {
        return this.amount; 
    }
        
}