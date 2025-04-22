/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum150425;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class HewanDemo {
    public static void main(String[] args) {
      //buat objek
      Hewan hewanUmum = new Hewan("Makhluk hidup");
      
      Scanner in = new Scanner(System.in);
      
      System.out.println("=====Program Pengapdosian Hewan=====");
      System.out.println("1. Kucing");
      System.out.println("2. Anjing");
      System.out.println("Pilih hewan yang mau diadopsi: ");
      int menu = in.nextInt();
      
      switch(menu) {
          case 1:{
              System.out.println("Beri nama kucing anda: ");
          }break;
          case 2:{
              
          }break;
      }
      Kucing kucingku = new Kucing("Bobby");
      Anjing anjingku = new Anjing("Timmy");
      
      hewanUmum.tampilkanNama();
      hewanUmum.Suara();
      
      System.out.println();
      kucingku.tampilkanNama();
      kucingku.Suara();
      System.out.println();
      anjingku.tampilkanNama();
      anjingku.Suara();
    }
}
