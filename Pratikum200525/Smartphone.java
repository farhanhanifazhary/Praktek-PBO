/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum200525;

/**
 *
 * @author Lenovo
 */
public class Smartphone extends Elektronik {
    private int kapasitasBaterai;
    private int jumlahKamera;
    
    public Smartphone() {
        
    }
    
    public int getKapasitasBaterai() {
        return kapasitasBaterai;
    }
    
    public void setKapasitasBaterai(int kapasitasBaterai) {
        this.kapasitasBaterai = kapasitasBaterai;
    }
    
    public int getJumlahKamera() {
        return jumlahKamera;
    }
    
    public void setJumlahKamera(int jumlahKamera) {
        this.jumlahKamera = jumlahKamera;
    }
    
    @Override
    public void display() {
        super.display();
        System.out.println("Kapasitas Baterai: " + kapasitasBaterai);
        System.out.println("Jumlah Kamera: " + jumlahKamera);
    }
}
