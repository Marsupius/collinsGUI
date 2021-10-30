/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.MainUIController;
import com.mycompany.jtodo.model.Student;
import java.awt.event.WindowEvent;


/**
 *
 * @author Joe
 */
public class MainUI extends javax.swing.JFrame {
    
    private MainUIController controller = null;
    /**
     * Creates new form MainUI
     */
    public MainUI(MainUIController controller) {
        this.controller = controller;
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonsPanel = new javax.swing.JPanel();
        addStudentButton = new javax.swing.JButton();
        deleteStudentButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        todoList = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addStudentButton.setText("Add Student");
        addStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentButtonActionPerformed(evt);
            }
        });
        buttonsPanel.add(addStudentButton);

        deleteStudentButton.setText("Delete Student");
        deleteStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteStudentButtonActionPerformed(evt);
            }
        });
        buttonsPanel.add(deleteStudentButton);

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        buttonsPanel.add(exitButton);

        getContentPane().add(buttonsPanel, java.awt.BorderLayout.PAGE_START);

        jList1.setModel(this.controller.getToDOModel());
        todoList.setViewportView(jList1);

        getContentPane().add(todoList, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_exitButtonActionPerformed

    private void addStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentButtonActionPerformed
        AddNewStudentView addNewTaskView = new AddNewStudentView(this, true, this.controller);
        addNewTaskView.setVisible(true);
    }//GEN-LAST:event_addStudentButtonActionPerformed

    private void deleteStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteStudentButtonActionPerformed
        int[] studentIndices = this.todoList.getSelectedIndices();
        this.controller.removeStudent(studentIndices);
    }//GEN-LAST:event_deleteStudentButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStudentButton;
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JButton deleteStudentButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JList<com.mycompany.jtodo.model.Student> jList1;
    private javax.swing.JScrollPane todoList;
    // End of variables declaration//GEN-END:variables
}