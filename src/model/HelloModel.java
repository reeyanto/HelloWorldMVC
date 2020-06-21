/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

/**
 *
 * @author riyanto
 */
public class HelloModel {
    
    private final String[] people = {"Adi", "Budi", "Cindy", "Dodi", "Riyanto"};
    //jdbc:mysql://localhost/test?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
    private final String url = "jdbc:mysql://localhost/test?serverTimezone=UTC";
    private final String user= "root";
    private final String pass= "";
    
    public String getPeople() {
        Random random = new Random();
        int arrIndex  = random.nextInt(people.length);
        
        return people[arrIndex];
    }
    
    
    public String getPeopleFromDB() {
        
        try {
            Connection conn = DriverManager.getConnection(url, user, pass);
            PreparedStatement preparedStatement = conn.prepareStatement("SELECT nama FROM siswa");
            ResultSet rs    = preparedStatement.executeQuery();
            
            if(rs.next()) {
                return rs.getString("nama");
            }
            
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
}
