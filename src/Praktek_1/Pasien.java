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
public class Pasien {
 private  int noRekamMedis;
    private String nama;
   private  String alamat;
    private String tempatLahir;
    private int tanggalLahir;
    private int bulanLahir;
    private int tahunLahir;
    //  masukan variabel yang dibutuhkan di dalam kelas pasien , variable bersifat private karena hanya dibutuhkan dan hanya bisa diakses di dalam kelas pasien saja
   
   

    public int getNoRekamMedis() {
        return noRekamMedis;
        
        // data get untuk membaca nilai balikan dan menampilkan nilai dari method tersebut
    }

    

    public void setNoRekamMedis(int noRekamMedis) throws Exception{
        if (noRekamMedis >= 6  &&  noRekamMedis <= 20) {
            this.noRekamMedis = noRekamMedis;
            
        } else {
            throw new Exception("Nomor Rekam Medis Salah");
        }
        
        // data set untuk menampil data yang terdapat di kelas method tersebut ,  kita gunakan throws untuk melempar suatu exception dalam program
       //  jika gunakan if else untuk melihat no rekam medis yang dimasukan benar atau salah, jika benar maka if yang akan dijalankan sedangkan salah maka else yang akan di jalankan.
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

    public String getTempatLahir() {
        return tempatLahir;
        
            // data get untuk membaca nilai balikan dan menampilkan nilai dari method tersebut
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
        
         //  data set untuk menampilkan data yang terdapat di kelas tersebut, this menunjukkan variabel = parameter di dalam method  
    }

    public int getTanggalLahir() {
       return tanggalLahir;
       
           // data get untuk membaca nilai balikan dan menampilkan nilai dari method tersebut
    }

    public void setTanggalLahir(int tanggalLahir) throws Exception {
       if (tanggalLahir >= 1 &&  tanggalLahir <= 31) {
          this.tanggalLahir = tanggalLahir;
        } else {
            throw new Exception("Nomor Rekam Medis Salah");
        }
       // data set untuk menampil data yang terdapat di kelas method tersebut ,  kita gunakan throws untuk melempar suatu exception dalam program
       //  jika gunakan if else untuk melihat tanggal lahir yang dimasukan benar atau salah, jika benar maka if yang akan dijalankan sedangkan salah maka else yang akan di jalankan.
       
    }

    public int getBulanLahir() {
        return bulanLahir;
        
            // data get untuk membaca nilai balikan dan menampilkan nilai dari method tersebut
    }

    public void setBulanLahir(int bulanLahir) throws Exception{
           if (bulanLahir >= 1 &&  bulanLahir <= 12) {
          this.bulanLahir = bulanLahir;
        } else {
          throw new Exception ("Bulan Lahir Salah");
        }
       
             // data set untuk menampil data yang terdapat di kelas method tersebut ,  kita gunakan throws untuk melempar suatu exception dalam program
       //  jika gunakan if else untuk melihat bulan lahir yang dimasukan benar atau salah, jika benar maka if yang akan dijalankan sedangkan salah maka else yang akan di jalankan.
    }

    public int getTahunLahir() {
        return tahunLahir;
        
            // data get untuk membaca nilai balikan dan menampilkan nilai dari method tersebut
    }

    public void setTahunLahir(int tahunLahir) throws Exception{
        if(tahunLahir  >= 1) {
        this.tahunLahir = tahunLahir;
        
    } else {
      throw new Exception(" Tahun lahir salah");
} 
} 
    // data set untuk menampil data yang terdapat di kelas method tersebut ,  kita gunakan throws untuk melempar suatu exception dalam program
       //  jika gunakan if else untuk melihat tahun lahir yang dimasukan benar atau salah, jika benar maka if yang akan dijalankan sedangkan salah maka else yang akan di jalankan.
}  


