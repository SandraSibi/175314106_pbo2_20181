/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

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
    
    public Dokter(){}
    

    public String getNomorPegawai() {
        return nomorPegawai;
    }

    public void setNomorPegawai(String nomorPegawai) {
        this.nomorPegawai = nomorPegawai;
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

    public String getTemptLahir() {
        return temptLahir;
    }

    public void setTemptLahir(int temptLahir) throws Exception {
        if (tanggalLahir > 0) {

        } else {
            throw new Exception("Tanggal Tidak diketahui");
        }
    }

public int getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(int tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
    
}
