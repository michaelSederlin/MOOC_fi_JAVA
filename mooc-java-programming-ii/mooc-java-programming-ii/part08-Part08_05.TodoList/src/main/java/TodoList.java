
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
public class TodoList {
    private ArrayList<String> tasks; 
    
    public TodoList(){
        this.tasks = new ArrayList<>(); 
    }
    
    
    public void add(String task){
        this.tasks.add(task);
        
    }
    
    public void remove(int taskNumber) {
        this.tasks.remove(taskNumber - 1);
        
    }
    
    public void print() {
        for (int ii=0; ii<this.tasks.size(); ii++) {
            System.out.println(ii+1 + ": " + this.tasks.get(ii));
        }
    }
}
