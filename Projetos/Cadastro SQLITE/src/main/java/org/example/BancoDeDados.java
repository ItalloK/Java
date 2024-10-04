package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BancoDeDados{
    private String bancoUrl = "jdbc:sqlite:banco.db";
    public void VerificarConexao(){
        try (Connection conn = DriverManager.getConnection(bancoUrl)) {
            if (conn != null) {
                System.out.println("Conexão estabelecida com sucesso!");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void CadastrarUsuario(String nome){
        String sql = "INSERT INTO Usuarios(nome) VALUES ('"+nome+"')";
        try(Connection conn = DriverManager.getConnection(bancoUrl);
            Statement stmt = conn.createStatement()){
            stmt.executeUpdate(sql);
            System.out.println("Usuario cadastrado com sucesso: " + nome);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    public void CadastrarUsuario(String nome, String email){
        String sql = "INSERT INTO Usuarios(nome, email) VALUES ('"+nome+"', '"+email+"')";
        try(Connection conn = DriverManager.getConnection(bancoUrl);
            Statement stmt = conn.createStatement()){
                stmt.executeUpdate(sql);
                System.out.println("Usuario cadastrado com sucesso, Nome: " + nome + " Email: " + email);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    public void CadastrarUsuario(String nome, String telefone, String email){
        String sql = "INSERT INTO Usuarios(nome, telefone, email) VALUES('" + nome + "', '" + telefone + "', '" + email + "');";
        try (Connection conn = DriverManager.getConnection(bancoUrl);
             Statement stmt = conn.createStatement()) {
                stmt.executeUpdate(sql);
                System.out.println("Usuario cadastrado com sucesso, Nome: " + nome + " Email: " + email + " telefone: " + telefone);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
