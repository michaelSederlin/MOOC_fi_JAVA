/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michael
 */
public class PaymentCard {
    private double balance; 
    
    public PaymentCard(double openingBalance) {
        this.balance = openingBalance; 
    }
    public String toString() {
        return("The card has a balance of " + this.balance + " euros");
    }
    
    public void eatAffordably() {
        double moneyLeft = this.balance - 2.60; 
        if (moneyLeft >=0 ) {
            this.balance = moneyLeft;
        } 
    }
    
    public void eatHeartily() {
        double moneyLeft = this.balance - 4.60; 
        if (moneyLeft >=0 ) {
            this.balance = moneyLeft;
        } 
    }
    
    public void addMoney(double amount) {
        if (amount >= 0) {
            this.balance = this.balance + amount;             
        }
        if (this.balance > 150) {
            this.balance = 150;
        }
    }
    
    
}
