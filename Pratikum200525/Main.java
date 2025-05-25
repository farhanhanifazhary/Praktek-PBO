/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum200525;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Elektronik elektronik = new Elektronik();
        boolean ulang = false;
        
        do{
            System.out.println("=====Program Alat Elektronik=====");
            System.out.println("1. Laptop");
            System.out.println("2. Smartphone");
            System.out.println("Pilih barang elektronik: ");
            int pilihElektronik = in.nextInt();
            
            // input user class elektronik
            in.nextLine();
            System.out.println("Masukkan merek: ");
            elektronik.setMerek(in.nextLine());
            System.out.println("Masukkan tahun produksi: ");
            elektronik.setTahunProduksi(in.nextInt());
            System.out.println("Masukkan garansi: ");
            elektronik.setGaransi(in.nextInt());
            
            switch(pilihElektronik) {
                case 1: {
                    Laptop laptop = new Laptop();
                    
                    System.out.println("1. Laptop Gaming");
                    System.out.println("Pilih jenis laptop: ");
                    int jenisLaptop = in.nextInt();
                    
                    if(jenisLaptop == 1) {
                        Gaming gaming = new Gaming();
                        
                        // input user class 
                        System.out.println("Masukkan ukuran layar: ");
                        laptop.setUkuranLayar(in.nextInt());
                        System.out.println("Masukkan kapasitas RAM: ");
                        laptop.setKapasitasRAM(in.nextInt());
                        System.out.println("Masukkan kartu grafis: ");
                        in.nextLine();
                        
                        // input user class gaming
                        System.out.println("Masukkan kartu grafis");
                        gaming.setKartuGrafis(in.nextLine());
                        System.out.println("Masukkan refresh rate: ");
                        gaming.setRefreshRate(in.nextInt());
                        
                        
                        System.out.println("Merek: " + elektronik.getMerek());
                        System.out.println("Tahun Produksi: " + elektronik.getTahunProduksi());
                        System.out.println("Garansi: " + elektronik.getGaransi() + " tahun");
                        System.out.println("Ukuran Layar: " + laptop.getUkuranLayar() + " inch");
                        System.out.println("Kapasitas RAM: " + laptop.getKapasitasRAM() + " GB");
                        System.out.println("Kartu Grafis: " + gaming.getKartuGrafis());
                        System.out.println("Refresh Rate: " + gaming.getRefreshRate() + " Hz");
                    }else {
                        System.out.println("Tidak ada jenis laptop yang dipilih");
                    }
                }break;
                case 2: {
                    Smartphone smartphone = new Smartphone();
                    
                    System.out.println("1. Smart Watch");
                    System.out.println("Pilih jenis Smartphone: ");
                    int jenisLaptop = in.nextInt();
                    
                    if(jenisLaptop == 1) {
                        SmartWatch smartwatch = new SmartWatch();
                        
                        // input user class smartphone
                        System.out.println("Masukkan kapasitas baterai: ");
                        smartphone.setKapasitasBaterai(in.nextInt());
                        System.out.println("Masukkan jumlah kamera: ");
                        smartphone.setJumlahKamera(in.nextInt());
                        
                        //input user class smart watch
                        System.out.println("Masukkan ukuran layar: ");
                        smartwatch.setUkuranLayar(in.nextInt());
                        System.out.println("Apakah tahan air: ");
                        smartwatch.isTahanAir(in.nextBoolean());
                        
                        
                        System.out.println("Merek: " + elektronik.getMerek());
                        System.out.println("Tahun Produksi: " + elektronik.getTahunProduksi());
                        System.out.println("Garansi: " + elektronik.getGaransi() + " tahun");
                        System.out.println("Kapasitas Baterai: " + smartphone.getKapasitasBaterai() + " mAh");
                        System.out.println("Jumlah Kamera: " + smartphone.getJumlahKamera());
                        System.out.println("Ukuran Layar: " + smartwatch.getUkuranLayar() + " inch");
                        String TahanAir = smartwatch.getTahanAir() ? "Iya":"Tidak";
                        System.out.println("Tahan Air: " + TahanAir);
                    }else {
                        System.out.println("Tidak ada jenis laptop yang dipilih");
                    }
                }break;
                default: {
                    System.out.println("Tidak ada barang elektronik yang dipilih");
                }
            }
        }while(ulang == true);
    }
}
