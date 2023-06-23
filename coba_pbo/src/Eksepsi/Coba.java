/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eksepsi;

/**
 *
 * @author Ananda Dwi Rizkyta
 */
public class Coba {
    public static void main(String[] args) {
        int bil = 10;
        String b[] = {"a", "b", "c"};
        try {
            System.out.println(bil / 0);
            System.out.println(b [77]);
        }
        catch (ArithmeticException ai) {
            System.out.println("Error Aritmetik");
            System.out.println(ai.getMessage());
        }
        
        try {
            System.out.println(b [77]);
        }
        catch (ArrayIndexOutOfBoundsException n) {
            System.out.println("Error karena melebihi kapasitas array");
            System.out.println(n.getMessage());
        }
    }
}
