import java.util.Scanner;

public class Aula06 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] Numeros = new int[5];
        String[] Nomes = new String[5];

        int[] Numeros2 = {10,20,30,40,50};
        String[] Nomes2 = {"Maria", "Joana"};
        System.out.printf("Nomes: %s, %s\n", Nomes2[0], Nomes2[1]);
        System.out.printf("%d\n", Numeros2[3]);


        for(int i = 0; i < Numeros2.length; i++){
            System.out.printf("%d\n", Numeros2[i]);
        }

        final int tam = 5;
        char[] Gabarito = {'a','a','d','b','c'};
        char[] Respostas = new char[tam];
        int nota = 0;

        Respostas[0] = 'a';
        Respostas[1] = 'a';
        Respostas[2] = 'd';
        Respostas[3] = 'b';
        Respostas[4] = 'c';

        for(int i = 0; i<tam; i++){
            if(Respostas[i] == Gabarito[i]){
                nota++;
            }
        }
        System.out.println("-----------------------------");
        System.out.println("Nota do aluno: " + nota);
        System.out.println("-----------------------------");

        for(int i = 0; i<tam; i++){
            System.out.printf("Digite a %d nota: ", i+1);
            Gabarito[i] = scan.nextLine().charAt(0);
        }
        nota = 0;
        for(int i = 0; i<tam; i++){
            if(Respostas[i] == Gabarito[i]){
                nota++;
            }
        }
        System.out.println("-----------------------------");
        System.out.println("Nota do aluno: " + nota);
        System.out.println("-----------------------------");
        scan.close();
    }
}
