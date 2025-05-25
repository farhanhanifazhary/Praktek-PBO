/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum200525;

/**
 *
 * @author Lenovo
 */
public class SmartWatch extends Smartphone{
    private int ukuranLayar;
    private boolean tahanAir;
    
    public SmartWatch() {
        
    }
    
    public int getUkuranLayar() {
        return ukuranLayar;
    }
    
    public void setUkuranLayar(int ukuranLayar) {
        this.ukuranLayar = ukuranLayar;
    }
    
    public void isTahanAir(boolean tahanAir) {
        this.tahanAir = tahanAir;
    }
    
    public boolean getTahanAir(){
        return tahanAir;
    }
    
    public void display() {
        System.out.println("Kelas Smartphone");
        super.display();
        System.out.println("Ukuran Layar: " + ukuranLayar + " inch");
        String TahanAir = tahanAir ? "Iya":"Tidak";
        System.out.println("Tahan air: " +  TahanAir);
    }
}
