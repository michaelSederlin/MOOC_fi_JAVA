/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michael
 */
public class Book {
    int pages; 
    String title; 
    int pubYear;
    
    public Book(String title, int pages, int pubYear) {
        this.pages = pages; 
        this.title = title; 
        this.pubYear = pubYear;
    }
    
    public String getEverything() {
        String returnString = this.title + ", " + this.pages + " pages, " + this.pubYear;
        return(returnString);
    }
    
    public String getTitle() {
        return(this.title);
    }
    
    public int getPages() {
        return(this.pages);
    }
    public int getPubYear() {
        return(this.pubYear);
    }
    
}
