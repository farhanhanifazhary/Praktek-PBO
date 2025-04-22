/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum150425;

/**
 *
 * @author Lenovo
 */
public class PesawatDemo {
    public static void main(String[] args) {
        Pesawat p = new Pesawat("Boeing", 2010, true, 120);
        p.cetak();
        
        System.out.println("Setelah Reset");
        p.reset("Boeing", 2010, true, 120);
        p.cetak();
        Pesawat pesawat = new Pesawat("Two-seat fighter", 1926, true, 2);
    }
}
