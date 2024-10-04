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
                //return true;
                System.out.println("Conexão estabelecida com sucesso!");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void TodosUsuarios(){
        String sql = "SELECT * FROM Usuarios";
    }

    public void CadastrarUsuario(String... args) {
        String nome = null, email = null, telefone = null, sql = null;

        if (args.length > 0) {
            nome = args[0];
            sql = "INSERT INTO Usuarios(nome) VALUES ('"+nome+"')";
        }
        if (args.length > 1) {
            nome = args[0];
            email = args[1];
            sql = "INSERT INTO Usuarios(nome, email) VALUES ('"+nome+"', '"+email+"')";
        }
        if (args.length > 2) {
            nome = args[0];
            email = args[1];
            telefone = args[2];
            sql = "INSERT INTO Usuarios(nome, telefone, email) VALUES('" + nome + "', '" + telefone + "', '" + email + "');";
        }

        try (Connection conn = DriverManager.getConnection(bancoUrl);
             Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(sql);
            if (args.length == 3) {
                System.out.println("Usuário cadastrado com sucesso utilizando Nome: " + nome + ", Email: " + email + " e Telefone: " + telefone);
            } else if (args.length == 2) {
                System.out.println("Usuário cadastrado com sucesso utilizando Nome: " + nome + " e Email: " + email);
            } else if (args.length == 1) {
                System.out.println("Usuário cadastrado com sucesso utilizando Nome: " + nome);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
