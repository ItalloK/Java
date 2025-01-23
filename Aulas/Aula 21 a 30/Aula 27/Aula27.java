import java.util.Scanner;

public class Aula27{
    public static void main(String[] args) {
        
        int[] numeros = {10, 5, 15, 20, 100, 25, 14, 83, 98, 75, 62};
        parImpar(numeros);
    }

    public static void parImpar(int[] num){
        for(int n : num){
            if(n % 2 == 0){
                System.out.printf("%d: Par %n", n);
            }else{
                System.out.printf("%d: Impar %n", n);
            }
            
        }
    }
}