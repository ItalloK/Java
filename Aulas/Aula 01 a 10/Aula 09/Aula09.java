public class Aula09 {
    public static void main(String[] args){

        msg("Ohayo Pokko", 1);
        int Somatorio = Soma(10,5, 5);        
        System.out.printf("\nSomatorio: %d\n", Somatorio);

        System.out.printf("Resultado: %d\n", SomarArray(1,10));

        int[] num = {10,20,30,40,50};
        int result = SomaArray2(num);
        System.out.printf("Resultado 2: %d\n", result);
        

        double Somatorio2 = Soma(2.5, 2.5, 2.5);
        System.out.printf("\nSomatorio F: %.2f\n", Somatorio2);


    }

    /* Sobrecarga de Metodos = permite metodos com o mesmo nome mas com tipo de retorno diferente */

    public static double Soma(double n1, double n2, double n3){
        return n1+n2+n3;
    }

    /* Se o metodo main for static, os outros metodos tem que ser static */

    public static int SomaArray2(int[] n){
        int res = 0;
        for(int i = 0; i<n.length; i++){
            res += n[i];
        }
        return res;
    }

    public static int SomarArray(int... numeros){ // pode receber qualquer quantidade de valores.
        int res = 0;
        for(int n:numeros){
            res+=n;
        }
        return res;
    }

    public static int Soma(int n1, int n2, int n3){
        return n1+n2+n3;
    }

    public static void msg(String m, int l){
        for(int i = 0; i < l; i++){
            System.out.printf("%s\n", m);
        }
    }

    
}
