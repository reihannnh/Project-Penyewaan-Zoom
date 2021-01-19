/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectakhir;

import javax.swing.*;
/**
 *
 * @author Hp
 */
public class ViewInput extends JFrame {
    //Header
    JLabel jlheader = new JLabel("Tambahkan Paket Zoom");
    
    //Kembali
    JButton jbkembali = new JButton("←");
    
    //Kode Paket
    JLabel jlkode = new JLabel("Kode:");
    JTextField jtkode = new JTextField();
    
    //Nama Paket
    JLabel jlpaket = new JLabel("Nama:");
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
    
    //Tambahkan
    JButton jbtambah = new JButton("Tambahkan");
    
    public ViewInput(){
        setTitle("Penyewaan Zoom/input_paket");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(false);
        setLayout(null);
        setSize(1000,600);
        
        // setBounds(m,n,o,p)
	// m = posisi x; n = posisi y
	// o = panjang komponen; p = tinggi komponen
        
        //Header
        add(jlheader);
        jlheader.setBounds(380, 60, 200, 20);
        
        //Kembali
        add(jbkembali);
        jbkembali.setBounds(20, 20, 100, 20);
        
        //Nama Paket
        add(jlkode);
        add(jtkode);
        jlkode.setBounds(360, 100, 200, 20);
        jtkode.setBounds(360, 120, 200, 20);
        
        //Nama Paket
        add(jlpaket);
        add(jtpaket);
        jlpaket.setBounds(360, 160, 200, 20);
        jtpaket.setBounds(360, 180, 200, 20);
        
        //Maksimal Partisipan
        add(jlpartisipan);
        add(jtpartisipan);
        jlpartisipan.setBounds(360, 220, 200, 20);
        jtpartisipan.setBounds(360, 240, 200, 20);
        
        //Durasi Paket
        add(jldurasi);
        add(jtdurasi);
        jldurasi.setBounds(360, 280, 200, 20);
        jtdurasi.setBounds(360, 300, 200, 20);
        
        //Harga 
        add(jlharga);
        add(jtharga);
        jlharga.setBounds(360, 340, 200, 20);
        jtharga.setBounds(360, 360, 200, 20);
        
        //Stok
        add(jlstok);
        add(jtstok);
        jlstok.setBounds(360, 400, 200, 20);
        jtstok.setBounds(360, 420, 200, 20);
        
        //Button Tambah
        add(jbtambah);
        jbtambah.setBounds(400, 460, 120, 20);
        
        
       
    }
    
     public String getkode()
        {
            return jtkode.getText();
        }
     
     public String getnama()
     {
         return jtpaket.getText();
     }
     
     public String getmaksparticipant()
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

