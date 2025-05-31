/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum270525;

/**
 *
 * @author Lenovo
 */
public class Motor extends Kendaraan {
    private String jenisHelm;
    private int CC;

    public Motor(String merk, int tahun, String jenisHelm, int CC) {
        super(merk, tahun);
        this.jenisHelm = jenisHelm;
        this.CC = CC;
    }
    
    public String getJenisHelm() {
        return jenisHelm;
    }
    
    public void setJenisHelm(String jenisHelm) {
        this.jenisHelm = jenisHelm;
    }
    
    public int getCC() {
        return CC;
    }
    
    public void setCC(int CC) {
        this.CC = CC;
    }
    
    @Override
    public void nyalakan() {
        System.out.println("Motor " + merk + " dinyalakan");
    }
    
    @Override
    public void matikan() {
        System.out.println("Motor " + merk + " dimatikan");
    }

    @Override
    public void info() {
        System.out.println("Motor " + merk + ", tahun " + tahun + ", jenis jelm " 
                + jenisHelm + ", " + CC + " cc");
    }

    @Override
    public void periksaKondisi() {
       System.out.println("Perikasa oli, rem, dan tekanan ban motor " + merk + ".");
    }

    @Override
    public void servis() {
        System.out.println("Motor " + merk + " dijadwalkan servis setiap 3.000 km");
    }
}
