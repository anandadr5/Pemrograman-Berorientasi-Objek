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
public class dekan extends dosen{
    private String fakultas;

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
    
    //Inisialisasi
    dekan (String namaX, String nikX, String jurX, String fakX)
    {
        super (namaX, nikX, jurX);
        fakultas = fakX;
    }
    
    //Menampilkan informasi
    public void viewDekan()
    {
        System.out.println("Fakultas : "+fakultas);
    }
    
}
