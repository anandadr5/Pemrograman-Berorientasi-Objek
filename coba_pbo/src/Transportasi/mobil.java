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
public class mobil extends kendaraan{
    private String nama;
    private String jenis;
    
    public mobil(String nama)
    {
        super("Mobil");
        this.nama = nama;
        jenis = "belum teridentifikasi";
    }
    
    public mobil(String nama, String jenis)
    {
        super("Mobil");
        this.nama = nama;
        this.jenis = jenis;
    }
    
    public void informasi()
    {
        System.out.println("Nama mobil adalah "+nama);
        System.out.println("Jenis mobil adalah "+jenis);
    }
    
}
