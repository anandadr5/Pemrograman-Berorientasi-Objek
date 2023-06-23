/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hewan;

/**
 *
 * @author Ananda Dwi Rizkyta
 */
class Main {
    public static void main(String[] args) {
        Singa singa = new Singa("Jenis singa adalah kucing", "Ciri singa adalah berlari");
        Paus paus = new Paus("Jenis paus adalah menyemburkan air", "Ciri paus adalah berenang");
        Lebah lebah = new Lebah("Jenis lebah adalah serangga", "Ciri lebah adalah menyengat");
        Elang elang = new Elang("Jenis elang adalah burung", "Ciri elang adalah terbang");
        
        singa.suara();
        singa.berjalan();
        
        paus.suara();
        paus.berjalan();
        
        lebah.suara();
        lebah.berjalan();
        
        elang.suara();
        elang.berjalan();
    }
}
