/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hiline;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Sajith Reshan
 */
public class DB {
    static Connection c;
    public static Connection getConnection () throws Exception{
    
            if ( c == null ) {
                Class.forName ( " com.mysql.jdbc.Driver " ) ;
                c= DriverManager.getConnection( " jdbc:mysql : // localhost : 3306 / hiline "," root "," 1234 " ) ;
            }
              
             return c ;
                
 
}
}
