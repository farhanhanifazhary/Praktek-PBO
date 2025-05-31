/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum270525;

/**
 *
 * @author Lenovo
 */
public class Gitar extends AlatMusik {
    private int jumlahSenar;

    public Gitar(String nama, String jenis, int jumlahSenar) {
        super(nama, jenis);
        this.jumlahSenar = jumlahSenar;
    }
    
    public int getJumlahSenar() {
        return jumlahSenar;
    }
    
    public void setJumlahSenar(int jumlahSenar) {
        this.jumlahSenar = jumlahSenar;
    }

    @Override
    public void mainkan() {
        System.out.println(nama + " dipetik dengan " + jumlahSenar + " senar");
    }

    @Override
    public void stem() {
        System.out.println("Menyetem gitar " + nama + " secara ");
    }
    
    
}
