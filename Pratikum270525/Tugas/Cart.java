/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum270525;

/**
 *
 * @author Lenovo
 */
public class Cart {
    private static Menu[] items = new Menu[100];
    private static int[] quantities = new int[100];
    private static int itemCount = 0;
    
    public static void addItem(Menu item, int quantity) {
        if(itemCount < items.length) {
            items[itemCount] = item;
            quantities[itemCount] = quantity;
            itemCount++;
        }else {
            System.out.println("Keranjang Penuh");
        }
    }
    
    public static void removeItem(int index) {
        if(index >= 0 && index < itemCount) {
            System.out.println(items[index].getName() + " telah dihapus dari keranjang ");
            for(int i = index; i < itemCount - 1; i++) {
                items[i] = items[i + 1];
                quantities[i] = quantities[i + 1];
            }
            items[itemCount - 1] = null;
            quantities[itemCount - 1] = 0;
            itemCount--;
        }else {
            System.out.println("Indeks item tidak valid");
        }
    }
    
    public static double getTotalPayment() {
        double totalPayment = 0;
        for(int i = 0; i < itemCount; i++) {
            totalPayment = (items[i].getPrice() * quantities[i]) + totalPayment;
        }
        return totalPayment;
    }
    
    public static int getItemCount() {
        return itemCount;
    }
    
    public static void printReceipt(PaymentProccess payment) {
        System.out.println("================================================================");
        System.out.println("                          BAKERY RECEIPT                        ");
        System.out.println("================================================================");
        for (int i = 0; i < itemCount; i++) {
            System.out.printf("%d. %-30s x%d\tRp%.2f\tRp%.2f%n", 
                (i + 1), items[i].getName(), quantities[i], items[i].getPrice(), 
                (items[i].getPrice() * quantities[i]));
        }
        System.out.println("----------------------------------------------------------------");
        System.out.printf("Total %-30s\t\t\tRp%.2f\n","", getTotalPayment());
        payment.display();
        System.out.println("================================================================");
    }
    
    public static void displayChart() {
        for (int i = 0; i < itemCount; i++) {
            System.out.printf("%d. %-30s x%d\tRp%.2f\tRp%.2f%n", 
                (i + 1), items[i].getName(), quantities[i], items[i].getPrice(), 
                (items[i].getPrice() * quantities[i]));
        }
        System.out.println("----------------------------------------------------------------");
        System.out.printf("Total %-30s\t\t\tRp%.2f\n\n","", getTotalPayment());
    }
}
