/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum200525;

/**
 *
 * @author Lenovo
 */
public class TestPolymorphism {
    public static void main(String[] args) {
        //objek biasa
        Elektronik barang1 = new Elektronik();
        barang1.setMerek("samsung");
        barang1.setTahunProduksi(2025);
        barang1.setGaransi(3);
        barang1.display();
        
        System.out.println();
        
        SmartWatch barang2 = new SmartWatch();
        barang2.setMerek("Xiaomi");
        barang2.setTahunProduksi(2023);
        barang2.setGaransi(1);
        barang2.setKapasitasBaterai(1000);
        barang2.setJumlahKamera(2);
        barang2.setUkuranLayar(400);
        barang2.isTahanAir(true);
        barang2.display();
        
        System.out.println();
        
        //polymorfism
        Elektronik barang3 = new Laptop();
        barang3.setMerek("HP");
        barang3.setTahunProduksi(2023);
        barang3.setGaransi(2);
        ((Laptop)barang3).setUkuranLayar(14);
        ((Laptop)barang3).setKapasitasRAM(32);
        ((Laptop)barang3).display();
        
        System.out.println();
        
        Smartphone barang4 = new SmartWatch();
        barang4.setMerek("Apple");
        barang4.setTahunProduksi(2024);
        barang4.setGaransi(1);
        barang4.setKapasitasBaterai(1000);
        barang4.setJumlahKamera(1);
        ((SmartWatch)barang4).setUkuranLayar(300);
        ((SmartWatch)barang4).isTahanAir(true);
        ((SmartWatch)barang4).display();
        //Smartphone barang4 = new SmartWatch("Apple", 2025, 3, 1500, 1, , 2, true);
    }
}
