/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestView;


import Model.Pasien2;
import View.TambahPasienBaruDialog;

/**
 *
 * @author admin
 */
public class TestPasien {
     public static void main(String[] args) {
        Pasien2 test = new Pasien2(
        "Puspa", // nama pasien
                "Klaten", // alamat
                "Medan", // tempat lahir
                "19740112", // NIK
                12, // tanggal lahir
                01, // bulan lahir
                1974, // tahun lahir
                74829 );
        
        Pasien2 test1 = new Pasien2(
                 "Budi", // nama pasien
                 "Klaten", // alamat
                 "Klaten", // tempat lahir
                 "19990110", // NIK
                 10, // tanggal lahir
                 01, // bulan lahir
                 1999, // tahun lahir
                 12937
         );
        
       
        
        Pasien2.tambahPasienBaru(test);
        Pasien2.tambahPasienBaru(test1);
        
        for (int i = 0; i < Pasien2.daftar.size(); i++) {
            System.out.println("Nama : "+Pasien2.daftar.get(i).getNama());
        }
        
        Pasien2 cari = Pasien2.cariPasien(19990110);
        System.out.println("Nama Hasil Pencarian = "+cari.getNama());
    }
}

