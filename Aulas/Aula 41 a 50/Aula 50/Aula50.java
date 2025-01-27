import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;

public class Aula50{
    public static void main(String[] args) {
        
        ArrayList<String> carros = new ArrayList<String>();
        
        carros.add("Golf");
        carros.add("Polo");
        carros.add("Fusca");
        System.out.println(carros);
        System.out.println("--------------------------------------");

        Iterator<String> it = carros.iterator();

        while(it.hasNext()){ // pega enqnt tiver proximo
            String c = it.next();
            if(c == "Golf"){
                it.remove();
            }
            System.out.println(it.next()); // exibe sempre o prox elemento até o ultimo
        }
        
        System.out.println(carros);





    }
}