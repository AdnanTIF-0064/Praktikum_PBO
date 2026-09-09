/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author acer
 */
public class kendaraan {
    private String nama;
    protected int kecepatanMaks; 
    public String JenisMesin;
    
    public kendaraan(String nama, int kecepatanMaks, String JenisMesin) {
        this.nama = nama;
        this.kecepatanMaks = kecepatanMaks;
        this.JenisMesin = JenisMesin;
        
    }
   
    public String getNama() {
        return nama;
        
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void tampilkanInfoKendaraan() {
        System.out.println("Nama Kendaraan: " + nama);
        System.out.println("kecepatan Maksimum: " + kecepatanMaks + "km/h");
        System.out.println("Jenis Mesin: " + JenisMesin);
    }
}

