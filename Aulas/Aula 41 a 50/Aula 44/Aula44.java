import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class Aula44{
    public static void main(String[] args){
        
        Path arquivo = Paths.get("C:\\Users\\itall\\Desktop\\Aula 44\\Texto.txt");
        
        try{
            List<String> linhas = Files.readAllLines(arquivo);
            for(String l : linhas){
                System.out.println(l);
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        


    }
}