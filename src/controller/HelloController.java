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
        if(e.getActionCommand().equals("Hit Me")) {
            JOptionPane.showMessageDialog(null, helloModel.getPeople());
        }
    }
    
    public HelloController(HelloModel helloModel, HelloView helloView) {
        this.helloModel = helloModel;
        this.helloView  = helloView;
    }
    
    public void start() {
        this.helloView.btnHitme.addActionListener(this);
        this.helloView.setVisible(true);
        this.helloView.setLocationRelativeTo(null);
        this.helloView.setResizable(false);
        this.helloView.jPanel1.setBackground(Color.red);
    }
    
}
