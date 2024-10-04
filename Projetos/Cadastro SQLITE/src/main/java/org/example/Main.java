package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        BancoDeDados bd = new BancoDeDados();
        bd.VerificarConexao();

        bd.CadastrarUsuario("Italo", "+559899999-9999", "italo@teste.com.br");
        bd.CadastrarUsuario("Gabriel", "italo@teste.com");
        bd.CadastrarUsuario("Joaquim");
    }
}

