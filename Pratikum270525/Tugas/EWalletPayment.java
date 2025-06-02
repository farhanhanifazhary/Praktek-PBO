/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum270525;

/**
 *
 * @author Lenovo
 */
public class EWalletPayment implements PaymentProccess {
    private String eWallet;
    private double balance;
    private double totalPayment;
    
    public EWalletPayment(String eWallet, double balance) {
        this.eWallet = eWallet;
        this.balance = balance;
    }
    
    @Override
    public boolean Pay(double totalPayment) {
        if(balance > totalPayment) {
            this.totalPayment = totalPayment;
            return true;
        }else {
            return false;
        }
    }
    
    @Override
    public void display() {
        System.out.printf("Metode Pembayaran %-22s\t\tE-Wallet\n", "");
        System.out.printf("Bayar %-30s\t\t\tRp%.2f\n", "", totalPayment);
        System.out.printf("E-Wallet %-22s\t\t\t%s\n", "", eWallet);
    }
}
