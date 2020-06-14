/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.world;

import controller.HelloController;
import model.HelloModel;
import view.HelloView;

/**
 *
 * @author riyanto
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        HelloController helloController = new HelloController(
            new HelloModel(), new HelloView()
        );
        
        helloController.start();
    }
    
}
