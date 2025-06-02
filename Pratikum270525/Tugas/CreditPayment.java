/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum270525;

/**
 *
 * @author Lenovo
 */
public class CreditPayment implements PaymentProccess {
    private String creditCard;
    private String cardNumber;
    private String expiredDate;
    private String cvv;
    private double limit;
    private double totalPayment;
    
    public CreditPayment(String creditCard, String cardNumber, String expiredDate, String cvv, double limit) {
        this.creditCard = creditCard;
        this.cardNumber = cardNumber;
        this.expiredDate = expiredDate;
        this.cvv = cvv;
        this.limit = limit;
    }
    
    @Override
    public boolean Pay(double totalPayment) {
        if(limit > totalPayment) {
            this.totalPayment = totalPayment;
            return true;
        }else {
            return false;
        }
    }
    
        @Override
    public void display() {
        System.out.printf("Metode Pembayaran %-30s\t\tKartu Kredit\n", "");
        System.out.printf("Bayar %-30s\t\t\tRp%.2f\n", "", totalPayment);
        System.out.printf("Bank %-30s\t\t\t%s\n", "", creditCard);
    }
}
