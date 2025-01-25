import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {

        Campo[][] velha = new Campo[3][3];
        char simboloAtual = 'X';
        Boolean game = true;
        String vitoria = "";
        Scanner scan = new Scanner(System.in);

        IniciarJogo(velha);

        while(game){
            DesenhaJogo(velha);
            vitoria = VerificaVitoria(velha);
            if(!vitoria.equals("")){
                System.out.printf("Jogador %s venceu!", vitoria);
                break;
            }
            try{
                if(VerificarJogada(velha, Jogar(scan, simboloAtual), simboloAtual)){
                    if(simboloAtual == 'X'){
                        simboloAtual = 'O';
                    }else{
                        simboloAtual = 'X';
                    }
                }


            }catch(Exception ex){
                System.out.printf("Erro: %s", ex.getMessage());
            }
        }
        System.out.println("Fim do jogo!");
        
    }

    public static void DesenhaJogo(Campo[][] velha){
        LimparTela();
        System.out.printf("    0   1   2\n");
        System.out.printf("0   %c | %c | %c %n", velha[0][0].getSimbolo(), velha[0][1].getSimbolo(), velha[0][2].getSimbolo());
        System.out.printf("    -------------\n");
        System.out.printf("1   %c | %c | %c %n", velha[1][0].getSimbolo(), velha[1][1].getSimbolo(), velha[1][2].getSimbolo());
        System.out.printf("    -------------\n");
        System.out.printf("2   %c | %c | %c %n", velha[2][0].getSimbolo(), velha[2][1].getSimbolo(), velha[2][2].getSimbolo());

    }

    public static void LimparTela(){
        for(int i = 0; i<200; i++){
            System.out.println("");
        }
    }

    public static int[] Jogar(Scanner scan, char sa){
        int[] p= new int[2];
        System.out.printf("%s %c%n", "Quem joga: ", sa);
        System.out.print("Informe a linha: ");
        p[0] = scan.nextInt();
        System.out.print("Informe a coluna: ");
        p[1] = scan.nextInt();
        return p;
    }

    public static Boolean VerificarJogada(Campo[][] velha, int p[], char simboloAtual){
        if(velha[p[0]][p[1]].getSimbolo() == ' '){
            velha[p[0]][p[1]].setSimbolo(simboloAtual);
            return true;
        }else{
            return false;
        }
    } 

    public static void IniciarJogo(Campo[][] velha){
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                velha[i][j] = new Campo();
            }
        }
    }

    public static String VerificaVitoria(Campo[][] velha){
        return "";
    }

}
