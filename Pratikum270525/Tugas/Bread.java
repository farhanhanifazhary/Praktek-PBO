/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum270525;

/**
 *
 * @author Lenovo
 */
public class Bread extends Menu {
    private String breadType;
    private boolean isSliced;
    
    public Bread(String name, double price, String breadType, boolean isSliced) {
        super(name, price);
        this.breadType = breadType;
        this.isSliced = isSliced;
    }
    
    public String getBreadType() {
        return breadType;
    }
    
    public boolean getIsSliced() {
        return isSliced;
    }
    
    @Override
    public void menuInfo() {
        System.out.println("Nama: " + name);
        System.out.println("Kategori: Bread");
        System.out.println("Jenis Roti: " + breadType);
        if(isSliced) 
            System.out.println("Sliced");
        else 
            System.out.println("Loaf");
        System.out.printf("Harga: Rp%.2f\n", price);
        
    }
}
