

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
public class DataBase {
    private ArrayList<Bird> birds; 
    private ArrayList<String> observations; 
    private ArrayList<String> forbiddenWords; 
    
    public DataBase() {
        this.birds = new ArrayList<>(); 
        this.observations = new ArrayList<>(); 
        
        this.forbiddenWords = new ArrayList<>(); 
        forbiddenWords.add("Beer"); 
        forbiddenWords.add("beer"); 
        forbiddenWords.add("Cake"); 
        forbiddenWords.add("cake"); 
        forbiddenWords.add("Lion");
        forbiddenWords.add("lion");
    }
    
    public void addBird(Bird bird) {
        this.birds.add(bird);
    }
    
    public void addObservation(String name) {
        if (!(this.forbiddenWords.contains(name))) {
            System.out.println("Adding observation " + name);
            this.observations.add(name); 
        } else {
            System.out.println("Not a bird!");
        }
    }
    
    public void printAll() {
        System.out.println("oigwogihweoihgoiewh");
        for (Bird bird: this.birds) {
                String printString = 
                        bird.getCommonName() + 
                        " (" + bird.getLatinName() + "): "  + 
                        this.getObservationCount(bird.getCommonName()) + 
                        " observations";
            
                System.out.println(printString);
        }
        
    }
    
    public int getObservationCount(String name) {
        int count = 0;
        for (String observation: this.observations) {
            if (observation.equals(name)) {
                count++; 
            }
        }
        
        return count;
    }

    public void printOne(String birdQuery) {
        for (Bird bird: this.birds) {
            if (bird.getCommonName().equals(birdQuery)){
                String printString = 
                        bird.getCommonName() + 
                        " (" + bird.getLatinName() + "): "  + 
                        this.getObservationCount(bird.getCommonName()) + 
                        " observations";
            
                System.out.println(printString);
            }

        }
            
    }
    
    
    
}
