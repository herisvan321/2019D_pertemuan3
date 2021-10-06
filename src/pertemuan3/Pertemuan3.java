/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan3;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Pertemuan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kondisi;
        kondisi = JOptionPane.showInputDialog(null, "Silahkan Pilih Kondisi [biodata, kalkulator]");
        Pertemuan3 per = new Pertemuan3();
        if (kondisi.equals("biodata")) {
            per.biodata();
        } else if (kondisi.equals("kalkulator")) {
            per.kalkulator();
        }
    }

    void biodata() {
        JOptionPane.showMessageDialog(null, "void Biodata");
    }

    void kalkulator() {
        JOptionPane.showMessageDialog(null, "void Kalkulator");
    }

}
