
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
public class Course {
    private ArrayList<Integer> points; 
    private int maxPoint; 
    private int minPoint; 
    private int passingGrade; 
    
    
    public Course() {
        this.points = new ArrayList<>(); 
        this.maxPoint = 100; 
        this.minPoint = 0;
        this.passingGrade = 50;
    }
    
    public void addPoint(int point) {
        if (point > this.minPoint & point < this.maxPoint) {
            this.points.add(point);
        }
    }
   
    public int countGradeOccurence(int grade) {
        int N = 0; 
        for (int point: this.points) {
            if (this.getGrade(point) == grade) {
                N++; 
            }
        }
        return N; 
    }
    
    public int getGrade(int point) {
        if (point >= 90) {
            return 5; 
        } else if (point >= 80) {
            return 4;
        } else if (point >= 70) {
            return 3; 
        } else if (point >= 60) {
            return 2;
        } else if (point >= 50) {
            return 1; 
        } else {
            return 0; 
        }
    }

    public double getAverageAll() {
        int sum = 0; 
        for (int point: this.points) {
            sum += point; 
        }
        return (double)sum/this.points.size();
    }
    
    public int getNumberOfPassing() {
       int nPassing = 0;
       for (int point: this.points) {
           if (point >= this.passingGrade) {
               nPassing++;
           }
       }
       return nPassing;
    }
    
    public double getAveragePassing() {
        int sum = 0; 
        for (int point: this.points) {
            if (point >= this.passingGrade) {
                sum += point; 
            }
        }
        return (double)sum/this.getNumberOfPassing();
    }
    
    public double getPassPercentage() {
        return 100.0*this.getNumberOfPassing()/this.points.size(); 
    }
}
