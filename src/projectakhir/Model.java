/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projectakhir;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * dont forget to take a break and sruput a cup of a coffee ya Reyhan !!
 */
public class Model extends ModelSQL {
   String username,password;
     
      protected boolean login(String username,String password)
      {
       boolean sukses=false;
         try{
            String cek = "SELECT count(*) as jumlah from user where username='"+username+"' and password ='"+password+"'";
            statement = (Statement) koneksi.createStatement();
             ResultSet hasil = statement.executeQuery(cek);
               hasil.next();
               System.out.println(username);
               if(hasil.getInt("jumlah")==1)
               {
                   sukses=true;
               }
               
               else
                   
               {
                   sukses=false;
               }
                     
            
            
            
            } 
         catch (SQLException ex) {
             System.out.println(ex.getMessage());
       }
        return sukses;
      }
      
      
}
