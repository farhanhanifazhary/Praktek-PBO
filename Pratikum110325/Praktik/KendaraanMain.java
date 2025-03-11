/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum110325;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class KendaraanMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String jenis;
        String merk;
        int tahun;
        String warna;
        int harga;
        int kecepatan;
        
        System.out.print("Masukkan jenis kendaraan = ");
        jenis = in.nextLine();
        System.out.print("Masukkan merk = ");
        merk = in.nextLine();
        System.out.print("Masukkan tahun = ");
        tahun = in.nextInt();
        in.nextLine();// pembersihan line untuk string berikutnya
        System.out.print("Masukkan warna = ");
        warna = in.nextLine();
        System.out.print("Harga sewa kendaraan = ");
        harga = in.nextInt();
        System.out.print("Kecepatan kendaraan = ");
        kecepatan = in.nextInt();
        
        //objek baru -- class kendaraan
        Kendaraan kend = new Kendaraan(jenis, merk, tahun, warna);
        kend.InfoKendaraan();
        kend.CekHarga(harga);
        kend.CekKecepatan(kecepatan);
    }
}
