/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michael
 */
public class Bird {
    private String commonName; 
    private String latinName; 
    
    public Bird(String commonName, String latinName) {
        this.commonName = commonName; 
        this.latinName = latinName; 
    }
    
    
    public String getCommonName() {
        return this.commonName;
    }
    
    public String getLatinName() {
        return this.latinName;
    }
    
    
}
