/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum270525;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class BakeryMain {
    public static void main(String[] args) {
        // Iniasi awal
        Scanner scan = new Scanner(System.in);
        String[] eWallet = {"Dana", "LinkAja", "ShopeePay", "GoPay", "OVO"};
        String[] kartuKredit = {"BCA", "BNI", "BRI"};
        
        // Penambahan menu class Bread
        MenuManager.addMenu(new Bread("Loaf Of Bread", 12000, "Wheat", false));
        MenuManager.addMenu(new Bread("Bread Slices", 8000, "Wheat", true));
        MenuManager.addMenu(new Bread("Chocolate Bread", 9000, "Flour", true));
        MenuManager.addMenu(new Bread("Melon Bread", 10000, "Flour", false));
        
        // Penambahan menu class Donuts
        MenuManager.addMenu(new Donuts("Plain Donut", 4500, "No Topping", "No Filling"));
        MenuManager.addMenu(new Donuts("Pink Frosted Donut", 6500, "Strawberry Glaze", "No Filing"));
        MenuManager.addMenu(new Donuts("Cat Frosted Donut", 8500, "Mixed", "No Filling"));
        
        // Penambahan menu class Cookies
        MenuManager.addMenu(new Cookies("Checkerboard Cookies", 7500, true, "No Topping"));
        
        // Penambahan menu class SwissRolls
        MenuManager.addMenu(new SwissRolls("Matcha Sponge Cake", 9500, "Matcha", 12));
        MenuManager.addMenu(new SwissRolls("Choco-Strawberry Sponge", 11500, "Choco-Strawberry", 13));
        
        // Penambahan menu class Special
        MenuManager.addMenu(new Special("Choco Cornet", 8500, "Chocolate", "Horn"));
        
        ///////////////////////////////////////////////////////////////////////////////////////////////
        
        // Menampilkan menu
        MenuManager.showMenu();
        char pemilihanItem;
        
        // Memilih menu yang ingin dibeli
        do {
            int item;
            do {
                System.out.println("Pilih menu yang ingin dibeli: ");
                item = scan.nextInt();
                
                if(item < 1 || item > MenuManager.getItemCount())
                    System.out.println("Menu yang dipilih tidak valid\n");
            }while(item < 1 || item > MenuManager.getItemCount());
            System.out.println("Masukkan jumlah menu yang ingin dibeli: ");
            int jumlah = scan.nextInt();
            
            Cart.addItem(MenuManager.getMenu(item - 1), jumlah);
            
            System.out.print("\nApakah ada tambahan yang lain? (y/t) ");
            pemilihanItem = scan.next().charAt(0);
        }while(pemilihanItem == 'y');
        
        // Menampilkan isi keranjang
        Cart.displayChart();
        
        System.out.println("Apakah ada yang ingin diubah dari keranjang? (y/t) ");
        char editPemilihanMenu = scan.next().charAt(0);
        
        System.out.println();
        
        // mengedit isi keranjang
        while(editPemilihanMenu == 'y') {
            int editKeranjang;
            do {
                System.out.println("Apa yang ingin diubah?");
                System.out.println("1. Menambah menu yang ingin dibeli");
                System.out.println("2. Menghapus menu di keranjang");
                editKeranjang = scan.nextInt();
                
                if(editKeranjang < 1 || editKeranjang > 2) 
                    System.out.println("Fitur tidak valid\n");
            }while(editKeranjang < 1 || editKeranjang > 2);
            
            System.out.println();
            
            switch(editKeranjang) {
                case 1: {
                    do {
                        int item;
                        do {
                            System.out.println("Pilih menu yang ingin dibeli: ");
                            item = scan.nextInt();
                            
                            if(item < 1 || item > MenuManager.getItemCount())
                                System.out.println("Menu yang dipilih tidak valid\n");
                        }while(item < 1 || item > MenuManager.getItemCount());
                        
                        System.out.println("Masukkan jumlah menu yang ingin dibeli: ");
                        int jumlah = scan.nextInt();

                        Cart.addItem(MenuManager.getMenu(item - 1), jumlah);

                        System.out.print("\nApakah ada tambahan yang lain? (y/t) ");
                        pemilihanItem = scan.next().charAt(0);
                    }while(pemilihanItem == 'y');
                }break;
                case 2: {
                    int hapusItem;
                    do {
                        int hapus;
                        do {
                            Cart.displayChart();
                            System.out.println("Pilih Menu yang ingin dihapus dari keranjang: ");
                            hapus = scan.nextInt();
                            
                            if(hapus < 1 || hapus > Cart.getItemCount())
                                System.out.println("Item yang dipilih tidak valid\n");
                        }while(hapus < 1 || hapus > Cart.getItemCount());
                        
                        Cart.removeItem(hapus - 1);
                        System.out.print("\nApakah ada lagi item yang ingin dihapus? (y/t) ");
                        hapusItem = scan.next().charAt(0);
                    }while(hapusItem == 'y');
                }
            }
            
            Cart.displayChart();
            
            System.out.println("Apakah ada lagi yang ingin diubah (y/t) ");
            editPemilihanMenu = scan.next().charAt(0);
        }
        
        System.out.println();
        
        int metodePembayaran;
        do {
            // Pemilihan Metode Pembayaran
            System.out.println("Metode Pembayaran");
            System.out.println("1. Cash");
            System.out.println("2. E-Wallet");
            System.out.println("3. Kredit");
            System.out.println("Pilih metode pembayaran: ");
            metodePembayaran = scan.nextInt();
            
            if(metodePembayaran < 1 || metodePembayaran > 3)
                System.out.println("Metode pembayaran tidak valid\n");
        }while(metodePembayaran < 1 || metodePembayaran > 3);
        
        PaymentProccess payment = null;
        char pengubahanMetodeBayar = 0;
        do {
            switch(metodePembayaran) {
                case 1: {
                    System.out.println("Masukkan jumlah uang: ");
                    double uang = scan.nextInt();
                    payment = new CashPayment(uang);
                }break;
                case 2: {
                    int pilihanEWallet;
                    
                    do {
                        System.out.println("========== Daftar E-Wallet ==========");
                        System.out.println("1. Dana");
                        System.out.println("2. LinkAja");
                        System.out.println("3. ShopeePay");
                        System.out.println("4. GoPay");
                        System.out.println("5. OVO");
                        System.out.println("Pilih E-Wallet untuk pembayaran: ");
                        pilihanEWallet = scan.nextInt();
                        
                        if(pilihanEWallet < 0 || pilihanEWallet > 5)
                            System.out.println("Pilihan E-Wallet tidak valid. Silahkan pilih lagi\n");
                    }while(pilihanEWallet < 0 || pilihanEWallet > 5);
                    
                    System.out.println("Masukkan saldo: ");
                    double saldo = scan.nextDouble();
                    payment = new EWalletPayment(eWallet[pilihanEWallet - 1], saldo);
                }break;
                case 3: {
                    int pilihanBank;
                    do {
                        System.out.println("========== Daftar Bank ==========");
                        System.out.println("1. BCA");
                        System.out.println("2. BNI");
                        System.out.println("3. BRI");
                        System.out.println("Pilih bank untuk pembayaran: ");
                        pilihanBank = scan.nextInt();
                        
                        if(pilihanBank < 1 || pilihanBank > 3)
                            System.out.println("Bank yang dipilih tidak valid");
                    }while(pilihanBank < 1 || pilihanBank > 3);
                    
                    String nomor;
                    do {
                        System.out.println("Masukkan nomor kartu kredit:");
                        nomor = scan.nextLine();
                        
                        if(nomor.length() != 16)
                            System.out.println("Nomor kartu kredit tidak valid. Nomor kartu kredit berjumlah 16 digit\n");
                    }while(nomor.length() != 16);
                    
                    String expiredDate;
                    do {
                        System.out.println("Masukkan expired date (format: MM/YY): ");
                        expiredDate = scan.nextLine();

                        if(expiredDate.charAt(2) != '/')
                            System.out.println("Format salah\n");
                    }while(expiredDate.charAt(2) != '/');
                    
                    String cvv;
                    do {
                        System.out.println("Masukkan CVV:");
                        cvv = scan.nextLine();
                        
                        if(cvv.length() != 3)
                            System.out.println("CVV tidak valid. CVV berjumlah 3 digit\n");
                    }while(cvv.length() != 3);
                    
                    System.out.println("Masukkan limit kartu kredit: ");
                    double limit = scan.nextDouble();
                    payment = new CreditPayment(kartuKredit[pilihanBank - 1], nomor, expiredDate, cvv, limit);
                }

                if(payment.Pay(Cart.getTotalPayment())) {
                    System.out.println("Pembayaran berhasil.");
                    Cart.displayChart();
                }else {
                    System.out.println("Pembayaran gagal.");
                    System.out.println("Apakah ingin mengubah metode pembayaran? (y/t) ");
                    pengubahanMetodeBayar = scan.next().charAt(0);
                }
            }
        }while(pengubahanMetodeBayar == 'y');
        
        if(payment.Pay(Cart.getTotalPayment())) {
            // Menampilkan struk belanja
            Cart.printReceipt(payment);
            
            System.out.println("Mohon isi rating & feedback di bawah agar kami dapat meningkatkan pelayanan maupun menu yang kami buat");
            System.out.println("Rating (1-5): ");
            int rating = scan.nextInt();
            System.out.println("Feedback: ");
            scan.nextLine();
            String feedback = scan.nextLine();
            
            FeedbackManager.addFeedback(rating, feedback);
        }
        
        System.out.println("Terima kasih!");
    }
}
