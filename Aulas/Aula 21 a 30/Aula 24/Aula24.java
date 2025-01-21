public class Aula24 {
    public static void main(String[] args){

        final int tam = 5;

        int[] num = new int[tam];

        int[] num2 = {6,7,8,9,10};

        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        num[4] = 5;

        for(int i = 0; i<tam; i++){
            System.out.printf("%d - ", num[i]);
        }        

        for(int n : num2){
            System.out.printf("%d - ", n);
        }

    }
}
