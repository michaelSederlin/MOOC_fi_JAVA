/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michael
 */

public class Timer {
    private ClockHand second; 
    private ClockHand hundredthSecond; 
    
    public Timer() {
        this.second = new ClockHand(60);
        this.hundredthSecond = new ClockHand(100); 
    }
    
    @Override
    public String toString() {
        return(second + ":" + hundredthSecond);
    }
    
    public void advance() {
        this.hundredthSecond.advance(); 
        
        if (this.hundredthSecond.value() ==  0) {
            this.second.advance(); 
        } 
    }
    
}
