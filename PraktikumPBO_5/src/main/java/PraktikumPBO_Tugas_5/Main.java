/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO_Tugas_5;

/**
 *
 * @author acer
 */
public class Main {
    public static void main(String[] args) {

        Kucing kucing = new Kucing("Kuro", "Persia");
        Anjing anjing = new Anjing("Shiro", "Golden Retriever");

        System.out.println("=== INFORMASI KUCING ===");
        kucing.tampilkanInfo();

        System.out.println();

        System.out.println("=== INFORMASI ANJING ===");
        anjing.tampilkanInfo();
    }
}
