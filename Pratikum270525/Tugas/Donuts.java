/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum270525;

/**
 *
 * @author Lenovo
 */
public class Donuts extends Menu {
    private String topping;
    private String filling;
    
    public Donuts(String name, double price, String topping, String filling) {
        super(name, price);
        this.topping = topping;
        this.filling = filling;
    }
    
    public String getTopping() {
        return topping;
    }
    
    public String filling() {
        return filling;
    }
    
    @Override
    public void menuInfo() {
        System.out.println("Nama: " + name);
        System.out.println("Kategori: Donuts");
        System.out.println("Topping: " + topping);
        System.out.println("Isian: " + filling);
        System.out.printf("Harga: Rp%.2f\n", price);
    }
}
