/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transportasi;

/**
 *
 * @author Ananda Dwi Rizkyta
 */
public class Main {
    
    public static void main(String[] args){
        
        //Cara pertama
        kendaraan P;
        pesawat psw = new pesawat("Boeing 707","Pesawat Komersial");
        mobil mbl1 = new mobil("Toyota Kijang","Jeep");
        mobil mbl2 = new mobil("Suzuki Baleno","Sedan");
        mobil mbl3 = new mobil("VW Combi");
        kapal kpl = new kapal("Queen Mary 2","Kapal Pesiar");
        
        P = psw;
        P.informasi();
        
        P = mbl1;
        P.informasi();
        
        P = mbl2;
        P.informasi();
        
        P = mbl3;
        P.informasi();
        
        P = kpl;
        P.informasi();
        
        
        //Cara kedua
        kendaraan pesawat = new pesawat("Pesawat Garuda");
        pesawat.informasi();
    }
}
