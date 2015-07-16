/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import Contrall.DB;
import java.sql.ResultSet;

/**
 *
 * @author Sj
 */
public class SearchQuaries {
    public static ResultSet idsearch(String column,String table) throws Exception{
        System.out.println("at search");
        ResultSet rs = DB.con().createStatement().executeQuery("Select ("+column+") from "+table+"");
        
        return rs;
    }
   public static ResultSet Columsearch(String column,String table,String id) throws Exception{
        System.out.println("at search");
        ResultSet rs = DB.con().createStatement().executeQuery("Select "+column+" from "+table+"");
        
        return rs;
    }
        public static ResultSet DataSeach(String table) throws Exception{
        ResultSet rs = DB.con().createStatement().executeQuery("select * from "+table+" ");
        
        return rs;
        
        }
        public static ResultSet adresearch(String table,String id) throws Exception{
        System.out.println("at search");
        ResultSet rs = DB.con().createStatement().executeQuery("Select * from "+table+" ");
        
        return rs;
    }        public static ResultSet likeSearch(String table,String id) throws Exception{
        System.out.println("at search");
        ResultSet rs = DB.con().createStatement().executeQuery("Select * from "+table+" where USER_NIC LIKE '" + id + "%' ");
        
        return rs;
                
                
    } public static ResultSet Logger(String username) throws Exception{
        System.out.println("at search");
        ResultSet rs = DB.con().createStatement().executeQuery("Select *  from user_username where USER_USERNAME_NAME='"+ username +"' ");
        
        return rs;
                
                
    }public static ResultSet ColumnidSearch(String column,String Table,String colid,String id) throws Exception{
        System.out.println("at search");
        ResultSet rs = DB.con().createStatement().executeQuery("Select "+column+"  from "+Table+" where "+colid+" = '"+ id +"' ");
        
        return rs;
                
                
    }
    
    
}
