import java.util.Scanner;

public class Aula11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int num = 0;
        

        Jogador J1 = new Jogador(num++);  // pos-incremento
        Jogador J2 = new Jogador(num); // instanciação da classe jogador
        Jogador J3 = new Jogador(++num);  // pre-incremento
        

        //J1.num = 10;
        //J2.num = 5;
        //System.out.println(J1.num);
        //System.out.println(J2.num);

        scan.close();
    }
}

