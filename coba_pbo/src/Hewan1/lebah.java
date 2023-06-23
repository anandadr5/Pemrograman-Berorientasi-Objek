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
public class lebah extends hewan{
    private String suara;
    private String berjalan;
    
    public lebah(String suaraX)
    {
        super("Lebah", "", "", "");
        suara = suaraX;
        berjalan = "belum terindentifikasi";
    }
    
    public lebah(String suaraX, String berjalanX)
    {
        super("Lebah", "", "", "");
        suara = suaraX;
        berjalan = berjalanX;
    }
    
    public void informasi()
    {
        System.out.println("Suara lebah = "+suara);
        System.out.println("Cara berjalan lebah = "+berjalan);
        
    }
}
