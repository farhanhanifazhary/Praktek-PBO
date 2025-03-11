/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum110325;

/**
 *
 * @author Lenovo
 */
public class Mahasiswa {
    String nim;
    String nama;
    int uts;
    int uas;
    int tugas;
    int quiz;
    
    public Mahasiswa(String nim, String nama, int uts, int uas, int tugas, int quiz) {
        this.nim = nim;
        this.nama = nama;
        this.uts = uts;
        this.uas = uas;
        this.quiz = quiz;
    }
    
    //method tanpa parameter
    public void DataMahasiswa() {
        System.out.println("===DATA MAHASISWA===");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("UTS: " + uts);
        System.out.println("UAS: " + uas);
    }
    
    //method dengan parameter
    public void NilaiAkhir(int nilaiAkhir) {
        if(nilaiAkhir > 80) {
            System.out.println("Nilai akhir: " + nilaiAkhir);
            System.out.println("Indeks Prestasi: A");
        }else if(nilaiAkhir >= 65 && nilaiAkhir <= 80) {
            System.out.println("Nilai akhir: " + nilaiAkhir);
            System.out.println("Indeks Prestasi: B");
        }else if(nilaiAkhir >= 55 && nilaiAkhir <= 64) {
            System.out.println("Nilai akhir: " + nilaiAkhir);
            System.out.println("Indeks Prestasi: C");
        }else if(nilaiAkhir >= 40 && nilaiAkhir <= 54) {
            System.out.println("Nilai akhir: " + nilaiAkhir);
            System.out.println("Indeks Prestasi: D");
        }else {
            System.out.println("Nilai akhir: " + nilaiAkhir);
            System.out.println("Indeks Prestasi: E");
        }
    }
    
    public void CekLulus(int nilaiAkhir) {
        if(nilaiAkhir >= 70)
            System.out.println("Anda Lulus!");
        else
            System.out.println("Anda tidak lulus!");
    }
}
