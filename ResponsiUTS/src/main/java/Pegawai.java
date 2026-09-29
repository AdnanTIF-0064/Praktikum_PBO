/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Pegawai {
    private String namaPegawai;
    private double gaji;

    // Constructor
    public Pegawai(String namaPegawai, double gaji) {
        this.namaPegawai = namaPegawai;
        this.gaji = gaji;
    }

    // Getter namaPegawai
    public String getNamaPegawai() {
        return namaPegawai;
    }

    // Setter namaPegawai
    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }

    // Getter gaji
    public double getGaji() {
        return gaji;
    }

    // Setter gaji
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    // Method tampilkanInfo
    public void tampilkanInfo() {
        System.out.println("Nama Pegawai: " + namaPegawai);
        System.out.println("Gaji: " + gaji);
    }
}

