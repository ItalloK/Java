import java.util.HashSet;

public class Aula49{
    public static void main(String[] args) {
        
        HashSet<String> carros = new HashSet<String>();

        carros.add("Polo"); // tambem retorna um Boolean de verificação se foi adicionado
        carros.add("Golf");
        carros.add("Fusca");

        //carros.add("Polo"); // se adicionar mais de um elemento com mesmo nome, ele não adiciona.
        System.out.println(carros.add("Polo") ? "Adicionado":"ERRO: Não Adicionado");

        carros.remove("Golf"); // remove por string
        carros.clear(); // limpa tudo
        

        System.out.println(carros);

        

    }
}