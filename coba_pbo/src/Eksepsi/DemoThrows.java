/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eksepsi;

/**
 *
 * @author Ananda Dwi Rizkyta
 */
class DemoThrows {
    public static void cobaEksepsi() throwsIllegalAccessExceptoin {
        throw new IllegalAccessException("KESALAHAN: illegal access");
    }
    
    public static void main(String[] args) {
        try {
            cobaEksepsi();
        }
        catch (Exception e)
        {
            System.out.println("Eksepsi ditangkap di sini...");
            System.out.println(e.getMessage());
            
        }
    
    }
}
