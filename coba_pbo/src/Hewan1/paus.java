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
public class paus extends hewan{
    private String suara;
    private String berjalan;
    
    public paus(String suaraX)
    {
        super("Paus", "", "", "");
        suara = suaraX;
        berjalan = "belum terindentifikasi";
    }
    
    public paus(String suaraX, String berjalanX)
    {
        super("Paus", "", "", "");
        suara = suaraX;
        berjalan = berjalanX;
    }
    
    public void informasi()
    {
        System.out.println("Suara paus = "+suara);
        System.out.println("Cara berjalan paus = "+berjalan);
    }
    
    }
