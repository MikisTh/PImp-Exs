import java.io.File;
import java.io.fileWriter; 
import java.io.IOException;


public class writeFile {
    public static void main (String[]args) {
         //"arquivos\\teste.java"
    try {
        FileWriter myWriter = new FileWriter("teste.html", true);
        myWriter.write("Sport\n");        
        myWriter.close();        
    } catch (IOException e) {
        System.out.println("An error occurred");
        e.printStackTrace();
    }
}

}