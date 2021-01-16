/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projectakhir;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

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
           }
       });
       
        vh.jbriwayat.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
              vh.setVisible(false);
              vt.setVisible(true);
           }
       });
        
        vh.jbpembelian.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
              vh.setVisible(false);
              vp.setVisible(true);
           }
       });
      
   }
}
