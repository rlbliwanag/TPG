/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentrearranger;

/**
 *
 * @author Ryan Liwanag
 */
public class Student {
    
    private String id;
    private double gpa;
    private String firstName;
    
    public Student(String id, String firstName, double gpa){
        this.id = id;
        this.firstName = firstName;
        this.gpa = gpa;        
    }
    
    public String getId(){
        return id;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public double getGPA(){
        return gpa;
    }
}
