import java.util.LinkedList;
import java.util.Queue;

public class Aula47{
    public static void main(String[] args) {
        // firts in -> first out, primeiro a entrar, primeiro a sair e ultimo a entrar, ultimo a sair.

        Queue<String> carros = new LinkedList<>();

        carros.add("HRV");
        carros.add("Golf");
        carros.add("Polo");
        carros.add("Camaro");
        carros.add("Fusca");

        System.out.println("Topo da fila: "+carros.peek()); // exibe o topo da fila
        System.out.println(carros.isEmpty() ? "Fila vazia":"Fila com elementos"); // verifica se ta vazia
        System.out.println("Topo da fila: "+carros.poll()); // exibe o topo e remove

        for(String c : carros){
            System.err.println(c);
        }
    }   
}