/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum200525;

/**
 *
 * @author Lenovo
 */
public class Laptop extends Elektronik {
    private int ukuranLayar;
    private int kapasitasRAM;
    
    public Laptop() {
        super();
    }

    public int getUkuranLayar() {
        return ukuranLayar;
    }
    
    public void setUkuranLayar(int ukuranLayar) {
        this.ukuranLayar = ukuranLayar;
    }
    
    public int getKapasitasRAM() {
        return kapasitasRAM;
    }
    
    public void setKapasitasRAM(int kapasitasRAM) {
        this.kapasitasRAM = kapasitasRAM;
    }
    
    @Override
    public void display() {
        super.display();
        System.out.println("Ukuran Layar: " + ukuranLayar);
        System.out.println("Kapasitas RAM: " + kapasitasRAM);
    }
}
