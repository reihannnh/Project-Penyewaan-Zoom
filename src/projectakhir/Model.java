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
      
      public boolean inputpaket(String kode, String nama, String maks, String durasi, String harga, String stok) 
      {
         boolean status=false;
       try {
           String input = "insert into paket (kode,nama,maks_participant,durasi,harga,stok) VALUES ('" + kode + "','" + nama + "','" + maks + "','" + durasi + "','" + harga + "','" + stok + "')";
           statement = (Statement) koneksi.createStatement();
           statement.execute(input);
           status=true;
       } catch (SQLException ex) {
           System.out.println(ex.getMessage());
       }
       return status;
      }
      
      public int getjumlahpaket()
        {
            int jumlah=0;
       try {
           String cek = "select count(*) as jumlah from paket";
           statement = (Statement) koneksi.createStatement();
           ResultSet hasil = statement.executeQuery(cek);
           hasil.next();
           jumlah=hasil.getInt("jumlah");
           return jumlah;
       } catch (SQLException ex) {
           System.out.println(ex.getMessage());
       }
          return  jumlah;
        }
      
      public String[][] getpaket()
      {
             String data[][] = new String[getjumlahpaket()][6]; //baris, kolom nya ada 3

       try {
           int jmlData=0;
           String query = "Select * from paket";
           ResultSet resultSet = statement.executeQuery(query);
           while (resultSet.next()){
              
               data[jmlData][0] = resultSet.getString("kode"); //harus sesuai nama kolom di mysql
               data[jmlData][1] = resultSet.getString("nama");
               data[jmlData][2] = resultSet.getString("maks_participant");
               data[jmlData][3] = resultSet.getString("durasi");
               data[jmlData][4] = resultSet.getString("harga");
               data[jmlData][5] = resultSet.getString("stok");
               
              
               if("0".equals(resultSet.getString("stok")))
               {
                   data[jmlData][5] = "Habis";
               }
               
               jmlData++;
           }
           return data;
       } catch (SQLException ex) {
           System.out.println(ex.getMessage());
       }
       return data;
      }
      
      public void inputpembelian(String kode,String nama,String Notelp,String Alamat,String TanggalPembelian) throws SQLException
      {
          String query = "insert into pembelian (Nama,Alamat,NoTelp,Kode,Tanggal) Values ('"+nama+"','"+Alamat+"','"+Notelp+"','"+kode+"','"+TanggalPembelian+"')";
          statement = (Statement) koneksi.createStatement();
          statement.execute(query);
          
          String query1 = "update paket set stok=stok-1 where kode = '"+kode+"'";
          statement = (Statement) koneksi.createStatement();
          statement.execute(query1);
      }
      
      public void editpaket(String kode, String nama, String maks, String durasi, String harga, String stok)
      {
       try {
           String query = "update paket set nama = '"+nama+"', maks_participant='"+maks+"', durasi = '"+durasi+"', harga = ' "+harga+"', stok = '" + stok + "' where kode = '"+kode+"'";
           statement = (Statement) koneksi.createStatement();
           statement.executeUpdate(query);
       } catch (SQLException ex) {
            System.out.println(ex.getMessage());
       }
      }
      
      public String[][] getpembelian()
      {
          String[][] data = new String[getjumlahpembelian()][5];
       try {
           int jmlData=0;
           String query = "select * from pembelian inner join paket on pembelian.kode = paket.kode";
           ResultSet resultSet = statement.executeQuery(query);
           while (resultSet.next()){
               data[jmlData][0] = resultSet.getString("Tanggal"); //harus sesuai nama kolom di mysql
               data[jmlData][1] = resultSet.getString("Nama");
               data[jmlData][2] = resultSet.getString("kode");
               data[jmlData][3] = resultSet.getString("durasi");
               data[jmlData][4] = resultSet.getString("harga");
               jmlData++;
           }
       } catch (SQLException ex) {
           System.out.println(ex.getMessage());
       }
       return data;
      }
      
      public int getjumlahpembelian()
      {
          int jumlah=0;
       try {
           String cek = "select count(*) as jumlah from pembelian";
           statement = (Statement) koneksi.createStatement();
           ResultSet hasil = statement.executeQuery(cek);
           hasil.next();
           jumlah=hasil.getInt("jumlah");
           return jumlah;
       } catch (SQLException ex) {
           System.out.println(ex.getMessage());
       }
          return  jumlah;
        }
      
}
              
            
