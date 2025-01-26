import java.util.ArrayList;

public class Aula39{
    public static void main(String[] args) {
        char[] textoC = {'C','u','r','s','o', ' ', 'd', 'e', ' ', 'J','a','v','a'};
        String textoS = new String("Ohayo Pokko");

        String s1 = new String();
        String s2 = new String("Ohayo");
        String s3 = new String(textoS);
        String s4 = new String(textoC); // exibe o array de caracteres
        String s5 = new String(textoC, 0, 5); // exibe por posicao
        String s6 = new String("Italo");
        String s7 = new String();

        int tam;
        tam = s6.length();
        char c;
        c = s6.charAt(2);

        s6.getChars(0, 3, textoC, 0);

        System.out.println(textoC);
        System.out.println("Tamanho do texto: "+tam+" Caractere na pos 2: '"+c+"'");
    }
}