public class Aula03{
    public static void main(String[] args){

        // if
        // if -> else
        // ? ( ternario )
        // switch

        int nota = 40;
        int media = 60;
        int faltas = 10;
        int Max_Faltas = 5;

        if(nota >= media && faltas <= Max_Faltas){
            System.out.println("Aprovado");
        }else if(nota >= 40){
            System.out.println("Recuperação.");
        }else{
            System.out.println("Reprovado");
        }
        System.out.println("fim do programa");

        /* Ternario */

        String Res;
        Res = (nota >= media) ? "Aprovado" : "Reprovado";
        System.out.println("Resultado: " + Res);

        int ResTern;
        ResTern = (nota >= media) ? 1 : 0;
        System.out.println("Resultado: " + ResTern);

        switch(ResTern){
            case 0:
            {
                System.out.println("Zero");
                break;
            }
            case 1:
            {
                System.out.println("Um");
                break;
            }
            default:
            {
                break;
            }
        }

    }
}
