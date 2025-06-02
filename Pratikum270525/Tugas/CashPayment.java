/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum270525;

/**
 *
 * @author Lenovo
 */
public class CashPayment implements PaymentProccess {
    private double cashReceived;
    private double change;
    
    public CashPayment(double cashReceived) {
        this.cashReceived = cashReceived;
    }
    
    @Override
    public boolean Pay(double totalPayment) {
        if(cashReceived > totalPayment) {
            change = cashReceived - totalPayment;
            return true;
        }else {
            return false;
        }
    }
    
    @Override
    public void display() {
        System.out.printf("Metode Pembayaran %-22s\t\tCash\n", "");
        System.out.printf("Bayar %-30s\t\t\tRp%.2f\n", "", cashReceived);
        System.out.printf("Kembali %-30s\t\t\tRp%.2f\n", "", change);
    }
}
