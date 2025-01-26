import java.nio.file.*;

public class Aula45{
    public static void main(String[] args){

        Path imgNova = Paths.get("C:\\Users\\itall\\Desktop\\Aula 45\\novo.jpg");
        Path imgVelha = Paths.get("C:\\Users\\itall\\Desktop\\Aula 45\\antigo.jpg");

        try{

            byte[] bytesImgNova = Files.readAllBytes(imgNova);
            Files.write(imgVelha, bytesImgNova);

        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}