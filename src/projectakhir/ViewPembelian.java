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
public class ViewPembelian extends JFrame{
    //Header
    JLabel jlheader = new JLabel("Daftar Paket");
    JLabel jlheader2 = new JLabel("Masukkan Data Pembeli");
    
    //Kembali
    JButton jbkembali = new JButton("←");
    //Table
    JTable tabel;
    DefaultTableModel dtm;
    JScrollPane scrollPane;
    Object namaKolom[] = {"Kode", "Paket", "Maks Partisiapan", "Durasi", "Harga", "Stok"};
    
    //Input Nama Pembeli
    JLabel jlnama = new JLabel("Nama");
    JTextField jtnama = new JTextField();
    //Input Nomor Telpon Pembeli
    JLabel jlnotlp = new JLabel("Nomor Telpon");
    JTextField jtnotlp = new JTextField();
    //Input Alamat Pembeli
    JLabel jlalamat = new JLabel("Alamat");
    JTextField jtalamat = new JTextField();
    //Input Tanggal Pembelian
    JLabel jltanggal = new JLabel("Tanggal Pembelian");
    JTextField jttanggal = new JTextField();
    
    //Button Pembelian
    JButton jbpembelian = new JButton("Pembelian");
    
    public ViewPembelian(){
        setTitle("Penyewaan Zoom/pembelian");
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
        
        //Header
        add(jlheader);
        jlheader.setBounds(460, 20, 200, 20);
        
        //Kembali
        add(jbkembali);
        jbkembali.setBounds(20, 20, 100, 20);
        //Tabel
        add(scrollPane);
        scrollPane.setBounds(200, 60, 600, 220);
        
        //Header 2
        add(jlheader2);
        jlheader2.setBounds(440, 300, 200, 20);
        
        //Nama
        add(jlnama);
        add(jtnama);
        jlnama.setBounds(320, 340, 100, 20);
        jtnama.setBounds(460, 340, 220, 20);
        
        //Nomor Telpon
        add(jlnotlp);
        add(jtnotlp);
        jlnotlp.setBounds(320, 380, 200, 20);
        jtnotlp.setBounds(460, 380, 220, 20);
        
        //Alamat
        add(jlalamat);
        add(jtalamat);
        jlalamat.setBounds(320, 420, 200, 20);
        jtalamat.setBounds(460, 420, 220, 20);
        
        //
        add(jltanggal);
        add(jttanggal);
        jltanggal.setBounds(320, 460, 200, 20);
        jttanggal.setBounds(460, 460, 220, 20);
        
        //Pembelian
        add(jbpembelian);
        jbpembelian.setBounds(420, 520, 200, 20);
    }
}
