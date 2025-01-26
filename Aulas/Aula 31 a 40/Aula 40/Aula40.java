import java.util.ArrayList;

public class Aula40{
    public static void main(String[] args) {
        String s1 = new String("Italo");
        String s2 = "Italo";
        String s3 = "Ohayo";
        String s4 = "Pokko";
        String s5 = "pokko";

        String s6 = "Italo Gabriel";
        String s7 = "ITALO gabriel";

        //Compara apenas os 5 primeiras letras ( len do final ), ele ignora o case sensitive ( italo e ITALO são iguais )
        if(s6.regionMatches(true, 0, s7, 0, 5)){
            System.out.println("Igual");
        }else{
            System.out.println("Diferente");
        }



        System.out.println("---------------------------------------------");
        // CompareTo --> numero negativo se a primeira for maior, numero negativo se for menor e 0 se for igual
        int comparar = s1.compareTo(s2);
        System.out.printf("Comparação: %d%n", comparar);
        if(comparar > 0){
            System.out.println("");
        }else if(comparar == 0){
            System.out.println("");
        }else if(comparar < 0){
            System.out.println("");
        }

        System.out.println("---------------------------------------------");
        if(s4.equalsIgnoreCase(s5)){ // ele ignora o Case sensitive.
            System.out.println("S4 é igual a S5");
        }else{
            System.out.println("S4 é diferente a S5");
        }


        System.out.println("---------------------------------------------");
        if(s1.equals(s2)){ // compara o conteudo das strings
            System.out.println("É Igual.");
        }else{
            System.out.println("É Diferente.");
        }

        
    }
}