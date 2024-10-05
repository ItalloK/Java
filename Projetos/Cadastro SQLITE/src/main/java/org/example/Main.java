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
            String opcao = null;
            Scanner scan = new Scanner(System.in);
            String opt = null;
            System.out.println("Bem vindo ao Programa.");
            System.out.println("1 - Para cadastrar um usuário.");
            System.out.println("2 - Para cadastrar um Médico.");
            System.out.println("3 - Para listar todos os Usuários");
            System.out.println("4 - Para listar todos os Médicos");
            System.out.println("5 - Para atualizar um Medico/Usuário.");
            System.out.println("6 - Para pesquisar Médico ou Usuário por Nome/Email.");
            System.out.print("Digite a opção desejada: ");
            opt = scan.nextLine();
            BancoDeDados bd = new BancoDeDados();
            switch (opt) {
                case "1": {
                    CadastrarUsuario(bd);
                    break;
                }
                case "2": {
                    CadastrarMedico(bd);
                    break;
                }
                case "3": {
                    bd.ExibirUsuarios();
                    break;
                }
                case "4": {
                    bd.ExibirMedicos();
                    break;
                }
                case "5":{
                    AtualizarRegistro(bd);
                    break;
                }
                case "6":{
                    String option = null;
                    do{
                        System.out.print("Digite a opção que deseja pesquisar, M para Médico, U para Usuário e S para Sair: ");
                        option = scan.nextLine();
                    }while(!option.equals("M") && !option.equals("U") && !option.equals("S"));
                    if(option.equals("S")){
                        break;
                    }
                    System.out.print("Digite agora o Email ou Nome que deseja pesquisar: ");
                    String dado = scan.nextLine();
                    bd.PesquisarUserMed(option, dado);
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

    private static void AtualizarRegistro(BancoDeDados bd){
        LimparTela();
        Scanner scan = new Scanner(System.in);
        String opcao = null;
        System.out.println("Qual você deseja atualizar? Medico ou Usuário? [M - para Médico, U - para Usuário ou S - para voltar para o Menu]");
        System.out.print("Digite a opção desejada: ");
        opcao = scan.nextLine();

        if(opcao.equals("M")){
            bd.ExibirMedicos();
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

    public static void LimparTela(){
        for(int i = 0; i<50; i++){
            System.out.printf("\n");
        }
    }

    public static void Pausar(){
        System.out.printf("\nPressione Enter para continuar...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}

