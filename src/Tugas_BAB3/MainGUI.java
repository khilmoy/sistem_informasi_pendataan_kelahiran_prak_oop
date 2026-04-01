/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_BAB3;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class MainGUI {
    public static void main(String[] args) {

        // Set Nimbus Look and Feel
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Jalankan GUI
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                JFrame frame = new JFrame("Sistem Data Kelahiran");

                GUI_Sistem_Data_Kelahiran panel = new GUI_Sistem_Data_Kelahiran();

                frame.setContentPane(panel);
                frame.pack();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}