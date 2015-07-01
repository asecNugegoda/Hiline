/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import Contrall.DB;


/**
 *
 * @author Sj
 */
public class queries{
    public static void Save(String table,String[] field) throws Exception{
        System.out.println("at save");
        Contrall.DB.con().createStatement().executeUpdate("Insert into" +table+ "values('"+field[0]+"','" + field[1] + "','" + field[2] + "','" + field[3] +"','"+field[4]+"')");
        System.out.println(field[3]);
    
       } public static void subssave(String table,String column,String value) throws Exception{
           
            DB.con().createStatement().executeUpdate("INSERT INTO " + table + " ("+column+") VALUES('"+value+"')");
            
        }
    
}
