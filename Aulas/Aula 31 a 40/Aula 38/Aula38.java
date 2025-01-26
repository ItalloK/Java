import java.util.ArrayList;

public class Aula38{
    public static void main(String[] args) {

        int nota1, nota2, res;
        nota1 = 50;
        nota2 = 20;

        if(nota1 > 50){
            throw new IllegalArgumentException("Valor de nota inválido.");
        } else if(nota2 > 50){
            throw new IllegalArgumentException("Valor de nota inválido.");
        }
        res = nota1+nota2;
        System.out.println("Resultado: "+res+"");


    }
}