import java.util.Scanner;

public class Aula05{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < 10; i++){
            System.out.println("MENGO");
        }   

        int cont = 0;
        while(cont < 5){
            System.out.println("MENGO");
            cont++;
        }

        do{
            System.out.println("MENGO");
            cont++;
        }while(cont < 5);

        scan.close();
    }
}