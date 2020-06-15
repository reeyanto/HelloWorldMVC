/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Random;

/**
 *
 * @author riyanto
 */
public class HelloModel {
    
    String[] people = {"Adi", "Budi", "Cindy", "Dodi", "Riyanto"};
    
    public String getPeople() {
        Random random = new Random();
        int arrIndex  = random.nextInt(people.length);
        
        return "Hello, World! " + people[arrIndex] + " was here!";
    }
    
}
