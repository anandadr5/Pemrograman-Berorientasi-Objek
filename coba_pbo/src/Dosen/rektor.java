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
public class rektor extends dosen{
    private int th_mulai;
    private int jabatan_ke;

    public int getTh_mulai() {
        return th_mulai;
    }

    public void setTh_mulai(int th_mulai) {
        this.th_mulai = th_mulai;
    }

    public int getJabatan_ke() {
        return jabatan_ke;
    }

    public void setJabatan_ke(int jabatan_ke) {
        this.jabatan_ke = jabatan_ke;
    }
    
    //Inisialisasi
    rektor (String namaX, String nikX, String jurX, int thX, int keX)
    {
        super(namaX, nikX, jurX);
        th_mulai = thX;
        jabatan_ke = keX;
    }
    
    //Menampilkan informasi
    public void viewRektor()
    {
        System.out.println("Th mulai jabatan : "+th_mulai);
        System.out.println("Jabatan rektor ke- : "+jabatan_ke);
    }
    }
