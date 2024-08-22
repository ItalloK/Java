import java.util.Scanner;

public class Aula13 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int num = 0;

        Jogador.pontos();
        Jogador.pontos();
        Jogador.pontos();

        Jogador J1 = new Jogador(num++);  // pos-incremento
        Jogador J2 = new Jogador(num); // instanciação da classe jogador
        Jogador J3 = new Jogador(++num);  // pre-incremento

        Jogador.alerta = true;

        J1.info();
        J2.info();
        J3.info();

        scan.close();
    }
}

