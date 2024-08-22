public class Jogador {
    /* Construtor não retorna um TIPO (não é q não precise, é que não pode por(nem int ou void ou coisa do tipo))*/

    private int num = 0;
    private int vidas = 0;

    public Jogador(int num){
        this.num = num; // this.num = num da Class ( o la de cima )
        this.vidas = 3;
        System.out.printf("Jogador Nº: %d Criado, Vidas: %d\n", num, vidas);
    }

}
