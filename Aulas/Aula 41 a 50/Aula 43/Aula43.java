import java.nio.file.*;

public class Aula43{
    public static void main(String[] args) {
        
        Path diretorio = Paths.get("C:\\Users\\itall\\Desktop\\Aula 43");
        Path arquivo = Paths.get("C:\\Users\\itall\\Desktop\\Aula 43\\Texto.txt");
        
        if(Files.isDirectory(diretorio)){ // verifica se é diretorio ( não arquivo )
            System.out.println("Diretorio existe");
        }else{
            System.out.println("Diretorio não existe");
        }

        if(Files.exists(diretorio)){ // verifica se é arquivo ( não diretorio )
            System.out.println("Arquivo existe");
        }else{
            System.out.println("Arquivo não existe");
        }

    }
}