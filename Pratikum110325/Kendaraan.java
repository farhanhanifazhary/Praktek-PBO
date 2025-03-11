/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum110325;

/**
 *
 * @author Lenovo
 */
public class Kendaraan {
    String jenis;
    String merk;
    int tahun;
    String warna;
    
    //constructor
    public Kendaraan(String j, String m, int t, String w) {
        this.jenis = j;
        this.merk = m;
        this.tahun = t;
        this.warna = w;
    }
    
    //method tanpa parameter
    public void InfoKendaraan() {
        System.out.println("\n\t DATA KENDARAAN");
        System.out.println("Jenis kendaraan = " + jenis);
        System.out.println("Merk kendaraan = " + merk);
        System.out.println("Tahun kendaraan = " + tahun);
        System.out.println("Warna kendaraan = " + warna);
    }
    
    //method dengan parameter
    public void CekHarga(int harga) {
        System.out.println("Harga sewa kendaraamn Rp " + harga);
    }
    
    public void CekKecepatan(int kecepatan) {
        if(kecepatan >= 20 && kecepatan <= 40) {
            System.out.println("slow");
        }else if(kecepatan >= 41 && kecepatan <= 60) {
            System.out.println("medium");
        }else if(kecepatan >= 61 && kecepatan <= 85) {
            System.out.println("fast");
        }else if(kecepatan > 85) {
            System.out.println("racing");
        }else {
            System.out.println("Kendaraan tak layak pakai");
        }
    }
}
