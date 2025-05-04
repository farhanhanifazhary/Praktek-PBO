/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum220425;

/**
 *
 * @author Lenovo
 */
public class Kerucut extends Lingkaran{
    private double tinggi;
    
    public Kerucut() {
        super();
    }
    
    public Kerucut(double r, double t) {
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
        return (super.getLuas() * tinggi)/3;
    }
    
    @Override
    public double getLuas() {
        return Math.PI * getR() * Math.sqrt(tinggi * tinggi + getR() * getR());
    }
    
    @Override
    public String toString() {
        return "Tinggi(t) = " + getTinggi() + "\n" +
                "Volume Kerucut = " + getVolume() + "\n" +
                "Luas Kerucut = " + getLuas();
    }
}
