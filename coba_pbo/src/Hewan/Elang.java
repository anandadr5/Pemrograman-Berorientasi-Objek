/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hewan;

/**
 *
 * @author Ananda Dwi Rizkyta
 */
public class Elang extends Hewan{
    
    public Elang(String jenisX, String ciriX)
    {
        super(jenisX, ciriX);
    }
    
    public void suara()
    {
        System.out.println("Elang mendengung");
    }
    
    public void berjalan()
    {
        System.out.println("Elang terbang");
    }
}
