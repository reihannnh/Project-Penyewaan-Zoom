/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projectakhir;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * dont forget to take a break and sruput a cup of a coffee ya Reyhan !!
 */
public class Controller  {
   ViewDaftar vd;
   Model md;
   ViewHome vh;
   ViewTampil vt;
   ViewPembelian vp;
   ViewInput vi;
   ViewEdit ve;
   
   public Controller(ViewDaftar Vd,ViewHome Vh,ViewTampil Vt,ViewEdit Ve,ViewInput Vi,ViewPembelian Vp,Model m)
   {
       this.vd = Vd;
       this.md = m;
       this.vh = Vh;
       this.vt = Vt;
       this.vi = Vi;
       this.ve = Ve;
       this.vp = Vp;
               
       
     
       
        vd.jblogin.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) 
           {
                 String username = vd.getusername();
                 String password = vd.getpassword();
                if(md.login(username, password))
                    {
                         JOptionPane.showMessageDialog(null,"Sukses");
                         vh.setVisible(true);
                         vd.dispose();
                    }
       
                else
                {
                     JOptionPane.showMessageDialog(null,"Login gagal");
                     vd.jtusername.setText("");
                     vd.jppassword.setText("");

                }
           }
       });
        
      vh.jbinput.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
              vh.setVisible(false);
              vi.setVisible(true);
           }
       });
      
       vh.jbedit.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
              vh.setVisible(false);
              ve.setVisible(true);
              
              String data[][] = m.getpaket();
              ve.tabel.setModel(new JTable(data, vp.namaKolom).getModel());
              
              ve.jtkode.setEditable(false);
              ve.jtpaket.setEditable(false);
              ve.jtpartisipan.setEditable(false);
              ve.jtdurasi.setEditable(false);
              ve.jtharga.setEditable(false);
              ve.jtstok.setEditable(false);
           }
       });
       
        vh.jbriwayat.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
              vh.setVisible(false);
              vt.setVisible(true);
              
              String data[][] = m.getpembelian();
              vt.tabel.setModel(new JTable(data, vt.namaKolom).getModel());
           }
       });
        
        vh.jbpembelian.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
              vh.setVisible(false);
              vp.setVisible(true);
              
                String data[][] = m.getpaket();
                vp.tabel.setModel(new JTable(data, vp.namaKolom).getModel());
        
           }
       });
       
       vp.jbkembali.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
              vp.setVisible(false);
              vh.setVisible(true);
           }
       });
       
       vi.jbkembali.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
              vi.setVisible(false);
              vh.setVisible(true);
           }
       });
       
       ve.jbkembali.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
              ve.setVisible(false);
              vh.setVisible(true);
           }
       });
       
       vt.jbkembali.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
              vt.setVisible(false);
              vh.setVisible(true);
           }
       });
       
       vi.jbtambah.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               String kode = vi.getkode();
               String nama = vi.getnama();
               String maks = vi.getmaksparticipant();
               String durasi = vi.getdurasi();
               String harga = vi.getharga();
               String stok = vi.getstok();
             if(m.inputpaket(kode, nama, maks, durasi, harga, stok))
                 JOptionPane.showMessageDialog(vi, "Sukses");
             else
                 JOptionPane.showMessageDialog(vi, "Gagal, Data sudah ada");
           }
       });
         vp.tabel.addMouseListener(new java.awt.event.MouseAdapter()
       {
           @Override
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    int baris = vp.tabel.getSelectedRow();
                    
                    
                    String stok = vp.tabel.getModel().getValueAt(baris, 5).toString();
                    if(stok=="Habis")
                    {
                        vp.jbpembelian.setEnabled(false);
                        vp.jtalamat.setEditable(false);
                        vp.jtnama.setEditable(false);
                        vp.jtnotlp.setEditable(false);
                        vp.jttanggal.setEditable(false);
                        vp.jbpembelian.setText("Stok Kosong");
                    }
                    else
                    {
                        vp.jbpembelian.setEnabled(true);
                        vp.jtalamat.setEditable(true);
                        vp.jtnama.setEditable(true);
                        vp.jtnotlp.setEditable(true);
                        vp.jttanggal.setEditable(true);
                        vp.jbpembelian.setText("Pembelian");
                    }
                            
                  
                }
                
       });
       vp.jbpembelian.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               try {
                   int baris = vp.tabel.getSelectedRow();
                   
                   
                   String kode = vp.tabel.getModel().getValueAt(baris, 0).toString();
                   String nama = vp.getnama();
                   String Notelp = vp.getnomertelepon();
                   String Alamat = vp.getalamat();
                   String TanggalPembelian = vp.gettanggalpembelian();
                   
                   m.inputpembelian(kode, nama, Notelp, Alamat, TanggalPembelian);
                   
                    String data[][] = m.getpaket();
                  vp.tabel.setModel(new JTable(data, vp.namaKolom).getModel());
                
               } catch (SQLException ex) {
                   System.out.println(ex.getMessage());
               }
           }
       });
       
       ve.tabel.addMouseListener(new java.awt.event.MouseAdapter()
       {
           @Override
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    int baris = ve.tabel.getSelectedRow();
                        
                    String kode = ve.tabel.getModel().getValueAt(baris, 0).toString();
                    String paket = ve.tabel.getModel().getValueAt(baris, 1).toString();
                    String maks = ve.tabel.getModel().getValueAt(baris, 2).toString();
                    String durasi = ve.tabel.getModel().getValueAt(baris, 3).toString();
                    String harga = ve.tabel.getModel().getValueAt(baris, 4).toString();
                    String stok = ve.tabel.getModel().getValueAt(baris, 5).toString();
                    
                    ve.jtkode.setText(kode);
                    ve.jtkode.setEditable(false);
                    ve.jtpaket.setText(paket);
                    ve.jtpartisipan.setText(maks);
                    ve.jtdurasi.setText(durasi);
                    ve.jtharga.setText(harga);
                    ve.jtstok.setText(stok);
                    
                     ve.jtpaket.setEditable(true);
              ve.jtpartisipan.setEditable(true);
              ve.jtdurasi.setEditable(true);
              ve.jtharga.setEditable(true);
              ve.jtstok.setEditable(true);
                    
         }
        });
       
       ve.jbedit.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
              String kode = ve.getkode();
              String nama = ve.getpaket();
              String maks = ve.getmaks();
              String durasi = ve.getdurasi();
              String harga = ve.getharga();
              String stok = ve.getstok();
              m.editpaket(kode, nama, maks, durasi, harga, stok);
              
              String[][] data = m.getpaket();
              ve.tabel.setModel(new JTable(data, ve.namaKolom).getModel());
           }
       });
       
      
   }
}
