/*
 * Filename: ToDoApp.java
 * Short description: This program 
 * IST 242 Assignment: .java
 * @author  Joseph Collins
 * @version Oct 29, 2021
 */

package com.mycompany.jtodo;

import Controller.MainUIController;
import View.MainUI;
import com.mycompany.jtodo.model.ToDoModel;


/**
 * @author Joe
 * @version 1.0 Oct 29, 2021
 */
public class ToDoApp {
    public static void main (String[] args){
        System.out.println("JToDo App");
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ToDoModel model = new ToDoModel();
                MainUIController controller = new MainUIController(model);
                MainUI view = new MainUI(controller);
                view.setVisible(true);
            }
        });
    }

}