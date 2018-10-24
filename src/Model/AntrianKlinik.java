/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class AntrianKlinik {

    private int tanggalAntrian;
    private int bulanAntrian;
    private int tahunAntrian;
    private Klinik klinik;

    private ArrayList<Pasien2> dafatrPasienAntri = new ArrayList<Pasien2>();

    public static void buatAtrian(int tanggalAntrian, int bulanAntrian, int tahunAntrian, Klinik klinik) {

    }

    public static int cariAntrian(int tanggal, int bulan, int tahun, Klinik klinik) {
        return cariAntrian(tanggal, bulan, tahun, klinik);
    }

    public static void daftarPasien(Pasien2 pasien, int tanggal, int bulan, int tahun, Klinik klinik) {

    }

    public AntrianKlinik() {
    }

    public AntrianKlinik(int tanggalAntrian, int bulanAntrian, int tahunAntrian, Klinik klinik) {
        this.tanggalAntrian = tanggalAntrian;
        this.bulanAntrian = bulanAntrian;
        this.tahunAntrian = tahunAntrian;
        this.klinik = klinik;
    }


    public ArrayList<Pasien2> getDafatrPasien() {
        return dafatrPasienAntri;
    }

    public void setDafatrPasienAntri(ArrayList<Pasien2> dafatrPasienAntri) {
        this.dafatrPasienAntri = dafatrPasienAntri;
    }

    public void mendaftar(Pasien2 pasien) {
        getDafatrPasien().add(pasien);
    }

    public int getTanggalAntrian() {
        return tanggalAntrian;
    }

    public void setTanggalAntrian(int tanggalAntrian) {
        this.tanggalAntrian = tanggalAntrian;
    }

    public int getBulanAntrian() {
        return bulanAntrian;
    }

    public void setBulanAntrian(int bulanAntrian) {
        this.bulanAntrian = bulanAntrian;
    }

    public int getTahunAntrian() {
        return tahunAntrian;
    }

    public void setTahunAntrian(int tahunAntrian) {
        this.tahunAntrian = tahunAntrian;
    }

    public Klinik getKlinik() {
        return klinik;
    }

    public void setKlinik(Klinik klinik) {
        this.klinik = klinik;
    }
    public String toString() {
        return String.valueOf(tahunAntrian)
                + String.valueOf(bulanAntrian)
                + String.valueOf(tanggalAntrian)
                + klinik.getIdKlinik()
                + klinik.getNamaKlinik();
}

}
