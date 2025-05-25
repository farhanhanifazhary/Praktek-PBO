/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum200525;

/**
 *
 * @author Lenovo
 */
public class Gaming extends Laptop {
    private String kartuGrafis;
    private int refreshRate;
    
    public Gaming() {
        super();
    }
    
    public String getKartuGrafis() {
        return kartuGrafis;
    }
    
    public void setKartuGrafis(String kartuGrafis) {
        this.kartuGrafis = kartuGrafis;
    }
    
    public int getRefreshRate() {
        return refreshRate;
    }
    
    public void setRefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
    }
    
    @Override
    public void display() {
        System.out.println("Kelas Laptop");
        super.display();
        System.out.println("Kartu Grafis: " + kartuGrafis);
        System.out.println("Refresh Rate: " + refreshRate);
    }
}
