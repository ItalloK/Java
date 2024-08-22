package Conexao;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author itall
 */

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.awt.EventQueue;
import java.sql.DriverManager;

public class DAO {
    
    private Connection con;
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/dbcarometro";
    private String user = "root";
    private String password = "root";
    
    public Connection conectar(){
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }    
}
