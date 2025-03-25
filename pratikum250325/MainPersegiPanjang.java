/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratikum250325;

/**
 *
 * @author 
 * Nama: Farhan Hanif Azhary
 * No. BP: 2401082018
 * Kelas: TK 1B
 */

import java.util.Scanner;

public class MainPersegiPanjang {
    public static void main(String[] args) {
        //objek pertama
        System.out.println("Objek Pertama");
        PersegiPanjangEnkapsulasi PP1 = new PersegiPanjangEnkapsulasi();
        PP1.setPanjang(8);
        PP1.setLebar(4);
        System.out.println("Banyak objek setelah PP1 = " + PersegiPanjangEnkapsulasi.getJumlahObjek());
        System.out.println("Keliling = 2(" + PP1.getPanjang() + " + " + PP1.getLebar() + ") = "+ PP1.getKeliling());
        System.out.println("Luas = " + PP1.getPanjang() + " * " + PP1.getLebar() + " = " + PP1.getLuas());
        
        //objek kedua
        System.out.println("\nObjek Kedua");
        PersegiPanjangEnkapsulasi PP2 = new PersegiPanjangEnkapsulasi(15, 4);
        System.out.println("Banyak objek setelah PP2 = " + PersegiPanjangEnkapsulasi.getJumlahObjek());
        System.out.println("Keliling = 2(" + PP2.getPanjang() + " + " + PP2.getLebar() + ") = "+ PP2.getKeliling());
        System.out.println("Luas = " + PP2.getPanjang() + " * " + PP2.getLebar() + " = " + PP2.getLuas());
        
        //objek ketiga dengan user input
        System.out.println("\nObjek Ketiga");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan panjang: ");
        int panjang = scanner.nextInt();
        System.out.print("Masukkan lebar: ");
        int lebar = scanner.nextInt();
        PersegiPanjangEnkapsulasi PP3 = new PersegiPanjangEnkapsulasi(panjang, lebar);
        System.out.println("Banyak objek setelah PP3 = " + PersegiPanjangEnkapsulasi.getJumlahObjek());
        System.out.println("Keliling = 2(" + PP3.getPanjang() + " + " + PP3.getLebar() + ") = "+ PP3.getKeliling());
        System.out.println("Luas = " + PP3.getPanjang() + " * " + PP3.getLebar() + " = " + PP3.getLuas());
    }
}
