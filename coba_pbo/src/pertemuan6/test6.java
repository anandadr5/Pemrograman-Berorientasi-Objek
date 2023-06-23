/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

import javax.swing.JOptionPane;

/**
 *
 * @author Ananda Dwi Rizkyta
 */
public class test6 {
    public static void main(String[] args){
        int i=0, jumGenap=0, jumGanjil=0;
        boolean ulang=true;
        while(ulang){
        String data_n=JOptionPane.showInputDialog("Masukkan bilangan");
        int N = Integer.parseInt(data_n);
        if(N>0)
        {
            if(N%2==0){
                jumGenap=jumGenap+1;
            }
            i=i+1;
            System.out.println("Banyaknya bilangan genap sampai ");
            }
        }
    }
}
