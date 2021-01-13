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
public class ViewDaftar extends JFrame {
    //Header
    JLabel jlheader = new JLabel("SISTEM INFORMASI");
    JLabel jlheader2 = new JLabel("PENYEWAAN ZOOM");
    
    //Username
    JTextField jtusername = new JTextField("Username");
    JPasswordField jppassword = new JPasswordField("Password");
    //Password
    JButton jblogin = new JButton("Login");
    JButton jbdaftar = new JButton("Daftar");
    
    public ViewDaftar()
    {
        setTitle("Penyewaan Zoom");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(1000,600);
        
        // setBounds(m,n,o,p)
	// m = posisi x; n = posisi y
	// o = panjang komponen; p = tinggi komponen
        
        //Header
        add(jlheader);
        jlheader.setBounds(420, 140, 200, 20);
        add(jlheader2);
        jlheader2.setBounds(420, 160, 200, 20);
        //Username
        add(jtusername);
        jtusername.setBounds(380, 200, 200, 20);
        //Password
        add(jppassword);
        jppassword.setBounds(380, 240, 200, 20);
        //Login
        add(jblogin);
        jblogin.setBounds(380, 280, 200, 20);
        //Daftar
        add(jbdaftar);
        jbdaftar.setBounds(380, 320, 200, 20);
    }
}
