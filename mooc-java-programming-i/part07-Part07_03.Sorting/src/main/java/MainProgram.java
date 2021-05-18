
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }
    
    public static int smallest(int[] array) {
        int val = array[0]; 
        
        for (int entry: array) {
            if (entry < val) {
                val = entry; 
            }
        }
        return val;
    }
    
    public static int indexOfSmallest(int[] array) {
        int minVal = smallest(array); 
        int index = 0;
        for (int ii = 0; ii < array.length; ii++) {
            if (array[ii] == minVal) {
                index = ii; 
                break; 
            }
        }
        return index;  
    }
    
   public static int indexOfSmallestFrom(int[] array, int fromIndex) {
       int[] newArray = new int[array.length - fromIndex]; 
       for (int ii=0; ii<newArray.length; ii++) {
           newArray[ii] = array[ii+fromIndex];
       }
       return indexOfSmallest(newArray) + fromIndex;
   }
   
   public static void swap(int[] array, int index1, int index2) {
       int val1 = array[index1]; 
       int val2 = array[index2]; 
       
       array[index1] = val2; 
       array[index2] = val1;
       
   }
   
   public static void sort(int[] array) {
       // === SELECTION SORT === 
       // 1. move smallest number to index 0 
       // 2. move second smallest number to index 1 
       // 3. move third smallest number to index 2 
       // ...
       
       for (int ii = 0; ii < array.length; ii++) {
           swap(array, indexOfSmallestFrom(array, ii), ii); 
           System.out.println(Arrays.toString(array));
       }
   }

}
