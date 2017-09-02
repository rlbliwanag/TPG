/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentrearranger;
import java.util.*;
/**
 *
 * @author Ryan Liwanag
 */
public class StudentRearranger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<Student> students = new ArrayList<Student>(); 
        
        Student s6 = new Student ("90", "Samil", 3.97);
        students.add(s6);
        Student s8 = new Student ("11", "Barbara", 3.97);
        students.add(s8);
        Student s9 = new Student ("09", "Barbara", 3.97);
        students.add(s9);
        Student s10 = new Student ("75", "Alex", 3.97);
        students.add(s10);
        Student s11 = new Student ("45", "Louis", 3.85);
        students.add(s11);
        Student s1 = new Student("33", "Tina", 3.68);
        students.add(s1);
        Student s2 = new Student ("85", "Louis", 3.85);
        students.add(s2);
        Student s3 = new Student ("56", "Samil", 3.97);
        students.add(s3);
        Student s4 = new Student ("19", "Samar", 3.75);
        students.add(s4);
        Student s5 = new Student ("22", "Lorry", 3.76);
        students.add(s5);
        
        
        Collections.sort(students, new StudentComparator());
        
        System.out.println("ID  Name  GPA");
        for (Student s: students){
            System.out.println(s.getId() + "  " + s.getFirstName() + "  " + s.getGPA());
        }
    }
}
