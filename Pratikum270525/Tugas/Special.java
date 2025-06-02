/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum270525;

/**
 *
 * @author Lenovo
 */
public class Special extends Menu {
    private String filling;
    private String shape;
    
    public Special(String name, double price, String filling, String shape) {
        super(name, price);
        this.filling = filling;
        this.shape = shape;
    }
    
    public String getFilling() {
        return filling;
    }
    
    public String getShape() {
        return shape;
    }
    
    @Override
    public void menuInfo() {
        System.out.println("Nama: " + name);
        System.out.println("Kategori: Special");
        System.out.println("Isian: " + filling);
        System.out.println("Bentuk: " + shape);
        System.out.printf("Harga: Rp%.2f\n", price);
    }
}
