import java.util.Scanner;
import java.security.SecureRandom;

public class Aula08{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        final int linhas = 3;
        final int colunas = 5;

        int[][] Matriz = new int[linhas][colunas];

        for(int l = 0; l < linhas; l++){
            for(int c = 0; c < colunas; c++){
                Matriz[l][c] = new SecureRandom().nextInt(100);
            }
        }
        
        /*for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                System.out.printf("%2d | ", Matriz[i][j]);
            }
            System.out.printf("\n");
        }*/


        /*for(int[] n : Matriz){
            for(int v : n){
                System.out.printf("%2d |", v);
            }
            System.out.printf("\n"); 
        }*/

        System.out.println("-----------");

        int[][] num = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};

        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                System.out.printf("%2d | ", num[i][j]);
            }
            System.out.printf("\n");
        }

        scan.close();
    }
}