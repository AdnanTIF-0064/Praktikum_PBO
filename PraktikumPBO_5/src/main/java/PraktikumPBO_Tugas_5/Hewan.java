/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO_Tugas_5;

/**
 *
 * @author acer
 */
public class Hewan {
    String nama;
    String jenis;

   
    Hewan(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

   
    void tampilkanInfo() {
        System.out.println("Nama  : " + nama);
        System.out.println("Jenis : " + jenis);
    }
}
