/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.*;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author admin
 */
public class TambahPasienBaruDialog extends JDialog {

    private JLabel judulLabel;
    private JLabel namaLabel;
    private JLabel alamatLabel;
    private JLabel tanggalLahirLabel;
    private JLabel bulanLahirLabel;
    private JLabel tahunLahirLabel;
    private JLabel TTLLabel;
    private JLabel JenisaKelamin;
    private JButton saveButton;
    private JTextField namaText;
    private JTextField alamatText;
    private JTextField TTLText;
    private JTextField NoRekamMedis;
    private JComboBox tanggal;
    private JComboBox bulan;
    private JComboBox tahun;
    private JRadioButton tambahButton;
    private JButton save;

    public TambahPasienBaruDialog() {
        init();

    }

    public TambahPasienBaruDialog(String title) {
        init();
    }

    public void init() {
        this.setLayout(null);

        judulLabel = new JLabel("Tambah Pasien");
        judulLabel.setFont(new Font(null, Font.BOLD, 14));
        judulLabel.setBounds(50, 10, 150, 10);
        this.add(judulLabel);

        this.setLayout(null);
        namaLabel = new JLabel("Nama");
        namaLabel.setFont(new Font(null, Font.BOLD, 14));
        namaLabel.setBounds(50, 10, 150, 10);
        this.add(namaLabel);

        this.setLayout(null);
        alamatLabel = new JLabel(" Alamat");
        alamatLabel.setFont(new Font(null, Font.BOLD, 14));
        alamatLabel.setBounds(50, 10, 150, 10);
        this.add(alamatLabel);

        this.setLayout(null);
        TTLLabel = new JLabel("Tempat Tanggal Lahir Pasien");
        judulLabel.setFont(new Font(null, Font.BOLD, 14));
        judulLabel.setBounds(50, 10, 150, 10);
        this.add(TTLLabel);

        this.setLayout(null);
        tanggalLahirLabel = new JLabel("Tanggal");
        tanggalLahirLabel.setFont(new Font(null, Font.BOLD, 14));
        tanggalLahirLabel.setBounds(50, 10, 150, 10);
        this.add(tanggalLahirLabel);

        this.setLayout(null);
        bulanLahirLabel = new JLabel("Bulan");
        bulanLahirLabel.setFont(new Font(null, Font.BOLD, 14));
        bulanLahirLabel.setBounds(50, 10, 150, 10);
        this.add(bulanLahirLabel);
        
        this.setLayout(null);
        tahunLahirLabel = new JLabel("Tahun");
        tahunLahirLabel.setFont(new Font(null, Font.BOLD, 14));
        tahunLahirLabel.setBounds(50, 10, 150, 10);
        this.add(tahunLahirLabel);
        
        this.setLayout(null);
        tanggal = new JComboBox();
        for (int i = 1; i <= 31; i++) {
            tanggal.addItem(i);
        }
        tanggal.setBounds(120, 190, 100, 30);
        tanggal.add(tanggal);
        
        this.setLayout(null);
        
             bulan = new JComboBox();
            bulan.addItem("Jan");
            bulan.addItem("Feb");
            bulan.addItem("Mar");
            bulan.addItem("Apr");
            bulan.addItem("May");
            bulan.addItem("Jun");
            bulan.addItem("Jul");
            bulan.addItem("aug");
            bulan.addItem("Sep");
            bulan.addItem("Oct");
            bulan.addItem("Nov");
            bulan.addItem("Dec");
            bulan.setBounds(139, 143, 67, 20);
            this.add(bulan);
            
            this.setLayout(null);

            tahun = new JComboBox();
             for (int i = 1990; i <= 2018; i++) {
                 tahun.addItem(i);
          
            }
            tahun.setBounds(234, 143, 67, 20);
            this.add(tahun);

            namaText = new JTextField();
            namaText.setFont(new Font(null, Font.TRUETYPE_FONT, 16));
            namaText.setBounds(90, 50, 150, 30);
            namaText.add(namaText);
            
             alamatText = new JTextField();
            alamatText.setFont(new Font(null, Font.PLAIN, 16));
            alamatText.setBounds(90, 90, 150, 30);
            alamatText.add(alamatText);
            
            
           this.setLayout(null);
            saveButton = new JButton("Simpan");
            saveButton.setBounds(155, 240, 80, 20);
            saveButton.setSize(84, 28);
            this.add(saveButton);
        }
    }


