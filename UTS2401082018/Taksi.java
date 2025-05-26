/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS2401082018;

/**
 *
 * @author Lenovo
 */
public class Taksi extends Mobil {
    protected int tarifAwal;
    protected int tarifPerKm;
    
    public void setTarifAwal(int tarifAwal) {
        this.tarifAwal = tarifAwal;
    }
    
    public int getTarifAwal() {
        return tarifAwal;
    }
    
    public void setTarifPerKm(int tarifPerKm) {
        this.tarifPerKm = tarifPerKm;
    }
    
    public int getTarifPerKm() {
        return tarifPerKm;
    }
    
    @Override
    public void display() {
        System.out.println("Kelas Taksi");
        super.display();
        System.out.println("Tarif Awal: " + tarifAwal);
        System.out.println("Tarif per Km: " + tarifPerKm);
    }
}
