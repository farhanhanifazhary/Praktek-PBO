/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum270525;

/**
 *
 * @author Lenovo
 */
public class Keyboard extends AlatMusik implements BisaDinyalakan{
    public boolean dayaTersambung;
    
    public Keyboard(String nama, String jenis, boolean dayaTersambung) {
        super(nama, jenis);
        this.dayaTersambung = dayaTersambung;
    }
    
    @Override
    public boolean cekListrik() {
        return dayaTersambung;
    }
    
    public void setDayaTersambung(boolean dayaTersambung) {
        this.dayaTersambung = dayaTersambung;
    }
    
    @Override
    public void nyalakan() {
        if(cekListrik())
            System.out.println(nama + " dinyalakan.");
        else
            System.out.println("Daya tidak tersambung.");
    }
    
    @Override
    public void matikan() {
        System.out.println(nama + " dimatikan.");
    }

    @Override
    public void mainkan() {
        System.out.println(nama + " dimainkan dengan menakan tuts.");
    }

    @Override
    public void stem() {
        System.out.println("Keyboard " + nama + " sistem digital melalui aplikasi.");
    }

    

    
    
}
