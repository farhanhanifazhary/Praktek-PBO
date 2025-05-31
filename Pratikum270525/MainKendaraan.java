/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum270525;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class MainKendaraan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ulang;
        
        do{
            System.out.println("=====Program Dealer Mobil & Motor");
            System.out.println("1. Mobil");
            System.out.println("2. Motor");
            System.out.println("Pilih dealer yang ingin dituju");
            int dealer = in.nextInt();
            in.nextLine();
            
            switch(dealer) {
                case 1: {
                    System.out.println("Masukkan merk mobil: ");
                    String merk = in.nextLine();
                    System.out.println("Masukkan tahun mobil: ");
                    int tahun = in.nextInt();
                    System.out.println("Masukkan jumlah pintu: ");
                    int pintu = in.nextInt();
                    System.out.println("Masukkan transmisi mobil: ");
                    in.nextLine();
                    String transmisi = in.nextLine();
                    
                    System.out.println();

                    Mobil mobil = new Mobil(merk, tahun, pintu, transmisi);
                    System.out.println("---info mobil---");
                    mobil.nyalakan();
                    mobil.info();
                    mobil.periksaKondisi();
                    mobil.servis();
                    mobil.matikan();
                }break;
                case 2: {
                    System.out.println("Masukkan nama motor: ");
                    String nama = in.nextLine();
                    System.out.println("Masukkan tahun motor: ");
                    int tahun = in.nextInt();
                    System.out.println("Masukkan jenis helm: ");
                    in.nextLine();
                    String helm = in.nextLine();
                    System.out.println("Masukkan cc motor: ");
                    int cc = in.nextInt();

                    Motor motor = new Motor(nama, tahun, helm, cc);
                    
                    System.out.println();
                    
                    System.out.println("--- Info Motor ---");
                    motor.nyalakan();
                    motor.info();
                    motor.periksaKondisi();
                    motor.servis();
                    motor.matikan();
                }break;
                default: {
                    System.out.println("dealer yang dipilih tidak valid");
                }
            }
            
            System.out.println("Apakah ingin mengulang program? (y/t)");
            ulang = in.next().charAt(0);
        }while(ulang == 'y');
    }
}
