import java.util.Scanner;

class Somar{
    public Somar(int a, int b){
        System.out.printf("Soma dos valores %d e %d é : %d", a, b, a+b);
    }
}

class Subtrair{
    public Subtrair(int a, int b){
        System.out.printf("Subtracao dos valores %d e %d é: %d",a, b, a-b);
    }
}

class Multiplicar{
    public Multiplicar(int a, int b){
        System.out.printf("Multiplicacao dos valores %d e %d é: %d", a, b, a*b);
    }
}

class Dividir{
    public Dividir(int a, int b){
        if(b == 0){
            System.out.println("Erro, não pode ser dividido por 0");
            return;
        }
        System.out.printf("A divisão dos valores %d e %d é: %d", a, b, a/b);
    }
}

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] valores = new int[2];
        int opt = -1;
        
        System.out.println("Digite o primeiro valor: ");
        valores[0] = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        valores[1] = scan.nextInt();

        do{
            System.out.println("----------------------------------");
            System.out.printf("Valores escolhidos: %d e %d\n\n", valores[0], valores[1]);
            System.out.println("1 - Para somar");
            System.out.println("2 - Para subtrair");
            System.out.println("3 - Para multiplicar");
            System.out.println("4 - Para dividir");
            System.out.println("Digite a opção desejada:");
            System.out.println("----------------------------------");
            opt = scan.nextInt();
        }while(opt > 4 || opt < 1);

        switch(opt){
            case 1:
                Somar soma = new Somar(valores[0], valores[1]);
                break;
            case 2:
                Subtrair subtr = new Subtrair(valores[0], valores[1]);
                break;
            case 3:
                Multiplicar mult = new Multiplicar(valores[0], valores[1]);
                break;
            case 4:
                Dividir div = new Dividir(valores[0], valores[1]);
                break;
        }

    }
}
