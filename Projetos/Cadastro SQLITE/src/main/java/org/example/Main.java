package org.example;
import com.sun.source.tree.WhileLoopTree;

import java.security.PublicKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        while(true) {
            Pausar();
            LimparTela();
            String opcao = null;
            Scanner scan = new Scanner(System.in);
            int opt = -1;
            System.out.println("Bem vindo ao Programa.");
            System.out.println("1 - Para cadastrar um usuário.");
            System.out.println("2 - Para cadastrar um Médico.");
            System.out.println("3 - Para listar todos os Usuários");
            System.out.println("4 - Para listar todos os Médicos");
            System.out.println("5 - Para atualizar um Medico/Usuário.");
            System.out.print("Digite a opção desejada: ");
            opt = scan.nextInt();
            BancoDeDados bd = new BancoDeDados();
            //scan.close();
            switch (opt) {
                case 1: {
                    CadastrarUsuario(bd);
                    break;
                }
                case 2: {
                    CadastrarMedico(bd);
                    break;
                }
                case 3: {
                    ExibirUsuarios(bd);
                    break;
                }
                case 4: {
                    ExibirMedicos(bd);
                    break;
                }
                case 5:{
                    AtualizarRegistro(bd);
                    break;
                }
                default: {
                    System.out.print("Opção Inválida.");
                    System.exit(0);
                }
            }
        }
    }

    private static void CadastrarUsuario(BancoDeDados bd){
        LimparTela();
        Scanner scan = new Scanner(System.in);
        String nome = null, email = null, telefone = null;
        System.out.print("Digite o Nome do Usuário: ");
        nome = scan.nextLine();
        System.out.print("Digite o Email do Usuário: ");
        email = scan.nextLine();
        System.out.print("Digite o Telefone do Usuário: ");
        telefone = scan.nextLine();
        bd.CadastrarUsuario(nome, email, telefone);
    }

    private static void CadastrarMedico(BancoDeDados bd){
        LimparTela();
        Scanner scan = new Scanner(System.in);
        String nome = null, crm = null, telefone = null, email = null, datanascimento = null;
        System.out.print("Digite o Nome do Médico: ");
        nome = scan.nextLine();
        System.out.print("Digite o CRM do Médico: ");
        crm = scan.nextLine();
        System.out.print("Digite o Telefone do Médico: ");
        telefone = scan.nextLine();
        System.out.print("Digite o Email do Médico: ");
        email = scan.nextLine();
        System.out.print("Digite a Data de Nascimento do Médico: ");
        datanascimento = scan.nextLine();
        bd.CadastrarMedico(nome, crm, telefone, email, datanascimento);
    }

    private static void ExibirUsuarios(BancoDeDados bd){
        LimparTela();
        String query = "SELECT * FROM Usuarios";
        List<Map<String, Object>> usuarios = bd.executeDQL(query);
        for (Map<String, Object> usuario : usuarios) {
            int id = (Integer) usuario.get("id");
            String nome = (String) usuario.get("nome");
            String email = (String) usuario.get("email");
            String telefone = (String) usuario.get("telefone");
            System.out.printf("ID: %d, Nome: %s, Email: %s e Telefone: %s\n", id, nome, email, telefone);
        }
        Pausar();
    }

    private static void ExibirMedicos(BancoDeDados bd){
        LimparTela();
        String query = "SELECT * FROM Medicos";
        List<Map<String, Object>> usuarios = bd.executeDQL(query);
        for (Map<String, Object> usuario : usuarios) {
            int id = (Integer) usuario.get("id");
            String nome = (String) usuario.get("nome");
            String crm = (String) usuario.get("crm");
            String telefone = (String) usuario.get("telefone");
            String email = (String) usuario.get("email");
            String datanascimento = (String) usuario.get("datanascimento");
            System.out.printf("ID: %d, Nome: %s, CRM: %s, Telefone: %s, Emai: %s e Data de Nascimento %s\n", id, nome, crm, telefone, email, datanascimento);
        }
        Pausar();
    }

    private static void AtualizarRegistro(BancoDeDados bd){
        LimparTela();
        Scanner scan = new Scanner(System.in);
        String opcao = null;
        System.out.println("Qual você deseja atualizar? Medico ou Usuário? [M - para Médico, U - para Usuário ou S - para voltar para o Menu]");
        System.out.print("Digite a opção desejada: ");
        opcao = scan.nextLine();

        if(opcao.equals("M")){
            ExibirMedicos(bd);
            System.out.print("Digite o ID do Médico que deseja atualizar: ");
            String idMedicoStr = scan.nextLine();
            int idMedico = Integer.parseInt(idMedicoStr);
            String query = String.format("SELECT * FROM Medicos WHERE id = %d", idMedico);
            List<Map<String, Object>> usuarios = bd.executeDQL(query);
            String nome = null, crm = null, telefone = null, email = null, datanascimento = null;
            int id = -1;
            for (Map<String, Object> usuario : usuarios) {
                id = (Integer) usuario.get("id");
                nome = (String) usuario.get("nome");
                crm = (String) usuario.get("crm");
                telefone = (String) usuario.get("telefone");
                email = (String) usuario.get("email");
                datanascimento = (String) usuario.get("datanascimento");
                System.out.printf("ID: %d, Nome: %s, CRM: %s, Telefone: %s, Email: %s e Data de Nascimento: %s\n", id, nome, crm, telefone, email, datanascimento);
            }
            String newNome = null, newCRM = null, newTelefone = null, newEmail = null, newDataNascimento = null;
            System.out.print("Digite o novo Nome para o Médico: ");
            newNome = scan.nextLine();
            System.out.print("Digite o novo CRM para o Médico: ");
            newCRM = scan.nextLine();
            System.out.print("Digite o novo Telefone para o Médico: ");
            newTelefone = scan.nextLine();
            System.out.print("Digite o novo Email para o Médico: ");
            newEmail = scan.nextLine();
            System.out.print("Digite a nova Data de Nascimento para o Médico: ");
            newDataNascimento = scan.nextLine();
            newNome = newNome.equals("") ? nome : newNome;
            newCRM = newCRM.equals("") ? crm : newCRM;
            newTelefone = newTelefone.equals("") ? telefone : newTelefone;
            newEmail = newEmail.equals("") ? email : newEmail;
            newDataNascimento = newDataNascimento.equals("") ? datanascimento : newDataNascimento;
            query = String.format("UPDATE Medicos SET nome = '%s', crm = '%s', telefone = '%s', email = '%s', datanascimento = '%s' WHERE id = %d", newNome, newCRM, newTelefone, newEmail, newDataNascimento, id);
            bd.AtualizarCadastro(query);
        }
    }

    private static void LimparTela(){
        for(int i = 0; i<50; i++){
            System.out.printf("\n");
        }
    }

    private static void Pausar(){
        System.out.printf("\nPressione Enter para continuar...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}

