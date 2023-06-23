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
class DemoInputKarakter {
    public static void main(String[] args) throws IOException {
        System.out.println("Masukkan sebuah karakter: ");
        char KarakterInput;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        KarakterInput = (char) br.read();
        System.out.println("Karakter yang dimasukkan adalah \'" + KarakterInput + "\'");
    }
}