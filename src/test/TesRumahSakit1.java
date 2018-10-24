/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.File;
import Model.Pasien2;
import Model.RumahSakit2;

/**
 *
 * @author admin
 */
public class TesRumahSakit1 {
    public static void main(String[] args) {
        Pasien2 pasien1 = new Pasien2();
        pasien1.setNama("Puspa");
        pasien1.setAlamat("klaten");
        
        Pasien2 pasien2 = new Pasien2();
        pasien2.setNama("Adi");
        pasien2.setAlamat("yogya");
        
        RumahSakit2 rs = new RumahSakit2("Panti Rapih","Yogyakarta");
        
        rs.tambahPasienBaru(pasien1);
        rs.tambahPasienBaru(pasien2);
        
        rs.simpanObjekRumahSakit(new File("rsku.dat"));
        
    }
}
