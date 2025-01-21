public class Carro {
    private String nomeCarro;
    public Carro(String nomeCarro){
        this.nomeCarro = nomeCarro;
    }

    public void Info(){
        System.out.println("---------------------------------");
        System.out.printf("Nome carro: %s%n", this.nomeCarro);
    }
}
