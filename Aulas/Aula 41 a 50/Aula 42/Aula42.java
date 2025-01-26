import java.util.ArrayList;

public class Aula42{
    public static void main(String[] args) {
        String s1 = "Italo ";
        String s2 = "Gabriel";
        String s3 = s1.concat(s2);
        String s4;

        // tira o caractere selecionado
        String[] s5 = s3.split(" ");
        for(String k : s5){
            System.out.printf("%s", k);
        }

        System.out.println();
        System.out.println("--------------------------------------");
        // Transforma string em caractere de char
        char[] c = s3.toCharArray();
        for(char cc : c){
            System.out.printf("%s - ", cc);
        }
        System.out.println();
        System.out.println("--------------------------------------");
        // tira os espaços do inicio ou final
        System.out.println(s3.trim());

        System.out.println("--------------------------------------");
        //Transforma tudo para Maiusculo
        System.out.println(s3.toUpperCase());

        System.out.println("--------------------------------------");
        //Transforma tudo para minusculo
        System.out.println(s3.toLowerCase());

        System.out.println("--------------------------------------");
        //
        s4 = s3.replace("Italo","Itallu");
        System.out.println(s4);



    }
}