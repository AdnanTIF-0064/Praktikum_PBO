/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Elektronik extends Produk {
    private int garansi;

    // Constructor
    public Elektronik(String namaProduk, double harga, int garansi) {
        super(namaProduk, harga);
        this.garansi = garansi;
    }

    // Getter garansi
    public int getGaransi() {
        return garansi;
    }

    // Setter garansi
    public void setGaransi(int garansi) {
        this.garansi = garansi;
    }

    // Polymorphism / overriding
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Garansi: " + garansi + " tahun");
    }
}
