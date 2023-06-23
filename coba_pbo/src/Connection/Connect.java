/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.*;


/**
 *
 * @author Ananda Dwi Rizkyta
 */
class Connect {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://127.0.0.1:3306/pegawai";
        String user = "root";
        String pass = "";
        try {
            Connection conn = DriverManager.getConnection(URL, user, pass);
            System.out.println("Sukses");
            conn.close();
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
