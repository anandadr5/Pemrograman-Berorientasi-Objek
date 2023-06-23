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
public class singa extends hewan{
    private String suara;
    private String berjalan;
    
    public singa(String suaraX)
    {
        super("Singa", "", "", "");
        suara = suaraX;
        berjalan = "belum terindentifikasi";
    }
    
    public singa(String suaraX, String berjalanX)
    {
        super("Singa", "", "", "");
        suara = suaraX;
        berjalan = berjalanX;
    }
    
    public void informasi()
    {
        System.out.println("Suara singa = "+suara);
        System.out.println("Cara berjalan singa = "+berjalan);
    }
    }
