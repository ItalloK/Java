import java.lang.reflect.InaccessibleObjectException;
import java.util.Arrays;
import java.util.Scanner;

public class Aula30{
    public static void main(String[] args) {
        
        int[] num = {82, 4, 2, 0, 1, 4, 7, 3, 6, 9};
        int[] num2 = new int[10];

        //Arrays.sort(num); // ordena os numeros
        //Arrays.fill(num2, 10); // prenche o array com o valor indicado
        //System.arraycopy(num, 0, num2, 0, num.length); // copia do array 1 para o array 2
        //int[] num3 = {1,2,3,4,5};
        //int[] num4 = {1,2,3,4,5};
        //Boolean res = Arrays.equals(num3, num4); // verifica se o array é igual o outro
        //System.out.printf("Os arrays sao iguais? %s%n", res ? "Sim":"Não");
        
        /*for(int n : num2){
            System.out.printf("%d - ", n);
        }*/

        int valor = 4;
        Arrays.sort(num); // deve ordenar antes de procurar
        int pos = Arrays.binarySearch(num, valor); // procura valor no array, valor negativo se nao achar
        System.out.printf("%d esta no array? %s , posição: %d%n", valor, pos>=0 ? "Sim":"Não", pos);
    }
}