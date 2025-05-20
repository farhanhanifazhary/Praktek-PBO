/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS2401082018;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama: Farhan Hanif Azhary
 * No. BP: 2401082018
 * Kelas: TK 1B
 */

public class Main {
    public static void main(String[] args) {
        int kendaraanRoda2 = 0;
        int tipeSepeda = 0;
        char ulang = 0;Scanner in = new Scanner(System.in);
        
        //Data developer
        System.out.println("Data Developer");
        System.out.println("Nama: Farhan Hanif Azhary");
        System.out.println("No. BP: 2401082018");
        System.out.println("Kelas: TK 1B");
        System.out.println();
        
        //Program start
        do {
            System.out.println("=====Program Kendaraan=====");
            Kendaraan kendaraan = new Kendaraan();
            Sepeda sepeda = new Sepeda();
            SepedaListrik sepedaListrik = new SepedaListrik();

            //input jumlah roda dan warna
            System.out.println("Masukkan warna dari kendaraan: ");
            kendaraan.setWarna(in.nextLine());
            
            System.out.println("Masukkan jumlah roda kendaraan: ");
            kendaraan.setJmlRoda(in.nextInt());
            in.nextLine();

            if(kendaraan.getJmlRoda() == 2) {
                //menu list kendaraan roda 2
                System.out.println("=====List Kendaraan Beroda 2=====");
                System.out.println("1. Sepeda");
                System.out.println("Pilih kendaraan yang dinginkan");
                kendaraanRoda2 = in.nextInt();
                in.nextLine();

                if(kendaraanRoda2 == 1) {
                    //input jumlah sadel dan jumlah gir
                    System.out.println("Masukkan jumlah sadel sepeda: ");
                    sepeda.setJmlSadel(in.nextLine());

                    System.out.println("Masukkan jumlah gir sepeda: ");
                    sepeda.setJmlGir(in.nextInt());
                    in.nextLine();
                    
                    //menu list sepeda
                    System.out.println("=====List Sepeda=====");
                    System.out.println("1. Sepeda Listrik");
                    System.out.println("Pilih tipe sepeda yang diinginkan");
                    tipeSepeda = in.nextInt();

                    if(tipeSepeda == 1) {
                        System.out.println("Masukkan kecepatan maksimum sepeda (Km/h): ");
                        sepedaListrik.setKecepatanMaks(in.nextInt());

                        System.out.println("Masukkan jarak tempuh sepeda (Km): ");
                        sepedaListrik.setJarakTempuh(in.nextInt());
                    }else {
                        System.out.println("PIlihan tipe sepeda tidak valid");
                    }
                }else {
                    System.out.println("PIlihan kendaraan tidak valid");
                }
            }else {
                System.out.println("Saat ini kami hanya memiliki menu untuk kendaraan beroda 2. "
                        + "Kendaraan yang beroda " + kendaraan.getJmlRoda() +
                        "Tidak ada di dalam database kami. Mohon maaf atas ketidaknyamanannya.");
                System.out.println("Tim development kami akan segera menyediakan piliahan kendaraan yang lain." +
                        "Terima kasih.");
            }

            //output
            System.out.println();
            System.out.println("Detil Kendaraan");
            System.out.println("Jumlah Roda: " + kendaraan.getJmlRoda());
            System.out.println("Warna: " + kendaraan.getWarna());

            if(kendaraan.getJmlRoda() == 2) {
                if(kendaraanRoda2 == 1) {
                    System.out.println("Jenis Kendaraan: Sepeda");
                    System.out.println("Jumlah sadel: " + sepeda.getJmlSadel());
                    System.out.println("Jumlah Gir: " + sepeda.getJmlGir());
                    if(tipeSepeda == 1) {
                        System.out.println("Tipe Sepeda: Sepeda Listrik");
                        System.out.println("Kecepatan Maksimum: " + sepedaListrik.getKecepatanMaks() + "Km/h");
                        System.out.println("Jarak Tempuh: " + sepedaListrik.getJarakTempuh() + "Km");
                        in.nextLine();
                    }
                }
            }
            
            System.out.println("Apakah ingin mengulang program? (y/n) ");
            ulang = in.next().charAt(0);
            in.nextLine();
        }while(ulang == 'y' | ulang == 'Y');
        
        System.out.println("Feedback untuk layanan kami agar kami dapat mengembangkan layanan lebih baik: ");
        String feedback = in.nextLine();
        System.out.println("Terima kasih telah menggunakan layanan kami.");
    }
}
