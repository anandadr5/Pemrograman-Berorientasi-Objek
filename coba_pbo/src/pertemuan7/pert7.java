/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan7;
    class Kotak {
        double panjang;
        double lebar;
        double tinggi;
    }
/**
 *
 * @author Ananda Dwi Rizkyta
 */
public class pert7 {
        public static void main(String[] args){
            
            double volume;
            Kotak k = new Kotak();
            
            //Mengisikan nilai ke dalam data-data kelas Kotak
            k.panjang = 4;
            k.lebar = 3;
            k.tinggi = 2;
            
            //Menghitung isi/volume kotak
            volume = k.panjang * k.tinggi * k.lebar;
            
            //Menampilkan nilai volume ke layar monitor
            System.out.println("Volume kotak = " + volume);
            
        }
    }
