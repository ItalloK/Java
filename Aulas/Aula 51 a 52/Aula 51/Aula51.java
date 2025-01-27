import java.util.ArrayList;
import java.util.function.Consumer;

public class Aula51{
    public static void main(String[] args) {
        
        ArrayList<Integer> valores = new ArrayList<Integer>();
        ArrayList<Integer> dobro = new ArrayList<Integer>();
        ArrayList<Integer> par = new ArrayList<Integer>();
        ArrayList<Integer> impar = new ArrayList<Integer>();

        valores.add(1);
        valores.add(2);
        valores.add(3);
        valores.add(4);
        valores.add(5);
        valores.add(6);

        //Consumer<Integer> dobrar = (v)->{dobro.add(v*2);};
        //valores.forEach(dobrar);
        valores.forEach((v)->{
            dobro.add(v*2);
            if(v%2 == 0){
                par.add(v); // adiciona os pares
            }else{
                impar.add(v); // adiciona os impares
            }
        });
        


        System.out.println(valores);
        System.out.println(dobro);
        System.out.println(par);
        System.out.println(impar);


    }
}