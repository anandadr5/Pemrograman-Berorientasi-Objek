/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputdanOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Ananda Dwi Rizkyta
 */
public class DemoInputString {
    public static void main(String[] args) throws IOException {
        System.out.print("Masukkan nama Anda: ");
        String namaInput;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        namaInput = br.readLine();
        System.out.println("Halo " + namaInput + "...");
        System.out.println("Semoga Anda Sukses Selalu..");
    }
}
