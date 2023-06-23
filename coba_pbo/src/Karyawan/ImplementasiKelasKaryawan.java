/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Karyawan;

/**
 *
 * @author Ananda Dwi Rizkyta
 */
public class ImplementasiKelasKaryawan {
    public static void main(String[] args){
        //Membuat objek karyawan dengan nama Aurel
        Karyawan Aurel = new Karyawan();
        
        //Mmebuat objek karyawan dengan nama Dhennis
        Karyawan Dhennis = new Karyawan();
        
        //Mengisi nilai kedalam data-data objek karyawan2
        Aurel.ID = "K001";
        Aurel.nama = "Marketing";
        Aurel.divisi = "Aurel Dian";
        Aurel.gaji = (double) 2250000;
        
        //Mengisi nilai kedalam data-data objek karyawan2
        Dhennis.ID = "K002";
        Dhennis.nama = "Keuangan";
        Dhennis.divisi = "Muhamad Dhennis";
        Dhennis.gaji = (double) 2250000;
        
        //Mencetak data-data objek karyawan ke-1
        System.out.println("ID : " + Aurel.ID);
        System.out.println("Nama : " + Aurel.nama);
        System.out.println("Divisi : " + Aurel.divisi);
        System.out.println("Gaji : " + Aurel.gaji);
        
        //Mencetak data0data objek karyawan ke-2
        System.out.println("ID : " + Dhennis.ID);
        System.out.println("Nama : " + Dhennis.nama);
        System.out.println("Divisi : " + Dhennis.divisi);
        System.out.println("Gaji : " + Dhennis.gaji);
    }
}
