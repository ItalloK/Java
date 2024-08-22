import java.util.Scanner;

public class Aula12 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int num = 0;

        Jogador J1 = new Jogador(num++);  // pos-incremento
        Jogador J2 = new Jogador(num); // instanciação da classe jogador
        Jogador J3 = new Jogador(++num);  // pre-incremento
        

        System.out.println("");
        J1.addVidas();
        J1.addVidas();
        J1.addVidas();
        J1.addVidas();
        System.out.printf("Vidas do jogador: %d", J1.getVidas());

        scan.close();
    }
}

