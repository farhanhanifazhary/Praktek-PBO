/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum270525;

/**
 *
 * @author Lenovo
 */
public class FeedbackManager {
    private static String[] comments = new String[100];
    private static int[] ratings = new int[100];
    private static int count = 0;

    public static void addFeedback(int rating, String comment) {
        if (count < comments.length) {
            ratings[count] = rating;
            comments[count] = comment;
            count++;
        }
    }
    
    public static void displayAllFeedback() {
        System.out.println("====== Customer Feedback ======");
        for (int i = 0; i < count; i++) {
            System.out.println((i+1) + ". " + ratings[i] + " stars - " + comments[i]);
        }
    }
}
