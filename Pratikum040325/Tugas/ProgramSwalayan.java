/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ProgramSwalayan {
    public static void main(String[] args) {
        int menu, x, y, z;
        int x2 = 0, y2 = 0, z2 = 0; //untuk menampung total barang yang dibeli
        double diskonX = 0, diskonY = 0, diskonZ = 0;
        long totalHargaX = 0, totalHargaY = 0, totalHargaZ = 0;
        char ulangMenu;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("======Program Swalayan======");
        System.out.println("|XXXXXXXXXXXXXXXXXXXXXXXXXX|");
        System.out.println("|    MEREK   |    HARGA    |");
        System.out.println("|XXXXXXXXXXXXXXXXXXXXXXXXXX|");
        System.out.println("|   1. X     | Rp. 40.000,-|");
        System.out.println("|   2. Y     | Rp. 50.000,-|");
        System.out.println("|   3. Z     | Rp. 60.000.-|");
        System.out.println("|XXXXXXXXXXXXXXXXXXXXXXXXXX|");
        do {
            System.out.println("Pilih merek yang ingin dibeli: ");
            menu = in.nextInt();
            
            switch(menu) {
            case 1:{
                System.out.print("Berapa? ");
                x = in.nextInt();
                totalHargaX += x * 40000; /*+= digunakan untuk mengatasi jika user 
                ingin menambah pembelian merek yang sama*/
                x2 += x;
                if(x2 >= 3) {
                    diskonX = totalHargaX * 0.1;
                }
            }break;
            case 2:{
                System.out.print("Berapa? ");
                y = in.nextInt();
                totalHargaY += y * 50000;
                y2 += y;
                if(y2 > 3) {
                    diskonY = totalHargaY * 0.12;
                }
            }break;
            case 3:{
                System.out.print("Berapa? ");
                z = in.nextInt();
                totalHargaZ += z * 60000;
                z2 += z;
                if(z2 > 1) {
                    diskonZ = 0.15 * (z2 - 1) * 60000;
                }
            }break;
            default:{
                System.out.print("Menu yang dipilih tidak valid");
            }
            }
            System.out.print("\nApakah ada tambahan yang lain (a/t) ");
            ulangMenu = in.next().charAt(0);
        }while(ulangMenu == 'a' || ulangMenu == 'A');
        
        double totalPembelian = totalHargaX + totalHargaY + totalHargaZ;
        System.out.println("Total pembelian: Rp. " + totalPembelian + ",-");
        System.out.println("Diskon X: Rp. " + diskonX + ",-");
        System.out.println("Diskon Y: Rp. " + diskonY + ",-");
        System.out.println("Diskon Z: Rp. " + diskonZ + ",-");
        
        double totalSemuaDiskon = diskonX + diskonY + diskonZ;
        
        System.out.println("Total semua diskon: Rp. " + totalSemuaDiskon + ",-");
        
        double totalPembayaran = totalPembelian - totalSemuaDiskon;
        
        System.out.println("Total pembayaran: Rp. " + totalPembayaran + ",-");
    }
}
