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
public class pert6 {
    
    public static void main(String[] args){
        String data_N = JOptionPane.showInputDialog("Masukkan bilangan = ");
        int N = Integer.parseInt(data_N);
        int faktorial = 1;
        for (int i=1; i<=N; i++)
        {
            faktorial = faktorial*i;
        }
        System.out.println("Nilai "+N+"! = "+faktorial);
    }
}
