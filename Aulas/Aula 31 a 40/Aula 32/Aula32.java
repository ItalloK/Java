import java.security.SecureRandom;

public class Aula32{
    public static void main(String[] args) {

        final int linha = 3;
        final int coluna = 5;

        int[][] numeros = new int[linha][coluna];
        
        for(int i = 0; i<linha; i++){
            for(int j = 0; j<coluna; j++){
                numeros[i][j] = new SecureRandom().nextInt(100);
            }
        }

        ImprimirDados(numeros, linha, coluna);
    }

    public static void ImprimirDados(int mat[][], int linha, int coluna){
        for(int i = 0; i<linha; i++){
            for(int j = 0; j<coluna; j++){
                System.out.printf("%d - ", mat[i][j]);
            }
            System.out.printf("%n");
        }
    }
}