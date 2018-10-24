/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author SandraPc
 */
public class AntrianPasien{
   private int tanggalAntrian;
   private int bulanAntrian;
   private int TahunAntrian;
   private Klinik klinik ;
   private Pasien2 daftarPasien[];
   
   public AntrianPasien() {   }
   

   public void mendaftar(Pasien2 pasien){
      
}

    public void setTanggalAntrian(int tanggalAntrian) throws Exception{
        if (tanggalAntrian < 32 && tanggalAntrian > 0) {
            this.tanggalAntrian = tanggalAntrian;
            
        }else { throw new Exception(" tanggal salah");
        
        }
    }

    public void setBulanAntrian(int bulanAntrian) throws Exception{
        if (bulanAntrian < 13 && bulanAntrian > 0) {
        this.bulanAntrian = bulanAntrian;
    }else{ throw new Exception(" bulan salah");
        }
    }

    public void setTahunAntrian(int TahunAntrian) throws Exception{
        if (TahunAntrian > 0) {
        this.TahunAntrian = TahunAntrian;
        
    } else { throw new Exception(" tahun salah");
    
        }
    }

    public void setKlinik(Klinik klinik) {
        this.klinik = klinik;
    }

    public void setDaftarPasien(Pasien2[] daftarPasien) {
        this.daftarPasien = daftarPasien;
    }

    public int getTanggalAntrian() {
        return tanggalAntrian;
    }

    public int getBulanAntrian() {
        return bulanAntrian;
    }

    public int getTahunAntrian() {
        return TahunAntrian;
    }

    public Klinik getKlinik() {
        return klinik;
    }

    public Pasien2[] getDaftarPasien() {
        return daftarPasien;
    }
    
   
   
}