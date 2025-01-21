public class Aula25 {

    public static void main(String[] args){

        final int qntd = 5;

        Carro[] car = new Carro[qntd];

        String[] nomesCarro = {"Golf", "Camaro", "Mustang", "Toro", "Celta"};

        for(int i = 0; i<qntd; i++){
            car[i] = new Carro(nomesCarro[i]);
            car[i].Info();
        }   
        
    }
    
}
