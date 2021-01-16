/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectakhir;

/**
 *
 * @author Hp
 */
public class MVC {
  ModelSQL Koneksi = new ModelSQL();
  ViewDaftar vd = new ViewDaftar();
  ViewHome vh = new ViewHome();
  ViewPembelian vp = new ViewPembelian();
  ViewInput vi = new ViewInput();
  ViewEdit ve = new ViewEdit();
  ViewTampil vt = new ViewTampil();
 
  
  Model m = new Model();
  
  Controller c = new Controller(vd,vh,vt,ve,vi,vp,m);
}
