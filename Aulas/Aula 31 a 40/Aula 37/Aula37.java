import java.util.ArrayList;

public class Aula37{
    public static void main(String[] args) {

        ArrayList<String> carros = new ArrayList<>();

        carros.add("Golf");
        carros.add("Cruze");

        

        try{

            System.out.println(carros.get(10));

        }catch(IndexOutOfBoundsException e){
            System.out.printf("Erro de index%n");
        }catch(Exception ex){
            System.out.printf("Error: %s%n", ex.getMessage());
        }finally{
            System.out.printf("Fim do codigo!");
        }



    }
}