/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectakhir;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Hp
 */
public class ViewEdit extends JFrame{
    //Kembali
    JButton jbkembali = new JButton("←");
    
    //Header
    JLabel jlheader = new JLabel("Edit Paket");
    JLabel jlheader2 = new JLabel("Masukkan Data Paket yang Baru");
    
    //Kode Paket
    JLabel jlkode = new JLabel("Kode Paket:");
    JTextField jtkode = new JTextField();
    
    //Nama Paket
    JLabel jlpaket = new JLabel("Nama Paket:");
    JTextField jtpaket = new JTextField();
    
    //Maximal Participant
    JLabel jlpartisipan = new JLabel("Maksimal Partisipan:");
    JTextField jtpartisipan = new JTextField();
    
    //Durasi Paket
    JLabel jldurasi = new JLabel("Durasi:");
    JTextField jtdurasi = new JTextField();
    
    //Harga
    JLabel jlharga = new JLabel("Harga:");
    JTextField jtharga = new JTextField();
    
    //Stock
    JLabel jlstok = new JLabel("Stok:");
    JTextField jtstok = new JTextField();
    
    //Edit
    JButton jbedit = new JButton("Edit");
    
    //Tabel
    JTable tabel;
    DefaultTableModel dtm;
    JScrollPane scrollPane;
    Object namaKolom[] = {"Kode", "Paket", "Maks Partisiapan", "Durasi", "Harga", "Stok"};
    
    public ViewEdit(){
        setTitle("Penyewaan Zoom/edit_paket");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(false);
        setLayout(null);
        setSize(1000,600);
        
        dtm = new DefaultTableModel(namaKolom, 0);
        tabel = new JTable(dtm);
        scrollPane = new JScrollPane(tabel);
        
        // setBounds(m,n,o,p)
	// m = posisi x; n = posisi y
	// o = panjang komponen; p = tinggi komponen
        
        //Kembali
        add(jbkembali);
        jbkembali.setBounds(20, 20, 100, 20);
        
        //Header
        add(jlheader);
        jlheader.setBounds(460, 20, 200, 20);
        add(jlheader2);
        jlheader2.setBounds(70, 80, 200, 20);
        
        //Kode Paket
        add(jlkode);
        add(jtkode);
        jlkode.setBounds(60, 120, 100, 20);
        jtkode.setBounds(60, 140, 200, 20);
        
        //Nama Paket
        add(jlpaket);
        add(jtpaket);
        jlpaket.setBounds(60, 180, 100, 20);
        jtpaket.setBounds(60, 200, 200, 20);
        
        //Maksimal Partisipan
        add(jlpartisipan);
        add(jtpartisipan);
        jlpartisipan.setBounds(60, 240, 200, 20);
        jtpartisipan.setBounds(60, 260, 200, 20);
        
        //Durasi Paket
        add(jldurasi);
        add(jtdurasi);
        jldurasi.setBounds(60, 300, 200, 20);
        jtdurasi.setBounds(60, 320, 200, 20);
        
        //Harga
        add(jlharga);
        add(jtharga);
        jlharga.setBounds(60, 360, 200, 20);
        jtharga.setBounds(60, 380, 200, 20);
        
        //Stok
        add(jlstok);
        add(jtstok);
        jlstok.setBounds(60, 420, 200, 20);
        jtstok.setBounds(60, 440, 200, 20);
        
        //Button Edit
        add(jbedit);
        jbedit.setBounds(80, 480, 160, 20);
        
        //Tabel
        add(scrollPane);
        scrollPane.setBounds(340, 80, 600, 380);
        
        
    }
    
      public String getkode()
      {
          return jtkode.getText();
      }
      
      public String getpaket()
      {
          return jtpaket.getText();
      }
      
      public String getmaks()
      {
          return jtpartisipan.getText();
      }
      
      public String getdurasi()
      {
          return jtdurasi.getText();
      }
      
      public String getharga()
      {
          return jtharga.getText();
          
      }
      
      public String getstok()
      {
          return jtstok.getText();
      }
}
