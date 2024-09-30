import java.util.Scanner;

public class Program{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int val1 = 0, val2 = 0, opt = -1;
        double resultado = 0;
        System.out.println("Digite o primeiro valor: ");
        val1 = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        val2 = scan.nextInt();

        do{
            System.out.println("1 - Para somar");
            System.out.println("2 - Para subtrair");
            System.out.println("3 - Para multiplicar");
            System.out.println("4 - Para dividir");
            System.out.println("Digite a opção que deseja:");
            opt = scan.nextInt();
        }while(opt <= 0 || opt > 4);
        switch (opt) {
            case 1:
                resultado = Soma(val1, val2);
                break;
            case 2:
                resultado = Subtracao(val1, val2);
                break;
            case 3:
                resultado = Multiplicacao(val1, val2);
                break;
            case 4:
                if(val2 <= 0){
                    System.out.println("Erro, o valor a ser dividido não pode ser 0");
                    return;
                }
                resultado = Divisao(val1, val2);
                break;
        }

        System.out.println("O resultado é: "+resultado);

    }

    private static int Soma(int a, int b){
        return a+b;
    }
    private static int Subtracao(int a, int b){
        return a-b;
    }
    private static int Multiplicacao(int a, int b){
        return a*b;
    }
    private static double Divisao(int a, int b){
        return a/b;
    }
}

