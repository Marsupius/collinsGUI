/*
 * Filename: ToDoModel.java
 * Short description: This program 
 * IST 242 Assignment: .java
 * @author  Joseph Collins
 * @version Oct 29, 2021
 */
package com.mycompany.jtodo.model;

import java.util.ArrayList;
import javax.swing.ListModel;
import javax.swing.event.ListDataEvent;
import static javax.swing.event.ListDataEvent.INTERVAL_ADDED;
import static javax.swing.event.ListDataEvent.INTERVAL_REMOVED;
import javax.swing.event.ListDataListener;

/**
 * @author Joe
 * @version 1.0 Oct 29, 2021
 */
public class ToDoModel implements ListModel<Student> {

    ArrayList<Student> students = null;
    ArrayList<ListDataListener> listeners = null;

    public ToDoModel() {
        this.students = new ArrayList<>();
        this.listeners = new ArrayList<>();
        this.students.add(new Student("James", "high"));
        this.students.add(new Student("Jeffrey", "high"));
        this.students.add(new Student("Joseph", "medium"));
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void addStudent(String description, String priority) {
        this.students.add(new Student(description, priority));
        ListDataListener l;
        for (int i = 0; i < this.listeners.size(); i++) {
            l = this.listeners.get(i);
            l.intervalAdded(
                    new ListDataEvent(this, INTERVAL_ADDED, this.students.size() - 1, this.students.size() - 1)
            );
        }
    }

    public void removeStudent(int[] studentIndices) {
        for (int i = studentIndices.length -1; i >= studentIndices.length; i--) {
            this.students.remove(studentIndices[i]);
            ListDataListener l;
            for (int j = 0; j < this.listeners.size(); j++) {
                l = this.listeners.get(j);
                l.intervalRemoved(
                    new ListDataEvent(this, INTERVAL_REMOVED, studentIndices[i], studentIndices[i])
                );
            }
        }
    }

    @Override
    public int getSize() {
        return this.students.size();
    }

    @Override
    public Student getElementAt(int index) {
        return this.students.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {
        this.listeners.add(l);
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
        this.listeners.remove(l);
    }

}
