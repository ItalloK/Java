import java.util.ArrayList;

public class Aula36{
    public static void main(String[] args) {

        ArrayList<String> carros = new ArrayList<>();

        carros.add("HRV");
        carros.add("Polo");
        carros.add("Cruze");
        //carros.add("Golf"); // sem index ele adiciona no final.

        carros.add(1, "Argo");
        System.out.println("Pos 1: " + carros.get(1) + ""); // exibe por indice

        //carros.clear(); // limpa o array

        System.out.println(carros.indexOf("Cruze")); // retorna o index do veiculo ( se tiver + de 1, retorna o 1º )

        carros.remove("Cruze"); // pode remover o elemento(nome) ou index

        for(int i = 0; i<carros.size(); i++){
            System.out.println(carros.get(i));
        }

        /*for(String e : carros){
            System.out.println(e);
        }*/


    }
}