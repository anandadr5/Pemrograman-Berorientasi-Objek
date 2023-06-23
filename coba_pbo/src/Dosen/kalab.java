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
public class kalab extends dosen{
    private String laboratorium;

    public String getLaboratorium() {
        return laboratorium;
    }

    public void setLaboratorium(String laboratorium) {
        this.laboratorium = laboratorium;
    }

//Inisialisasi
kalab (String namaX, String nikX, String jurX, String labX)
{
    super(namaX, nikX, jurX);
    laboratorium = labX;
}

//Menampilkan informasi
public void viewKalab()
{
    System.out.println("Laboratorium: "+laboratorium);
}
}
