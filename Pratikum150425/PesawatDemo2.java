/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum150425;

/**
 *
 * @author Lenovo
 */
public class PesawatDemo2 {
    public static void main(String[] args) {
        Pesawat[] daftarPesawat = new Pesawat[3];
        
        //mengisi elemen array
        daftarPesawat[0] = new Pesawat("Lion Air", 2015, true, 80);
        daftarPesawat[1] = new Pesawat("Air Asia", 2018, false, 120);
        daftarPesawat[2] = new Pesawat("Garuda", 2020, true, 180);
        
        //menampilkan isi array
        for(int i = 0; i < daftarPesawat.length; i ++) {
            System.out.println("Data Pesawat ke " + (i + 1) + " adalah");
            daftarPesawat[i].cetak();
            System.out.println();
        }
    }
}
