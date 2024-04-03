public class array {

    static string[] semana = new string[7];

    public static void main(String[] args) {

        semana[0] = "Domingo";
        semana[1] = "Lunes";
        semana[2] = "Martes";
        semana[3] = "Miercoles";
        semana[4] = "Jueves";
        semana[5] = "Viernes";
        semana[6] = "Sabado";

        foreach (string dia in semana) {
            Console.WriteLine(dia);
        }
    }
}
//Array unidimensional - vetor
public class vetor {

    static string[,] numeros = new string[7];

    public static void main(String[] args) {

        numeros = new int [,] { {5,21}, {7,14}, {9,11}, {12,8}, {15,5}, {17,3}, {19,1} };

        foreach (string num in numeros) {
            Console.WriteLine(dia);
        }
    }
}
//Arraymultidimensional - matriz
public class matriz {

// static int [,,] numeros = new int [5, 21, 7];
        static int [,,] numeros = new int [5, 3];

    public static void main(String[] args) {

        numeros = new int [,] { {5,21, 1}, {7, 14, 2}, {9, 11, 3}, {12, 8, 4}, {15, 5, 5}, {17, 3, 6}, {19, 1, 7} };

        foreach (string num in numeros) {
            Console.WriteLine(dia);
        }
    }
}