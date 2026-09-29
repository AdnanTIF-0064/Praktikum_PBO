/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Main {

    public static void main(String[] args) {

        // ========================================
        // OBJEK PRODUK ELEKTRONIK
        // ========================================

        Elektronik elektronik = new Elektronik(
                "Laptop",
                15000000,
                2
        );

        System.out.println("=== OUTPUT PRODUK ELEKTRONIK ===");
        elektronik.tampilkanInfo();


        System.out.println();


        // ========================================
        // OBJEK PEGAWAI TETAP
        // ========================================

        PegawaiTetap pegawaiTetap = new PegawaiTetap(
                "Budi",
                5000000,
                1000000
        );

        System.out.println("=== OUTPUT PEGAWAI TETAP ===");
        pegawaiTetap.tampilkanInfo();


        System.out.println();


        // ========================================
        // POLYMORPHISM PRODUK
        // ========================================

        Produk produk1 = new Makanan(
                "Snack",
                15000,
                "2023-12-30"
        );

        Produk produk2 = new Elektronik(
                "Laptop",
                15000000,
                2
        );

        System.out.println("=== OUTPUT POLIMORFISME PRODUK ===");

        produk1.tampilkanInfo();

        System.out.println();

        produk2.tampilkanInfo();


        System.out.println();


        // ========================================
        // POLYMORPHISM PEGAWAI
        // ========================================

        Pegawai pegawai1 = new PegawaiTetap(
                "Budi",
                5000000,
                1000000
        );

        Pegawai pegawai2 = new PegawaiKontrak(
                "Andi",
                3000000,
                12
        );

        System.out.println("=== OUTPUT POLIMORFISME PEGAWAI ===");

        pegawai1.tampilkanInfo();

        System.out.println();

        pegawai2.tampilkanInfo();
    }
}
