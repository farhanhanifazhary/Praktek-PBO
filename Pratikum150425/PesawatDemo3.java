/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum150425;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class PesawatDemo3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Masukkan banyak pesawat: ");
        int jumlah = in.nextInt();
        in.nextLine();
        
        //deklarasi array
        Pesawat[] daftarPesawat = new Pesawat[jumlah];
        
        //isi array
        for(int i = 0; i < jumlah; i++) {
            System.out.println("Input pesawat ke " + (i+1));
            System.out.println("Masukkan nama pesawat: ");
            String nama = in.nextLine();
            System.out.println("Masukkan tahun produksi pesawat: ");
            int tahunProduksi = in.nextInt();
            System.out.println("Menggunakan mesin atau tidak (true/false)?");
            boolean mesin = in.nextBoolean();
            System.out.println("Jumlah Muatan: ");
            int muatan = in.nextInt();
            
            in.nextLine();
            
            daftarPesawat[i] = new Pesawat(nama, tahunProduksi, mesin, muatan);
            System.out.println();
        }
        
        //menampilkan isi array
        System.out.println("\n\n Data Pesawat \n\n");
        System.out.println("Data Pesawat ke 1 adalah");
        daftarPesawat[0].cetak();
        System.out.println();
        int besar = daftarPesawat[0].getMuatan();
        String namaMax = daftarPesawat[0].getNama();
        for(int i = 1; i < daftarPesawat.length; i ++) {
            System.out.println("Data Pesawat ke " + (i + 1) + " adalah");
            daftarPesawat[i].cetak();
            if(daftarPesawat[i].getMuatan() > besar){
                besar = daftarPesawat[i].getMuatan();
                namaMax = daftarPesawat[i].getNama();
            }
            System.out.println();
        }
        
        System.out.println("Pesawat dengan muatan terbanyak adalah " + namaMax);
        System.out.println("dengan kapasistas maksimum " + besar + " orang");
    }
}
