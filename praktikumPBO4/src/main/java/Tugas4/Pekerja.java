/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas4;

/**
 *
 * @author acer
 */
public class Pekerja extends Manusia {
    private double gaji;

    // Constructor
    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
        super(nama, usia, pekerjaan);
        this.gaji = gaji;
    }

    // Getter untuk gaji
    public double getGaji() {
        return gaji;
    }

    // Setter untuk gaji
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    // Override metode toString()
    @Override
    public String toString() {
        return "Nama: " + getNama() + 
               "\nUsia: " + usia + 
               "\nPekerjaan: " + pekerjaan + 
               "\nGaji: Rp" + gaji;
    }
}

