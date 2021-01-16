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
public class ViewHome extends JFrame{
    //Header
    JLabel jlheader = new JLabel("MENU");
    
    //Button
    JButton jbpembelian = new JButton("Pembelian");
    JButton jbinput = new JButton("Input Paket");
    JButton jbedit = new JButton("Edit Paket");
    JButton jbriwayat = new JButton("Riwayat Transaksi");
    public ViewHome(){
        setTitle("Penyewaan Zoom");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(false);
        setLayout(null);
        setSize(1000,600);
        
        // setBounds(m,n,o,p)
	// m = posisi x; n = posisi y
	// o = panjang komponen; p = tinggi komponen
        //Header
        add(jlheader);
        jlheader.setBounds(460, 160, 200, 20);
        //Pembelian
        add(jbpembelian);
        jbpembelian.setBounds(380, 200, 200, 20);
        //Input
        add(jbinput);
        jbinput.setBounds(380, 240, 200, 20);
        //Edit
        add(jbedit);
        jbedit.setBounds(380, 280, 200, 20);
        //Riwayat
        add(jbriwayat);
        jbriwayat.setBounds(380, 320, 200, 20);
    }
}
