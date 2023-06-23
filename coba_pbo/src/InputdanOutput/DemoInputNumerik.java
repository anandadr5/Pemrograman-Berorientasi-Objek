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
class DemoInputNumerik {
    public static void main(String[] args) throws IOException {
        System.out.print("Masukkan sebuah bilangan bulat: ");
        String temp;
        int bilanganInput = 0;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        // input data dianggap sebagai string
        temp = br.readLine();
        try {
            // konversi dari string ke integer
            bilanganInput = Integer.parseInt(temp);
        }catch (NumberFormatException nfe) {
            System.out.println("Nilai yang dimasukkan: " + "bukan bilangan bilat");
            System.exit(1);
        }
        System.out.println("Bilangan yang Anda masukkan adalah: " + bilanganInput);
        }
    }
