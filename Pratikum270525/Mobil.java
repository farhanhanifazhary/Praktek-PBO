/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum270525;

/**
 *
 * @author Lenovo
 */
public class Mobil extends Kendaraan {
    private int jumlahPintu;
    private String transmisi;

    public Mobil(String merk, int tahun, int jumlahPintu, String transmisi) {
        super(merk, tahun);
        this.jumlahPintu = jumlahPintu;
        this.transmisi = transmisi;
    }
    
    public int getJumlahPintu() {
        return jumlahPintu;
    }
    
    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }
    
    public String getTransmisi() {
        return transmisi;
    }
    
    public void setTransmisi(String transmisi) {
        this.transmisi = transmisi;
    }
    
    @Override
    public void nyalakan() {
        System.out.println("Mobil " + merk + " dinyalakan");
    }
    
    @Override
    public void matikan() {
        System.out.println("Mobil " + merk + " dimatikan");
    }
    
    @Override
    public void info(){
        System.out.println("Mobil " + merk + ", tahun " + tahun + ", jumlah pintu " 
                + jumlahPintu + ", transmisi " + transmisi);
    }

    @Override
    public void periksaKondisi() {
        System.out.println("Perikasa oli, rem, dan tekanan ban mobil " + merk + ".");
    }
    
    @Override
    public void servis() {
        System.out.println("Mobil " + merk + " dijadwalkan servis setiap 10.000 km");
    }
}
