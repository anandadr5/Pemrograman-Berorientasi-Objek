/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputdanOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Ananda Dwi Rizkyta
 */
class DemoBacaFile {
    public static void main(String[] args) {
        FileInputStream finput = null;
        int data;
        // membuka file
        try {
            finput = new FileInputStream("C:/INPUT.txt");
            
        }catch (FileNotFoundException fnfe) {
            System.out.println("File tidak ditemukan.");
            return; // keluar dari method
        }
        // membaca data dari dalam file
        // dan menampilkan hasilnya ke layar console
        try {
            while ((data = finput.read()) != -1) {
                // ketika ditampilkan, data dikonversi ke tipe char
                System.out.print((char) data);
            }
        }catch (IOException ioe) {
            System.out.println(ioe.getMessage());
            return;
        }
        // menutup file
        try {
            finput.close();
        }catch (IOException ioe) {
            }
        }
    }