/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum_tugas_3;

/**
 *
 * @author acer
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", "Avanza", 2022);
        Mobil mobil2 = new Mobil("Honda", "Civic", 2023);
        
        mobil1.displayInfo();
        mobil1.startEngine();
        System.out.println();
        
        mobil2.displayInfo();
        mobil2.startEngine();
        System.out.println();
        
        System.out.println("Perubahan Warna");
        
        System.out.println("Warna mobil 1 sebelum diubah :" + mobil1.getWarna());
        mobil1.setWarna("Merah");
        
        System.out.println("Warna mobil 1 setelah diubah : " + mobil1.getWarna());
        System.out.println();
        mobil1.displayInfo();
    }
}
