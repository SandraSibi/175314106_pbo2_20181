/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RumahSakit2 {

    private ArrayList<Pasien> daftarPasien = new ArrayList<Pasien>();
    private ArrayList<Klinik> daftarKlinik = new ArrayList<Klinik>();
    private ArrayList<AntrianKlinik> daftarAntrianKlinik = new ArrayList<AntrianKlinik>();
    private String nama;
    private String alamat;

    public RumahSakit2() {
    }

    public RumahSakit2(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public void tambahPasien(Pasien pasien) {
        getDaftarPasien().add(pasien);
    }

    public Pasien cariPasien(String noRM) {
        for (int i = 0; i < getDaftarPasien().size(); i++) {
            if (getDaftarPasien().get(i).getNoRM().equals(noRM)) {

                return getDaftarPasien().get(i);
            }

        }
        return null;
    }

    public void tambahPasienBaru(Pasien test) {
        getDaftarPasien().add(test);
    }

    public void simpanDaftarPasien(File file) {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            for (int i = 0; i < getDaftarPasien().size(); i++) {
                String data = getDaftarPasien().get(i).toString();
                fos.write(data.getBytes());
            }
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void bacaDaftarPasien(File file) {
        FileInputStream fis = null;
        try {
            String hasilBaca = "";
            fis = new FileInputStream(file);
            int dataInt;

            while ((dataInt = fis.read()) != -1) {
                if ((char) dataInt != '\n') {
                    hasilBaca = hasilBaca + (char) dataInt;
                } else {
                    Pasien temp = new Pasien();
                    temp.setNama(hasilBaca);
                    tambahPasienBaru(temp);
                }
            }
            System.out.println(hasilBaca);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void simpanObjekRumahSakit(File file) {
    }

    public void bacaObjekRumahSakit(File file) {
    }

    public ArrayList<Pasien> getDaftarPasien() {
        return daftarPasien;
    }

    public void setDaftarPasien(ArrayList<Pasien> daftarPasien) {
        this.daftarPasien = daftarPasien;
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

    public void tambahKlinik(Klinik klinik) {
        getDaftarKlinik().add(klinik);
    }

    public Klinik cariKlinik(String namaKlinik) {
        for (int i = 0; i < getDaftarKlinik().size(); i++) {
            if (getDaftarKlinik().get(i).
                    getNamaKlinik().equalsIgnoreCase(namaKlinik)) {
                return getDaftarKlinik().get(i);
            }
        }
        return null;
    }

    public void buatAntrianKlinik(
            int tanggal,
            int bulan,
            int tahun,
            Klinik klinik) {
        AntrianKlinik antrian = new AntrianKlinik();
        antrian.setTanggalAntrian(tanggal);
        antrian.setBulanAntrian(bulan);
        antrian.setTahunAntrian(tahun);
        antrian.setKlinik(klinik);
        // cari antrian dalam list daftarAntri
        if (cariAntrianKlinik(tanggal, bulan, tahun, klinik) < 0) {
            // tambah dalam list antrian
            daftarAntrianKlinik.add(antrian);
        } else {
            System.out.println("antrian sudah ada");
        }
    }

    public int cariAntrianKlinik(
            int tanggal,
            int bulan,
            int tahun,
            Klinik klinik) {
        return -1; // index list
    }

    public void tambahPasienAntrianKlinik(
            Pasien pasien,
            int tanggal,
            int bulan,
            int tahun,
            Klinik klinik) {
        // cari antrian ada apa tidak
        // jika ada
        // panggil fungsi mendaftar dari objek antrian
        // jika tidak ada
        // buat antrian baru, panggil gungsi daftar pasien dari objek antrian
        // tambahkan objek antrian baru ke list daftar antrian
    }

    /**
     * @return the daftarAntrianKlinik
     */
    public ArrayList<AntrianKlinik> getDaftarAntrianKlinik() {
        return daftarAntrianKlinik;
    }

    public void setDaftarAntrianKlinik(ArrayList<AntrianKlinik> daftarAntrianKlinik) {
        this.daftarAntrianKlinik = daftarAntrianKlinik;
    }

    public ArrayList<Klinik> getDaftarKlinik() {
        return daftarKlinik;
    }

    public void setDaftarKlinik(ArrayList<Klinik> daftarKlinik) {
        this.daftarKlinik = daftarKlinik;
    }

}
