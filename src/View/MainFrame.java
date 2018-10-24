/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import static org.omg.CORBA.ORB.init;

/**
 *
 * @author admin
 */
public class MainFrame extends JFrame implements ActionListener{
    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenuItem exitMenuItem;
    private JMenuItem TambahPasienBaruDialog;
    private JMenuItem DaftarAntrianDialog;
    
    public MainFrame() throws HeadlessException{
        init();
    }
    public void init(){
        menuBar = new JMenuBar();
        this.setTitle("Main Frame");
        fileMenu = new JMenu("File");
        exitMenuItem = new JMenuItem("exit");
        TambahPasienBaruDialog = new JMenuItem("Tambah Antrian");
        DaftarAntrianDialog = new JMenuItem("Tambah Pasien");
        
        fileMenu.add(TambahPasienBaruDialog);
        fileMenu.add(DaftarAntrianDialog);
        fileMenu.add(exitMenuItem);
        menuBar.add(fileMenu);
        
        exitMenuItem.addActionListener(this);
        TambahPasienBaruDialog.addActionListener(this);
        DaftarAntrianDialog.addActionListener(this);
        
        this.setJMenuBar(menuBar);
        
    }
   
    @Override
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == exitMenuItem) {
            System.exit(0);
            
        }
        if (ae.getSource() == TambahPasienBaruDialog){
            TambahPasienBaruDialog tambah = new TambahPasienBaruDialog();
            tambah.setSize(600, 350);
            tambah.setVisible(true);
        }
        if(ae.getSource() == DaftarAntrianDialog){
            TambahPasienBaruDialog daftar = new TambahPasienBaruDialog();
            daftar.setSize(400, 300);
            daftar.setVisible(true);
            
        }
    }
   
}
