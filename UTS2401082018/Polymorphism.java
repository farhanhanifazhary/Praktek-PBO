/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS2401082018;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Polymorphism {
    public static void main(String[] args) {
        int kendaraanRoda2 = 0;
        int kendaraanRoda4 = 0;
        int tipeSepeda = 0;
        int tipeMobil = 0;
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
            Kendaraan sepeda_listrik = new SepedaListrik();
            Kendaraan truk = new Truk();
            Kendaraan taksi = new Taksi();

            
            System.out.println("Masukkan jumlah roda kendaraan: ");
            int jmlRoda = in.nextInt();
            in.nextLine();

            if(jmlRoda == 2) {
                System.out.println("Masukkan warna dari kendaraan: ");
                sepeda_listrik.setWarna(in.nextLine());
                sepeda_listrik.setJmlRoda(jmlRoda);
            
                //menu list kendaraan roda 2
                System.out.println("=====List Kendaraan Beroda 2=====");
                System.out.println("1. Sepeda");
                System.out.println("Pilih kendaraan yang dinginkan");
                kendaraanRoda2 = in.nextInt();
                in.nextLine();

                if(kendaraanRoda2 == 1) {
                    
                    //menu list sepeda
                    System.out.println("=====List Sepeda=====");
                    System.out.println("1. Sepeda Listrik");
                    System.out.println("Pilih tipe sepeda yang diinginkan");
                    tipeSepeda = in.nextInt();
                    in.nextLine();

                    if(tipeSepeda == 1) {
                        //input jumlah sadel dan jumlah gir
                        System.out.println("Masukkan jumlah sadel sepeda: ");
                        ((Sepeda)sepeda_listrik).setJmlSadel(in.nextLine());

                        System.out.println("Masukkan jumlah gir sepeda: ");
                        ((Sepeda)sepeda_listrik).setJmlGir(in.nextInt());
                        in.nextLine();
                    
                        System.out.println("Masukkan kecepatan maksimum sepeda (Km/h): ");
                        ((SepedaListrik)sepeda_listrik).setKecepatanMaks(in.nextInt());

                        System.out.println("Masukkan jarak tempuh sepeda (Km): ");
                        ((SepedaListrik)sepeda_listrik).setJarakTempuh(in.nextInt());
                        ((SepedaListrik)sepeda_listrik).display();
                    }else {
                        System.out.println("PIlihan tipe sepeda tidak valid");
                    }
                }else {
                    System.out.println("PIlihan kendaraan tidak valid");
                }
            }else if (jmlRoda == 4) {
                //menu list kendaraan roda 4
                System.out.println("=====List Kendaraan Beroda 4=====");
                System.out.println("1. Mobil");
                System.out.println("Pilih kendaraan yang dinginkan");
                kendaraanRoda4 = in.nextInt();
                in.nextLine();

                if(kendaraanRoda4 == 1) {
                    //menu list mobil
                    System.out.println("=====List Mobil=====");
                    System.out.println("1. Truk");
                    System.out.println("2. Taksi");
                    System.out.println("Pilih tipe sepeda yang diinginkan");
                    tipeMobil = in.nextInt();
                    in.nextLine();

                    switch (tipeMobil) {
                        case 1: {
                            System.out.println("Masukkan warna dari kendaraan: ");
                            truk.setWarna(in.nextLine());
                            truk.setJmlRoda(jmlRoda);

                            //input bahan bakar dan kapasitas mesin
                            System.out.println("Masukkan bahan bakar mobil: ");
                            ((Mobil)truk).setBahanBakar(in.nextLine());
                            System.out.println("Masukkan kapasitas mesin mobil: ");
                            ((Mobil)truk).setKapasitasBaterai(in.nextInt());
                            in.nextLine();
                            
                            System.out.println("Masukkan muatan maksimum: ");
                            ((Truk)truk).setMuatanMaks(in.nextInt());
                            ((Truk)truk).display();
                        }break;
                        case 2:{
                            System.out.println("Masukkan warna dari kendaraan: ");
                            taksi.setWarna(in.nextLine());
                            taksi.setJmlRoda(jmlRoda);
                            
                            //input bahan bakar dan kapasitas mesin
                            System.out.println("Masukkan bahan bakar mobil: ");
                            ((Mobil)taksi).setBahanBakar(in.nextLine());
                            System.out.println("Masukkan kapasitas mesin mobil: ");
                            ((Mobil)taksi).setKapasitasBaterai(in.nextInt());
                            in.nextLine();
                            
                            System.out.println("Masukkan tarif awal: ");
                            ((Taksi)taksi).setTarifAwal(in.nextInt());
                            System.out.println("Masukkan tarif per km: ");
                            ((Taksi)taksi).setTarifPerKm(in.nextInt());
                            ((Taksi)taksi).display();
                        }break;
                        default:
                            System.out.println("PIlihan tipe mobil tidak valid");
                            break;
                    }
                }else {
                    System.out.println("PIlihan kendaraan tidak valid");
                }
            }else {
                System.out.println("Saat ini kami hanya memiliki menu untuk kendaraan beroda 2 dan 4. "
                        + "Kendaraan yang beroda " + jmlRoda +
                        "Tidak ada di dalam database kami. Mohon maaf atas ketidaknyamanannya.");
                System.out.println("Tim development kami akan segera menyediakan piliahan kendaraan yang lain." +
                        "Terima kasih.");
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
