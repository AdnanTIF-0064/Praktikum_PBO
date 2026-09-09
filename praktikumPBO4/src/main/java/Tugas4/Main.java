/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas4;

/**
 *
 * @author acer
 */
public class Main {
    public static void main(String[] args) {
        // Buat objek dari kelas Pekerja
        Pekerja pekerja = new Pekerja("Adnan", 19, "bandar mbako", 2000000);

        // Tampilkan informasi pekerja menggunakan metode toString()
        System.out.println("=== Informasi Pekerja ===");
        System.out.println(pekerja.toString());
        System.out.println();

        // Ubah nama pekerja menggunakan metode setter
        pekerja.setNama("Tsaqif");

        // Tampilkan ulang informasi pekerja
        System.out.println("=== Informasi Pekerja Setelah Diubah ===");
        System.out.println(pekerja.toString());
        System.out.println();

        // --- Uji Akses Langsung Atribut ---
        System.out.println("=== Uji Akses Langsung ===");
        
        // 1. Mencoba akses langsung 'pekerjaan' (public)
        System.out.println("Akses langsung pekerjaan: " + pekerja.pekerjaan); // Berhasil

        // 2. Mencoba akses langsung 'usia' (protected)
        System.out.println("Akses langsung usia: " + pekerja.usia); // Berhasil jika dalam package yang sama

        // 3. Mencoba akses langsung 'nama' (private)
        // System.out.println(pekerja.nama); // ERROR! Tidak bisa dikompilasi

        // 4. Mencoba akses langsung 'gaji' (private)
        // System.out.println(pekerja.gaji); // ERROR! Tidak bisa dikompilasi
    }
}

