/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum180325;

/**
 *
 * @author Lenovo
 */
public class PersegiPanjang {
    public int panjang;
    public int lebar;
    public static int jumlahObjek = 0;
    
    public PersegiPanjang() {
        jumlahObjek++;
    }
    
    public PersegiPanjang(int pjbaru, int lbrbaru) {
        panjang = pjbaru;
        lebar = lbrbaru;
        jumlahObjek++;
    }
    
    public static int getJumlahObjek() {
        return jumlahObjek;
    }
    
    public int getLuas() {
        return panjang*lebar;
    }
    
    public int getKeliling() {
        return 2*(panjang+lebar);
    }
}
