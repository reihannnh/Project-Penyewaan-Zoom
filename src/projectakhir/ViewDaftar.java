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
    JLabel jlusername = new JLabel("Username");
    JTextField jtusername = new JTextField();
    JPasswordField jppassword = new JPasswordField();
    //Password
    JLabel jlpassword = new JLabel("Password");
    JButton jblogin = new JButton("Login");
    JButton jbdaftar = new JButton("Daftar");
    
    public ViewDaftar()
    {
        setTitle("Penyewaan Zoom/login");
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
        add(jlusername);
        add(jtusername);
        jlusername.setBounds(450, 200, 200, 20);
        jtusername.setBounds(380, 220, 200, 20);
        //Password
        add(jlpassword);
        add(jppassword);
        jlpassword.setBounds(450, 240, 200, 20);
        jppassword.setBounds(380, 260, 200, 20);
        //Login
        add(jblogin);
        jblogin.setBounds(380, 300, 200, 20);
        //Daftar
       // add(jbdaftar);
        //jbdaftar.setBounds(380, 320, 200, 20);
       
       
        
    }
    
    public String getusername()
    {
        return jtusername.getText();
    }
    
     public String getpassword()
    {
        return jppassword.getText();
    }
     
    
}
