import java.util.Scanner;

public class Aula28{
    public static void main(String[] args) {
        
        int[] notas = {10, 85, 62, 45, 98, 78, 88, 60, 67, 82};
        int[] resultados = {0, 0};

        ConferirNotas(notas, resultados); // passagem por referencia, só assim é possivel alterar os valores de dentro da funcao
        System.out.printf("Aprovados...: %d%n", resultados[0]);
        System.out.printf("Reprovados..: %d%n", resultados[1]);

    }

    public static void ConferirNotas(int[] nt, int[] r){
        for(int n : nt){
            if(n >= 60){
                r[0]++;
            }else{
                r[1]++;
            }
        }
        //System.out.printf("Aprovados...: %d%n", a);
        //System.out.printf("Reprovados..: %d%n", r);
    }
}