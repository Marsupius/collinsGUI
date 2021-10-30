/*
 * Filename: Student.java
 * Short description: This program 
 * IST 242 Assignment: .java
 * @author  Joseph Collins
 * @version Oct 29, 2021
 */

package com.mycompany.jtodo.model;


/**
 * @author Joe
 * @version 1.0 Oct 29, 2021
 */
public class Student {
    // Instance Variables -- define your private data
private String name;
private String priority;



    // Constructors
    public Student(String name, String priority)
    {
       this.name = name;
       this.priority = priority;
    }
    
    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return this.name + ": Priority :" + this.priority;
    }
    
    
}