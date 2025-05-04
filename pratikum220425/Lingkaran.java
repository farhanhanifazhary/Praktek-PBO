/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum220425;

/**
 *
 * @author Lenovo
 */
public class Lingkaran {
    private double r;
    
    public Lingkaran() {
        
    }
    
    public Lingkaran(double r) {
        this.r = r;
    }
    
    public void setR(double r) {
        this.r = r;
    }
    
    public double getR() {
        return r;
    }
    
    public double getDiameter() {
        return 2 * r;
    }
    
    public double getKeliling() {
        return 2 * r * Math.PI;
    }
    
    public double getLuas() {
        return r * r * Math.PI;
    }
    
    @Override
    public String toString() {
        return "Jari-jari(r) = " + getR() + "\n" +
                "Diameter(d) = " + getDiameter() + "\n" +
                "Keliling = " + getKeliling() + "\n" +
                "Luas = " + getLuas();
    }
    
    
}
