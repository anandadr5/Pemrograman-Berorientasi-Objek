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
public class PembagianNol2 {
    public static void main(String[] args) {
        int x = 6, y = 2;
        try {
            System.out.println(x + "/" + y + "=" + (x / y));
            
            y = 0; //Ubah menjadi nol
            System.out.println(x + "/" + y + "=" + (x / y));
        }
        catch (Exception e) {
            System.out.println("Terjadi pembagian dengan nol.");
        }
            System.out.println("Selesai");
        }
    }