/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Contrall;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Sj
 */
public class DB {
    public static Connection con()throws Exception{
        System.out.println("at connetion");
              Class.forName("com.mysql.jdbc.Driver");
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/hiline","root","123");
        return c;
        
    
      
    }  
    }
    

