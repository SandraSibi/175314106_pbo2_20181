/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpbo;

/**
 *
 * @author SandraPc
 */
class Klinik {
   private String idKlinik;
    private String nama;
 //  masukan variabel yang dibutuhkan di dalam kelas Klinik , variable bersifat private karena hanya dibutuhkan dan hanya bisa diakses di dalam kelas Klinik saja
    public String getIdKlinik() {
        return idKlinik;
        
            // data get untuk membaca nilai balikan dan menampilkan nilai dari method tersebut
    }

    public void setIdKlinik(String idKlinik) {
        this.idKlinik = idKlinik;
        
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
    
    
}
