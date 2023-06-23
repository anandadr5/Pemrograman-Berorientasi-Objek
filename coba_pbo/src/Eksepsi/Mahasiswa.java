/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eksepsi;

/**
 *
 * @author Ananda Dwi Rizkyta
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    
    public void setNIM(String inputNIM){
        try {
            nim = inputNIM;
            if (inputNIM == null) {
                throw new NullPointerException();
            }
        }catch (NullPointerException npe){
            System.out.println("Kesalahn : " + "Nim tidak boleh null");
        }
    }

    public String getNIM(){
        return nim;
    }
    
    public void setNama(String inputNama){
        try{
            nama = inputNama;
            if (nama == null) {
                throw new NullPointerException();
            }
        }catch (NullPointerException npe) {
            System.out.println("KESALAHAN " + "Nama mahasisea tidaj boleh nulll");
        }
    }
    public String getNama(){
        return nama;
    }
}

class DemoThrow {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNIM(null);
        mhs.setNama("NADILLA");
        System.out.println("\nNim : " + mhs.getNIM());
        System.out.println("Nama : " + mhs.getNama());
    }
}