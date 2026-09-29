/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Produk {
    private String namaProduk;
    private double harga;

    // Constructor
    public Produk(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    // Getter namaProduk
    public String getNamaProduk() {
        return namaProduk;
    }

    // Setter namaProduk
    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    // Getter harga
    public double getHarga() {
        return harga;
    }

    // Setter harga
    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Method tampilkanInfo
    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: " + harga);
    }
}

