/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.HelloModel;
import view.HelloView;

/**
 *
 * @author riyanto
 */
public class HelloController implements ActionListener {

    private final HelloModel helloModel;
    private final HelloView helloView;
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String text = null;
        
        if(e.getActionCommand().equals("Hit Me")) {
            text = "Hello, World! " + helloModel.getPeople() + " was here!";
        }
        else if(e.getActionCommand().equals("Load Data")) {
            text = "I'm here, " + helloModel.getPeopleFromDB();
        }        
        JOptionPane.showMessageDialog(helloView, text);
    }
    
    public HelloController() {
        this.helloModel = new HelloModel();
        this.helloView  = new HelloView();
    }
    
    public void start() {
        helloView.btnHitme.addActionListener(this);
        helloView.btnLoadData.addActionListener(this);
        helloView.setVisible(true);
        helloView.setLocationRelativeTo(null);
        helloView.setResizable(false);
        helloView.jPanel1.setBackground(Color.red);
    }
    
}
