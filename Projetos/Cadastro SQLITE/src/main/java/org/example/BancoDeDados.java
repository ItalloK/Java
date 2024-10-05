package org.example;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public void CadastrarUsuario(String nome, String email, String telefone) {
        if(nome == "" || email == "" || telefone == ""){
            System.out.println("Preencha todos os campos para cadastrar o Usuário.");
            return;
        }
        String sql = "INSERT INTO Usuarios(nome, telefone, email) VALUES('" + nome + "', '" + telefone + "', '" + email + "');";
        RealizarCadastro(sql);
    }

    public void CadastrarMedico(String nome, String crm, String telefone, String email, String datanascimento){
        if(nome == "" || crm ==  "" || telefone == "" || email == "" || datanascimento == ""){
            System.out.println("Preencha todos os campos para cadastrar o Médico.");
            return;
        }
        String sql = String.format("INSERT INTO Medicos (nome, crm, telefone, email, datanascimento) VALUES ('%s', '%s', '%s', '%s', '%s')", nome, crm, telefone, email, datanascimento);
        RealizarCadastro(sql);
    }

    private void RealizarCadastro(String sql){
        try (Connection conn = DriverManager.getConnection(bancoUrl);
             Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(sql);
            System.out.println("Cadastro Realizado com Sucesso.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void AtualizarCadastro(String sql){
        try (Connection conn = DriverManager.getConnection(bancoUrl);
             Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(sql);
            System.out.println("Cadastro Atualizado com Sucesso.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Map<String, Object>> executeDQL(String query) {
        List<Map<String, Object>> results = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(bancoUrl)) {
            if (conn != null) {
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()) {
                    Map<String, Object> row = new HashMap<>();
                    int columnCount = rs.getMetaData().getColumnCount();
                    for (int i = 1; i <= columnCount; i++) {
                        String columnName = rs.getMetaData().getColumnName(i);
                        Object value = rs.getObject(i);
                        row.put(columnName, value);
                    }
                    results.add(row);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return results;
    }


}
