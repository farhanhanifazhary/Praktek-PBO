/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum180325;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class TestVehicleEnkapsulasi {
    public static void main(String[] args) {
        System.out.println("Kendaaraan 1 beban maksimal 10.000n kg");
        VehicleEnkapsulasi kendaraan1 = new VehicleEnkapsulasi(10000);
        
        System.out.println("Menambahkan beban 1 (500 kg)" + kendaraan1.addLoad(500));
        System.out.println("Menambahkan beban 1 (250 kg)" + kendaraan1.addLoad(250));
        System.out.println("Menambahkan beban 1 (5000 kg)" + kendaraan1.addLoad(5000));
        System.out.println("Menambahkan beban 1 (4000 kg)" + kendaraan1.addLoad(4000));
        System.out.println("Menambahkan beban 1 (350 kg)" + kendaraan1.addLoad(3500));
        
        
        //menampilkan beban saat ini
        System.out.println("Beban kendaraan saat ini = " + kendaraan1.getLoad());
        
        //Membuat objek kendaraan 2 dengan konstruktor kosong
        Scanner in = new Scanner(System.in);
        System.out.println("Kendaraan 2 beban maksimal belum ada");
        VehicleEnkapsulasi kendaraan2 = new VehicleEnkapsulasi();
        //set maxLOad menggunakan method setMaxLoad
        System.out.print("Masukkan beban maksimal kendaraan: ");
        double bebanMax = in.nextDouble();
        kendaraan2.setMaxLoad(bebanMax);
        //isi beban pada kendaraan
        System.out.print("Masukkan berat beban akan diletakkan di kendaraan 2 = ");
        double beban = in.nextDouble();
        kendaraan2.addLoad(beban);
        while(beban > 0) { //true
            System.out.println("Beban berhasil dimasukkan " + beban + " kg");
            System.out.print("Masukkan berat beban akan diletakkan di kendaraan 2(input 0 jika tidak ada beban yang ingin ditambahkan lagi) = ");
            beban = in.nextDouble();
            kendaraan2.addLoad(beban);
        }
        
        if(!kendaraan2.addLoad(beban)) { //false
            System.out.println("Beban kendaraan saat ini = " + kendaraan2.getLoad());
            System.out.println("Beban akan berlebih. Penambahan beban dibatalkan");
        }else {
            System.out.println("Beban kendaraan saat ini = " + kendaraan2.getLoad());
        }
    }
}
