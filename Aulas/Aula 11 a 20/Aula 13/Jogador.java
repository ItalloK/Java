public class Jogador {
    /* Construtor não retorna um TIPO (não é q não precise, é que não pode por(nem int ou void ou coisa do tipo))*/
    private final int maxVidas = 3;
    private int num = 0;
    private int vidas = 0;
    static boolean alerta = false;
    static int qntdJogaores = 0;

    static int pontosJogadores = 0;

    public Jogador(int num){
        this.num = num; // this.num = num da Class ( o la de cima )
        this.vidas = 1;
        System.out.printf("Jogador Nº: %d Criado, Vidas: %d\n", num, vidas);
        qntdJogaores++;
    }


    public int getVidas(){
        return this.vidas;
    }

    public void addVidas(){
        if(this.vidas < maxVidas){
            this.vidas++;
        }
    }

    static void pontos(){
        pontosJogadores+=10;
    }


    public void info(){
        System.out.printf("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        System.out.printf("Jogador: %d\n", this.num);
        System.out.printf("Vidas: %d\n", this.vidas);
        System.out.printf("Alerta: %s\n", alerta ? "Sim":"Não");
        System.out.printf("Jogadores: %d \n", qntdJogaores);
        System.out.printf("Pontos Jogadores: %d \n", pontosJogadores);
        System.out.printf("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }

}
