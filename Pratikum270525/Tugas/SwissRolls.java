/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum270525;

/**
 *
 * @author Lenovo
 */
public class SwissRolls extends Menu {
    private String flavor;
    private float length;
    
    public SwissRolls(String name, double price, String flavor, float length) {
        super(name, price);
        this.flavor = flavor;
        this.length = length;
    }
    
    public String getFlavor() {
        return flavor;
    }
    
    public float getLength() {
        return length;
    }
    
    @Override
    public void menuInfo() {
        System.out.println("Nama: " + name);
        System.out.println("Kategori: Swiss Rolls");
        System.out.println("Rasa: " + flavor);
        System.out.println("Panjang: " + length + " cm");
        System.out.printf("Harga: Rp%.2f\n", price);
    }
}
