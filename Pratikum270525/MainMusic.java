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
public class MainMusic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ulang = 0;
        
        do {
            System.out.println("=====Program Toko Musik=====");
            System.out.println("1. Gitar");
            System.out.println("2. Keyboard");
            System.out.println("Pilih alat musik: ");
            int alatMusik = in.nextInt();
            in.nextLine();
            switch(alatMusik) {
                case 1: {
                    System.out.println("Masukkan nama gitar: ");
                    String nama = in.nextLine();
                    System.out.println("Masukkan jumlah senar: ");
                    int senar = in.nextInt();

                    Gitar gitar = new Gitar(nama, "petik", senar);
                    
                    System.out.println();
                    
                    System.out.println("--- Info Gitar ---");
                    gitar.info();
                    gitar.mainkan();
                    gitar.stem();
                }break;
                case 2: {
                    System.out.println("Masukkan nama keyboard: ");
                    String nama = in.nextLine();
                    System.out.println("Apakah keyboard telah terhubung dengan listrik? (y/t): ");
                    char listrik = in.next().charAt(0);
                    boolean daya;

                    if(listrik == 'y') {
                        daya = true;
                    }else {
                        daya = false;
                    }


                    Keyboard keyboard = new Keyboard(nama, "Tekan", daya);
                    
                    System.out.println();
                    
                    System.out.println("--- Infor Keyboard ---");
                    keyboard.info();
                    keyboard.nyalakan();
                    keyboard.mainkan();
                    keyboard.stem();
                    keyboard.matikan();
                }break;
                default: {
                    System.out.println("Alat musik yang dipilih tidak valid");
                }
            }

            System.out.println("Apakah ingin mengulang program? (y/t)");
            ulang = in.next().charAt(0);
        }while(ulang == 'y');
    }
}
