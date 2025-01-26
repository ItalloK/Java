import java.util.ArrayList;

public class Aula41{
    public static void main(String[] args) {
        String s1 = "Italo";
        String s2 = "Gabriel";

        // concatena 2 strings
        System.out.println(s1.concat(s2));
        System.out.println(s1.concat(" "+s2));


        System.out.println("------------------------------------------------------------");
        // retorna parte de uma string
        System.out.println(s1.substring(3)); // quantidade de caracteres a partir do 0
        System.out.println(s1.substring(0, 3));
        System.out.println(s1.substring(3, 5));
        

        System.out.println("------------------------------------------------------------");
        // Pega o index do caractere, se tiver + de 1 ele retorna o primeiro ou o selecionado ( o 1 ali )
        System.out.println(s1.indexOf('a', 0));


        System.out.println("------------------------------------------------------------");
        //Verifica se a string começa com aquela outra string ( tem case sensitive )
        if(s1.startsWith("I")){
            System.out.println("Verdadeiro");
        }else{
            System.out.println("Falso");
        }

        System.out.println("------------------------------------------------------------");
        //Verifica se a string termina com aquela outra string ( tem case sensitive )
        if(s1.endsWith("o")){
            System.out.println("Verdadeiro");
        }else{
            System.out.println("Falso");
        }
    }
}