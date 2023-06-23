/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hewan1;

/**
 *
 * @author Ananda Dwi Rizkyta
 */
public class main {
    public static void main(String[] args){
        hewan P;
        singa singa = new singa("Mengaung", "Berlari");
        paus paus = new paus("Bersiul", "Berenang");
        lebah lebah = new lebah("Mendengung", "Terbang");
        elang elang = new elang("Mendengung", "Terbang");
        
        P = singa;
        P.informasi();
        P = paus;
        P.informasi();
        P = lebah;
        P.informasi();
        P = elang;
        P.informasi();
    }
    }