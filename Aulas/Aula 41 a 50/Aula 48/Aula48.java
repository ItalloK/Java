import java.util.HashMap;

public class Aula48{
    public static void main(String[] args) {
        // 1º chave, 2º valor
        HashMap<Integer, String> carros = new HashMap<Integer, String>();

        carros.put(1, "Polo");
        carros.put(2, "HRV");
        carros.put(3, "Golf");
        carros.put(4, "Camaro");
        carros.put(5, "Mustang");
        carros.put(6, "Cruze");

        //System.out.println(carros); // imprime tudo -> Chave = Valor
        //System.out.println(carros.get(1)); // imprime baseado na chave

        /*for(int i = 1; i<carros.size()+1; i++){ // imprime tudo ( Começa do 1 pois a chave começa do 1 )
            System.out.println(carros.get(i));
        }*/

        /*for(String c : carros.values()){ // imprime os valores
            System.out.println(c);
        }*/

        

        carros.remove(5); // remove o item baseado na key.
        carros.clear(); // limpa tudo;        


    }
}