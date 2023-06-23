/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dosen;

/**
 *
 * @author Ananda Dwi Rizkyta
 */
public class dosen {
    protected String nama;
    protected String nik;
    protected String jurusan;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    
    //Membuat konstruktor
    dosen (String namaX, String nikX, String jurX){
        nama    = namaX;
        nik     = nikX;
        jurusan = jurX;
    }
    //Menampilkan informasi
    public void view()
    {
        System.out.println("Nama: "+nama);
        System.out.println("NIK: "+nik);
        System.out.println("Jurusan: "+jurusan);
    }
}