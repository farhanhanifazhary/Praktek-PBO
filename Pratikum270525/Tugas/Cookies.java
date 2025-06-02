/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum270525;

/**
 *
 * @author Lenovo
 */
public class Cookies extends Menu {
    private boolean isCrispy;
    private String topping;
    
    public Cookies(String name, double price, boolean isCrispy, String topping) {
        super(name, price);
        this.isCrispy = isCrispy;
        this.topping = topping;
    }
    
    public boolean getIsCrispy() {
        return isCrispy;
    }
    
    public String topping() {
        return topping;
    }
    
    @Override
    public void menuInfo() {
        System.out.println("Nama " + name);
        System.out.println("Kategori: Cookies");
        if(isCrispy)
            System.out.println("Crispy");
        else
            System.out.println("Chewy");
        System.out.println("Topping: " + topping);
        System.out.printf("Harga: Rp%.2f\n", price);
    }
}
