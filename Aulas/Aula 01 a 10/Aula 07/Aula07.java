import java.util.Arrays;
import java.util.Scanner;

public class Aula07{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        final int tam = 10;
        int[] numeros = new int[tam];


        int[] num = {9,2,7,1,8,5,3,4,0,6};
        

        //Arrays.sort(num); // Deixa os valores ordenados
        //Arrays.fill(numeros, 10); // Preenche o array com o valor ' 10 '
        //System.arraycopy(num, 0, numeros, 0, tam); // copia um vetor para o outro ( origem, posOrigem, destino, posDestino, tamanho )
        
        System.out.println("\n-----------------------------------");
        System.out.printf("\nArrays são iguais? %s\n", Arrays.equals(num, numeros) ? "Sim" : "Não"); // compara 2 arrays
        System.out.println("\n-----------------------------------");

        for(int n:numeros){
            System.out.printf("%d - ", n);
        }
        System.out.println("\n-----------------------------------");

        Arrays.sort(num); // Deixa os valores ordenados
        int p = 15;
        int pos;
        pos = Arrays.binarySearch(num, p);// ( nescessita que o array esteja ordenado ( sort ))
        System.out.printf("\nO elemento %d está no Array? %s na posição: %d\n", p, pos > 0 ? "Sim" : "Não", pos);
        // qualquer valor retornado abaixo de 0 significa que não está no array.
        System.out.println("\n-----------------------------------");


        scan.close();
    }
}
