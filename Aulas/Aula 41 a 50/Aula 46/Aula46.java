import java.util.Stack;

public class Aula46{
    public static void main(String[] args) {

        // first in -> last out ( primeiro a entrar é o ultimo a sair )

        Stack<String> carros = new Stack<>();

        carros.push("HRV");
        carros.push("Golf");
        carros.push("Polo");
        carros.push("Camaro");
        carros.push("Fusca");

        //System.out.println("Topo da pilha: " + carros.peek()); // exibe elemento no topo da pilha
        //System.out.println("Topo da pilha: "+carros.pop()); // mostra o topo e depois remove
        Boolean status = carros.empty(); // retorna um boolean pra ver se a pilha ta vazia.
        System.out.println(status ? "Vazia":"Cheia");

        carros.clear(); // limpa a pilha
        
        System.out.println("----------------------------------------------");
        //System.out.println(carros); // imprime diretamente tudo
        /*for(String c : carros){
            System.out.println(c);
        }*/



    }
}