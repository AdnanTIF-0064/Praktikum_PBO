/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author acer
 */
public class Main {
    public static void main (String[] args) {
        mobil mobil = new mobil();
        mobil.nama = "Toyota";
        mobil.kecepatan = 180;
        mobil.jumlahPintu = 4;
        mobil.jumlahRoda = 4;
        mobil.tampilkanInfo();
        
        sepedaMotor motor = new sepedaMotor();
        motor.nama = "Yamaha";
        motor.kecepatan = 120;
        motor.jenisMesin = "2-tak";
        motor.jumlahRoda = 2;
        motor.tampilkanInfo();
    }
}
