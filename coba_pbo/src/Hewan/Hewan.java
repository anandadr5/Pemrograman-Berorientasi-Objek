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
public class Hewan {
    private String jenis;
    private String ciri;
    
    //Inisialisasi
    public Hewan(String jenisX, String ciriX)
    {
        jenis = jenisX;
        ciri = ciriX;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getCiri() {
        return ciri;
    }

    public void setCiri(String ciri) {
        this.ciri = ciri;
    }
    
    //Informasi yang merupakan method tanpa instruksi
    public void suara(){}
    
    public void berjalan(){}
}