import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main (String[] args) {
        try{
            File myFile = new File ("test.txt");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) { //return boolean
                String data = myReader.nextLine(); //Leitura linha a linha
                System.out.println(data);
                System.out.println("=========");
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error oncurred");
        }
    }
}
