/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan7;

    class Kotak2 {
        double panjang;
        double lebar;
        double tinggi;
    }

public class test1pert7 {
    public static void main(String[] args){
        
        double volume1, volume2;
        
        Kotak k1 = new Kotak(); //mendeklarasikan objek k1
        Kotak k2 = new Kotak(); //mendeklarasikan objek k2
        
        //Mengisikan nilai ke dalam objek k1
        k1.panjang = 4;
        k1.lebar = 3;
        k1.tinggi = 2;
        
        //Mengisikan nilai ke dalam objek k2
        k2.panjang = 6;
        k2.lebar = 5;
        k2.tinggi = 4;
        
        //Menghitung isi/volume dari objek k1
        volume1 = k1.panjang * k1.tinggi * k1.lebar;
        
        //Menghitung isi/volume dari objek k2
        volume2 = k2.panjang * k2.tinggi * k2.lebar;
        
        //Menampilkan nilai volume k1 dan k2 ke layar monitor
        System.out.println("Volume k1 = " + volume1);
        System.out.println("Volume k2 = " + volume2);
        
    }
}
