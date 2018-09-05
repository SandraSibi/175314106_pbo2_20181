/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktek_1;

/**
 *
 * @author SandraPc
 */
public class AntrianPasien{
   private int tanggalAntrian;
   private int bulanAntrian;
   private int tahunAntrian;
    private Klinik klinik ;
    private Pasien daftarPasien[];
     //  masukan variabel yang dibutuhkan di dalam kelas AntrianPasien , variable bersifat private karena hanya dibutuhkan dan hanya bisa diakses di dalam kelas AntrianPasien saja

    public int getTanggalAntrian() {
        return tanggalAntrian;
        
            // data get untuk membaca nilai balikan dan menampilkan nilai dari method tersebut
    }

    public void setTanggalAntrian(int tanggalAntrian) {
        this.tanggalAntrian = tanggalAntrian;
        
        //  data set untuk menampilkan data yang terdapat di kelas tersebut, this menunjukkan variabel = parameter di dalam method  
    }

    public int getBulanAntrian() {
        return bulanAntrian;
        
            // data get untuk membaca nilai balikan dan menampilkan nilai dari method tersebut
    }

    public void setBulanAntrian(int bulanAntrian) {
        this.bulanAntrian = bulanAntrian;
        
        //  data set untuk menampilkan data yang terdapat di kelas tersebut, this menunjukkan variabel = parameter di dalam method  
    }

    public int getTahunAntrian() {
        return tahunAntrian;
        
            // data get untuk membaca nilai balikan dan menampilkan nilai dari method tersebut
    }

    public void setTahunAntrian(int tahunAntrian) {
        this.tahunAntrian = tahunAntrian;
        
        //  data set untuk menampilkan data yang terdapat di kelas tersebut, this menunjukkan variabel = parameter di dalam method  
    }

    public Klinik getKlinik() {
        return klinik;
        
            // data get untuk membaca nilai balikan dan menampilkan nilai dari method tersebut
    }

    public void setKlinik(Klinik klinik) {
        this.klinik = klinik;
        
        //  data set untuk menampilkan data yang terdapat di kelas tersebut, this menunjukkan variabel = parameter di dalam method  
    }

    public Pasien[] getDaftarPasien() {
        return daftarPasien;
        
            // data get untuk membaca nilai balikan dan menampilkan nilai dari method tersebut
    }

    public void setDaftarPasien(Pasien[] daftarPasien) {
        this.daftarPasien = daftarPasien;
        
        //  data set untuk menampilkan data yang terdapat di kelas tersebut, this menunjukkan variabel = parameter di dalam method  
    }
    
    
    
   
    
}
