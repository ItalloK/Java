package Veiculos;

public class Veiculos {
    protected String nome;
    protected int tipo;

    public Veiculos(String nome, int tipo){
        this.nome = nome;
        this.tipo = tipo;
    }

    public void info(){
        System.out.printf("Nome:%s%n", this.nome);
        System.out.printf("Tipo:%d%n", this.tipo);
    }
}
