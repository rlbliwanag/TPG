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
public class StudentComparator implements Comparator<Student> {
    
    @Override
    public int compare(Student s1, Student s2) {
        
        //ascending order of student GPA
        /*if (s1.getGPA() < s2.getGPA()){
            return -1;
        }
        else if(s1.getGPA() > s2.getGPA()){
            return 1;
        }*/
        
        //descending order of student GPA
        if (s1.getGPA() < s2.getGPA()){
            return 1;
        }
        else if(s1.getGPA() > s2.getGPA()){
            return -1;
        }
        //if GPA and first names are equal arrange in ascending order by student id
        else if(s1.getFirstName() == s2.getFirstName()){
            return s1.getId().compareTo(s2.getId());    
        }
        //else arrange in alphabetical order by first name
        return s1.getFirstName().compareTo(s2.getFirstName());
    }
}
