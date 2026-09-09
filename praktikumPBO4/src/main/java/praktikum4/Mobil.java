/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author acer
 */
public class Mobil extends kendaraan {
    private int jumlahpintu;
    
    public Mobil (String nama, int kecepatanMaks, String JenisMesin, int jumlahpintu) {
        super(nama, kecepatanMaks, JenisMesin);
        this.jumlahpintu = jumlahpintu;
        
        
    }
    
    public void tampilkanInfoMobil() {
        System.out.println("Kecepatan Maksimum Mobil: " + kecepatanMaks + "km/h");
        System.out.println("Jumlah pintu: " + jumlahpintu);
    }
}
