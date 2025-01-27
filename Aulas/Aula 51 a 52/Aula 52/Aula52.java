public class Aula52{
    public static void main(String[] args) {
        
        int minimo = Math.min(15, 5); // retorna um inteiro com o minimo entre 2 valores
        System.out.println("Minimo: "+minimo);

        int maximo = Math.max(15, 5); // retorna um inteiro com o maximo entre 2 valores
        System.out.println("Maximo: "+maximo);

        double valRaiz = 9;
        double res = Math.sqrt(valRaiz);
        System.out.println("Raiz de: "+valRaiz+" é: "+res);

        double valAbs = -64;
        double res2 = Math.abs(valAbs);
        System.out.println("Absoluto de: "+valAbs+" é: "+res2);

        double randomValue = Math.random()*10; // retorna valor aleatorio entre 0 e 1 ( se por * valor ele multiplica )
        System.out.println("Random: "+randomValue); 

        int rendomValue2 = (int)(Math.random());
        System.out.println("Random Inteiro: "+rendomValue2); 


        double potencia = Math.pow(2, 5);
        System.out.println("Potencia: "+potencia);


    }
}