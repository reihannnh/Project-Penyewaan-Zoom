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
public class ViewTampil extends JFrame {
    //Kembali
    JButton jbkembali = new JButton("←");
    
    //Header
    JLabel jlheader = new JLabel("Daftar Paket");
    
    //Table
    JTable tabel;
    DefaultTableModel dtm;
    JScrollPane scrollPane;
    Object namaKolom[] = {"Tanggal", "Nama", "Paket", "Durasi", "Harga"};
    
    //Button Menu
    JButton jbmenu = new JButton("Menu");
    
    public ViewTampil(){
        setTitle("Penyewaan Zoom/riwayat_transaksi");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(false);
        setLayout(null);
        setSize(1000,600);
        
        //Kembali
        add(jbkembali);
        jbkembali.setBounds(20, 20, 100, 20);
        
        dtm = new DefaultTableModel(namaKolom, 0);
        tabel = new JTable(dtm);
        scrollPane = new JScrollPane(tabel);
        //Header
        add(jlheader);
        jlheader.setBounds(460, 20, 200, 20);
        //Tabel
        add(scrollPane);
        scrollPane.setBounds(200, 60, 600, 380);
        
        //Pembelian
        add(jbmenu);
        jbmenu.setBounds(400, 480, 200, 20);
    }
}
