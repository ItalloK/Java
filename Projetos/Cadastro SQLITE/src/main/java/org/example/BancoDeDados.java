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

    public void ExibirMedicos(){
        String query = "SELECT * FROM Medicos";
        List<Map<String, Object>> usuarios = executeDQL(query);
        for (Map<String, Object> usuario : usuarios) {
            int id = (Integer) usuario.get("id");
            String nome = (String) usuario.get("nome");
            String crm = (String) usuario.get("crm");
            String telefone = (String) usuario.get("telefone");
            String email = (String) usuario.get("email");
            String datanascimento = (String) usuario.get("datanascimento");
            System.out.printf("ID: %d, Nome: %s, CRM: %s, Telefone: %s, Emai: %s e Data de Nascimento %s\n", id, nome, crm, telefone, email, datanascimento);
        }
        Main.Pausar();
    }

    public void ExibirUsuarios(){
        String query = "SELECT * FROM Usuarios";
        List<Map<String, Object>> usuarios = executeDQL(query);
        for (Map<String, Object> usuario : usuarios) {
            int id = (Integer) usuario.get("id");
            String nome = (String) usuario.get("nome");
            String email = (String) usuario.get("email");
            String telefone = (String) usuario.get("telefone");
            System.out.printf("ID: %d, Nome: %s, Email: %s e Telefone: %s\n", id, nome, email, telefone);
        }
        Main.Pausar();
    }

    public void PesquisarUserMed(String opt, String dado){
        String query = null;
        if(opt.equals("M")){
            query = "SELECT * FROM Medicos WHERE nome LIKE '%"+dado+"%' OR email LIKE '%"+dado+"%'";
        }else if(opt.equals("U")){
            query = "SELECT * FROM Usuarios WHERE nome LIKE '%"+dado+"%' OR email LIKE '%"+dado+"%'";
        }
        List<Map<String, Object>> usuarios = executeDQL(query);
        for (Map<String, Object> usuario : usuarios) {
            int id = (Integer) usuario.get("id");
            String nome = (String) usuario.get("nome");
            String email = (String) usuario.get("email");
            System.out.printf("ID: %d, Nome: %s e Email: %s\n", id, nome, email);
        }
        Main.Pausar();
    }

}
