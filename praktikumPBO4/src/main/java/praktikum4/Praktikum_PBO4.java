/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author acer
 */
public class Praktikum_PBO4 {
    public static void main(String[] args) {
        // Membuat objek dari class Mobil
        Mobil mobilBaru = new Mobil("Toyota Avanza", 180, "Bensin", 4);

        // Menampilkan info menggunakan method dari class kendaraan (parent)
        System.out.println("--- Info Kendaraan (Parent Method) ---");
        mobilBaru.tampilkanInfoKendaraan();

        System.out.println(); // Baris baru untuk pemisah

        // Menampilkan info menggunakan method dari class Mobil (child)
        System.out.println("--- Info Mobil (Child Method) ---");
        mobilBaru.tampilkanInfoMobil();
    }
}


