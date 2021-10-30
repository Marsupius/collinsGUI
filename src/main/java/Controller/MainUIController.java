/*
 * Filename: MainUIController.java
 * Short description: This program 
 * IST 242 Assignment: .java
 * @author  Joseph Collins
 * @version Oct 29, 2021
 */

package Controller;

import com.mycompany.jtodo.model.Student;
import com.mycompany.jtodo.model.ToDoModel;
import javax.swing.ListModel;


/**
 * @author Joe
 * @version 1.0 Oct 29, 2021
 */
public class MainUIController {
    private ToDoModel model = null;
    
    public MainUIController(ToDoModel model){
        this.model = model;
    }
    
    public ListModel<Student> getToDOModel(){
        return this.model;
    }
    
    public void addStudent(String name, String priority){
        boolean add = true;
        Student s;
        for (int i = 0; i < this.model.getSize(); i++){
            s = this.model.getElementAt(i);
            if (s.getName().equals(name)){
                add = false;
            }
        }
        if (add){
            this.model.addStudent(name, priority);
        }
        else{
            System.out.println("The Student's name is identical to another previously entered student name. Please try again");
        }
    }
    
    public void removeStudent(int[] studentIndices){
        this.model.removeStudent(studentIndices);
    }

}