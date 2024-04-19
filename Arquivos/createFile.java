import java.io.File;
import java.io.IOException;

public class createFile {
    public static void main (String[]args) {
        File myFile = new File("teste.txt"); //"arquivos\\teste.java"
    try {
        if(myFile.createNewFile()); //Criação do arquivo do projeto
        System.out.println("Arquivo criado");
    else 
         System.out.println("Arquivo já existe"); 
    
    } catch (IOException e) {
        e.printStackTrace();
    }
}

}