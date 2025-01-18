public class Animal implements SerVivo{
    public Animal(){
        //this.vivo = false; // não é possivel
    }

    public void mover(){}
    public void comer(int mass){}
    public void info(){
        System.out.printf("Vivo?: %s", this.vivo ? "Sim":"Não");
    }

}
