/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import Model.Pasien2;
import java.io.File;

/**
 *
 * @author admin
 */
public class TestStream {

    public static void main(String[] args) {
        Pasien2 test = new Pasien2();
        test.setNama("puspa");
        test.setAlamat("klaten");
        //test.setNoRekmedis("001");

        Pasien2 test1 = new Pasien2();
        //test1.setNoRekmedis("001");
        test1.setNama("adi");
        test1.setAlamat("klaten");

        System.out.println(test.toString());
        System.out.println(test1.toString());

        Pasien2.tambahPasienBaru(test);
        Pasien2.tambahPasienBaru(test1);

        Pasien2.simpanDaftarPasien(new File("daftar.txt"));
    }
}
