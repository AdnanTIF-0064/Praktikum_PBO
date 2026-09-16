/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO_Tugas_5;

/**
 *
 * @author acer
 */
public class Kucing extends Hewan {

    
    Kucing(String nama, String jenis) {
        super(nama, jenis);
    }

    
    @Override
    void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Suara : Meong");
    }
}
