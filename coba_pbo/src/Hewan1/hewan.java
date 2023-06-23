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
public class hewan {
    private String jenis;
    private String ciri;
    private String suara;
    private String berjalan;
    
    //Inisialisasi
    public hewan(String jenisX, String ciriX, String suaraX, String berjalanX)
    {
        jenis = jenisX;
        ciri = ciriX;
        suara = suaraX;
        berjalan = berjalanX;
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

    public String getSuara() {
        return suara;
    }

    public void setSuara(String suara) {
        this.suara = suara;
    }

    public String getBerjalan() {
        return berjalan;
    }

    public void setBerjalan(String berjalan) {
        this.berjalan = berjalan;
    }
    
    
    //Informasi yang merupakan method tanpa instruksi
    public void informasi(){}
    }
