
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michael
 */
public class IOU {
    private HashMap<String, Double> debts; 
    
    public IOU() {
        this.debts = new HashMap<>(); 
        
    }
    
    public void setSum(String toWhom, double amount) {
        this.debts.put(toWhom, amount);

    }
    
    public double howMuchDoIOweTo(String toWhom) {
        
        if (!this.debts.containsKey(toWhom)) {
            return 0.;
        } else {
            return this.debts.get(toWhom);
        }
    }
    
}
