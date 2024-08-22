import java.util.Scanner; // nescessário para scanner 

public class Aula04 {
    public static void main(String[] args){

        Scanner scann = new Scanner(System.in); //  ler do teclado

        int n1 = 0, n2 = 0, res = 0;
        String Nome = "";

        System.out.println("Digite seu nome: ");
        Nome = scann.nextLine();

        System.out.println("Digite um valor para n1: ");
        n1 = scann.nextInt(); // ler inteiros

        System.out.println("Digite um valor para n2: ");
        n2 = scann.nextInt(); // ler inteiros

        res = n1+n2;

        final int Resultado = res; // ( final antes transforma em constante, o valor não é mais alterado )

        System.out.println("Resultado: " + res + " e nome: " + Nome + " Resultado: " + Resultado);
    }
}
