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
public class elang extends hewan{
    private String suara;
    private String berjalan;
    
    public elang(String suaraX)
    {
        super("Elang", "", "", "");
        suara = suaraX;
        berjalan = "belum terindentifikasi";
    }
    
    public elang(String suaraX, String berjalanX)
    {
        super("Elang", "", "", "");
        suara = suaraX;
        berjalan = berjalanX;
    }
    
    public void informasi()
    {
        System.out.println("Suara elang = "+suara);
        System.out.println("Cara berjalan elang = "+berjalan);
    }
}