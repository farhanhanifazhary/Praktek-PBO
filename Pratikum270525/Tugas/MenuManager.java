/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum270525;

/**
 *
 * @author Lenovo
 */
public class MenuManager {
    private static Menu[] menuItems = new Menu[100];
    private static int itemCount = 0;
    
    public static void addMenu(Menu item) {
        if(itemCount < menuItems.length) {
            menuItems[itemCount] = item;
            itemCount++;
        }
    }
    
    public static void removeMenu(int index) {
        if(index >= 0 && index < itemCount) {
            System.out.println(menuItems[index].getName() + " telah dihapus dari menu");
            for (int i = index; i < itemCount - 1; i++) {
                menuItems[i] = menuItems[i + 1];
            }
            menuItems[itemCount - 1] = null;
            itemCount--;
        }else {
            System.out.println("Indeks item tidak valid");
        }
    }
    
    public static void showMenu(){
        System.out.println("\n========== YAMABUKI BAKERY ==========");
        for(int i = 0; i < itemCount; i++) {
            System.out.print((i + 1) + ". ");
            menuItems[i].menuInfo();
            System.out.println();
        }
    }
    
    public static Menu getMenu(int index) {
        if(index >= 0 && index < itemCount) {
            return menuItems[index];
        }
        return null;
    }
    
    public static int getItemCount() {
        return itemCount;
    }
}
