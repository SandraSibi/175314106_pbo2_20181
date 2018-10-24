/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import View.DaftarAntrianDialog;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class Pasien extends AntrianPasien {

    private String nama;
    private String alamat;
    private String tempatLahir;
    private String nik;
    private int tanggalLahir;
    private int bulanLahir;
    private int tahunLahir;
    private String NIK;
    private int noRekmedis;

    public static ArrayList<Pasien> daftarPasienKlinik = new ArrayList<Pasien>();

public Pasien(String nama, String almt, String tmptLahir, String nik, int tglLahir, int blnLahir, int thnLahir, int noRekMedis) {
        this.nama = nama;
        this.alamat = almt;
        this.tempatLahir = tmptLahir;
        this.tanggalLahir = tglLahir;
        this.bulanLahir = blnLahir;
        this.tahunLahir = thnLahir;
        this.NIK = nik;
        this.noRekmedis = noRekMedis;
    }
public static void tambahPasienBaru( Pasien pasien){
    pasien.daftarPasienKlinik.add(pasien);
}
public static Pasien cariPasien(int noRekMedis){
    return  null;
    
}
public Pasien() {

}

    public void setNoRekmedis(int noRekmedis) throws NumberFormatException {
        if (noRekmedis < 28 && noRekmedis > 2) {
            this.noRekmedis = noRekmedis;
        } else {
            throw new NumberFormatException("Nomor Rekam Medis dibatasi.....");
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getBulanLahir() {
        return bulanLahir;
    }

    public void setBulanLahir(int bulanLahir) throws Exception {
        if (bulanLahir > 0 && bulanLahir < 13) {
            this.bulanLahir = bulanLahir;
        } else {
            throw new Exception(" Bulan Lahir Anda Tidak Terdeteksi ");
        }
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public void setTanggalLahir(int tanggalLahir) throws Exception {
        if (tanggalLahir > 0 && tanggalLahir < 31) {
            this.tanggalLahir = tanggalLahir;
        } else {
            throw new Exception("salah");
        }
    }

    public int getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTahunLahir(int tahunLahir) throws Exception {
        if (tahunLahir > 0) {
            this.tahunLahir = tahunLahir;
        } else {
            throw new Exception(" Tahun Lahir Anda Tidak Terdeteksi ");
        }
    }
  

    public String getTempatLahir() {
        return tempatLahir;
    }

    public String getNik() {
        return nik;
    }

    public int getTahunLahir() {
        return tahunLahir;
    }

    public String getNIK() {
        return NIK;
    }

    public int getNoRekmedis() {
        return noRekmedis;
    }
    
    public Pasien cariPasien(String NORM){
        return null;
    }
    public static void simpanDaftarPasien(File file){
        try {
            FileOutputStream fos = new FileOutputStream(file);
            for (int i = 0; i < daftarPasienKlinik.size(); i++) {
              String data = daftarPasienKlinik.get(i).toString();
              fos.write(data.getBytes());
                      
            }
            fos.close();
        } catch ( FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE,null,ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void bacaDaftarPasien(File file){
        throw new UnsupportedOperationException("Not supported yet");
    
    }
    public String toString(){
        return noRekmedis+"\t"+nama+"\t"+alamat+"\n";
}

    
    }

    
  

