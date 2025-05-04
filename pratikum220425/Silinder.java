/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum220425;

/**
 *
 * @author Lenovo
 */
public class Silinder extends Lingkaran {
    private double tinggi;
    
    public Silinder() {
        super();
    }
    
    public Silinder(double r, double t) {
        super(r);
        this.tinggi = t;
    }
    
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    public double getTinggi() {
        return tinggi;
    }
    
    public double getVolume() {
        return super.getLuas() * tinggi;
    }
    
    @Override
    public double getLuas() {
        return getKeliling() * tinggi;
    }
    
    @Override
    public String toString() {
        return "Tinggi(t) = " + getTinggi() + "\n" +
                "Volume = " + getVolume() + "\n" +
                "Luas Silinder = " + getLuas();
    }
}
