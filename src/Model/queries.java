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
        Contrall.DB.con().createStatement().executeUpdate("Insert into user values('"+field[0]+"','" + field[1] + "','" + field[2] + "','" + field[3] +"','"+field[4]+"','"+field[5]+"','" + field[6] + "','" + field[7] + "','" + field[8] +"','"+field[9]+"','"+field[10]+"','" + field[11] + "','" + field[12] + "')");
        System.out.println(field[3]);
    
       } public static void subssave(String table,String column,String value) throws Exception{
           
            DB.con().createStatement().executeUpdate("INSERT INTO " + table + " ("+column+") VALUES('"+value+"')");
            
        }
    
       public static void AdressSave(String table,String value[]) throws Exception{
           
            DB.con().createStatement().executeUpdate("INSERT INTO " + table + " (ADDRESS_NO,ADDRESS_STREET,ADDRESS_CITY, ADDRESS_COUNTRY) VALUES('"+value[0]+"','"+value[1]+"','"+value[2]+"','"+value[3]+"')");
            
        }public static void foreighnsave(String table,String[]column,String[] value) throws Exception{
           
            DB.con().createStatement().executeUpdate("INSERT INTO " + table + " ("+column[0]+","+column[1]+") VALUES('"+value[0]+"','"+value[1]+"')");
            
        }
    
    
}
