/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS2401082018;

/**
 *
 * @author Lenovo
 */
public class Truk extends Mobil {
    protected int muatanMaks;
    
    public void setMuatanMaks(int muatanMaks) {
        this.muatanMaks = muatanMaks;
    }
    
    public int getMuatanMaks() {
        return muatanMaks;
    }
    
    @Override
    public void display() {
        System.out.println("Kelas Taksi");
        super.display();
        System.out.println("Muatan Maks: " + muatanMaks + " Kg");
    }
}
