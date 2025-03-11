/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum110325;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nim;
        String nama;
        int uts;
        int uas;
        int tugas;
        int quiz;
        int nilaiAkhir;
        
        System.out.print("Masukkan Nama: ");
        nama = in.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = in.nextLine();
        System.out.print("Masukkan nilai UTS: ");
        uts = in.nextInt();
        System.out.print("Masukkan nilai UAS: ");
        uas = in.nextInt();
        System.out.print("Nilai tugas: ");
        tugas = in.nextInt();
        System.out.print("Nilai quiz: ");
        quiz = in.nextInt();
        
        nilaiAkhir = (int) ((quiz * 0.15) + (tugas * 0.20) + (uts * 0.3) + (uas * 0.35));
        //objek baru -- class kendaraan
        Mahasiswa mhs = new Mahasiswa(nim, nama, uts, uas, tugas, quiz);
        mhs.DataMahasiswa();
        mhs.NilaiAkhir(nilaiAkhir);
        mhs.CekLulus(nilaiAkhir);
    }
}
