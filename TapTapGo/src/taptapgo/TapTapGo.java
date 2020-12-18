/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taptapgo;

import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Mashaa
 */
public class TapTapGo {

    Timer timer;
    JProgressBar progressBar;

    public TapTapGo() {
      
    }
    
    public void Countdown(){
        progressBar = new JProgressBar(JProgressBar.HORIZONTAL, 0, 5);
        progressBar.setValue(5);
        ActionListener listener = new ActionListener() {
            int counter = 5;
            public void actionPerformed(ActionEvent ae) {
                counter--;
                progressBar.setValue(counter);
                if (counter<1) {
                    JOptionPane.showMessageDialog(null, "Game Started!");
                    timer.stop();
                } 
            }
        };
        timer = new Timer(1000, listener);
        timer.start();
    }
    
    
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater( new Runnable() {
            public void run() {
                TapTapGo cdpb = new TapTapGo();
            }
        });
    }
    
}
