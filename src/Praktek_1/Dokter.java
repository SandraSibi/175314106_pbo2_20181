/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktek_1;

/**
 *
 * @author admin
 */
public class Dokter {
      private String nomorPegawai;
    private String nama;
    private String alamat;
    private String temptLahir;
    private int tanggalLahir;
     //  masukan variabel yang dibutuhkan di dalam kelas Dokter , variable bersifat private karena hanya dibutuhkan dan hanya bisa diakses di dalam kelas Dokter saja

    public String getNomorPegawai() {
        return nomorPegawai;
        
            // data get untuk membaca nilai balikan dan menampilkan nilai dari method tersebut
    }

    public void setNomorPegawai(String nomorPegawai) {
        this.nomorPegawai = nomorPegawai;
        
        //  data set untuk menampilkan data yang terdapat di kelas tersebut, this menunjukkan variabel = parameter di dalam method  
    }

    public String getNama() {
        return nama; 
        
            // data get untuk membaca nilai balikan dan menampilkan nilai dari method tersebut
    }

    public void setNama(String nama) {
        this.nama = nama;
        
        //  data set untuk menampilkan data yang terdapat di kelas tersebut, this menunjukkan variabel = parameter di dalam method  
    }

    public String getAlamat() {
        return alamat;
        
            // data get untuk membaca nilai balikan dan menampilkan nilai dari method tersebut
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
        
        //  data set untuk menampilkan data yang terdapat di kelas tersebut, this menunjukkan variabel = parameter di dalam method  
    }

    public String getTemptLahir() {
        return temptLahir;
        
            // data get untuk membaca nilai balikan dan menampilkan nilai dari method tersebut
    }

    public void setTemptLahir(String temptLahir) {
        this.temptLahir = temptLahir;
        
        //  data set untuk menampilkan data yang terdapat di kelas tersebut, this menunjukkan variabel = parameter di dalam method  
    }

    public int getTanggalLahir() {
        return tanggalLahir;
        
            // data get untuk membaca nilai balikan dan menampilkan nilai dari method tersebut
    }

    public void setTanggalLahir(int tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
        
        //  data set untuk menampilkan data yang terdapat di kelas tersebut, this menunjukkan variabel = parameter di dalam method  
    }
 
 
    
}
