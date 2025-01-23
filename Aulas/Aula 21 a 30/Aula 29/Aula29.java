import java.util.Scanner;

public class Aula29{
    public static void main(String[] args) {
        
        int[] valores = {10, 5, 2, 3, 1, 9, 4};
        int res = Soma(valores);
        System.out.printf("Valor de Soma = %d%n", res);

        int resultado = Somar(10,20,30,40,50);
        System.out.printf("Valor de Somar = %d%n", resultado);
    }

    public static int Somar(int... n){
        int res = 0;
        for(int v : n){
            res += v;
        }
        return res;
    }

    public static int Soma(int[] n){
        int res = 0;
        for(int v : n){
            res += v;
        }
        return res;
    }

}