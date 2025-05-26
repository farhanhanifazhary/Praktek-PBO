/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS2401082018;

/**
 *
 * @author Lenovo
 */
public class Mobil extends Kendaraan {
    protected String bahanBakar;
    protected int kapasitasBaterai;
    
    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }
    
    public String getBahanBakar() {
        return bahanBakar;
    }
    
    public void setKapasitasBaterai(int kapasitasBaterai) {
        this.kapasitasBaterai = kapasitasBaterai;
    }
    
    public int getKapasitasBaterai() {
        return kapasitasBaterai;
    }
    
    @Override
    public void display() {
        super.display();
        System.out.println("Bahan Bakar: " + bahanBakar);
        System.out.println("Kapasitas Baterai: " + kapasitasBaterai);
    }
}
