package Myclass;

class Carro { //objeto
    String idcarro;
    String modelo; //atributos
    String placa;
    String marca;
    int ano;

}

class Pessoa {
    String nome;
    int idade;
    String cpf;
    Carro carro;

}

public class MyClass {

    public static void vetor (string [] args) {
        Scanner scanner = new scanner (System.in);
        int [] vetor = new int [5];
        Carro [] carros = new Carro [2];
        Pessoa pessoa = new pessoa ();

        pessoa.cpf = "102.910.221-12";
        pessoa.idade = 25;
        pessoa.nome = "Fulano";
        pessoa.carro = new Carro();
        pessoa.carro.marca = "volkswagem";
        pessoa.carro.placa = "jds1e23";
        pessoa.carro.modelo = "gol";
        pessoa.carro.ano = 2024;

        for (int i = 0; i < carros.length; i++) {
            System.out.println("Carro" + i);
            carros [i] = new Carro (); //cria um objeto em uma área de memória do vetor
            System.out.println("marca:" + i);
            carros[i].marca = s.next();
            System.out.println("placa:" + i); 
            carros[i].placa = s.next();
            System.out.println("modelo:" + i); 
            carros[i].modelo = s.next(); 
            System.out.println("ano:" + i);
            carros[i].ano = s.nextInt();            
        }

        for (int i = 0; i < carros.length; i++) { //impressão
            System.out.println(carro[i].marca);
            System.out.println(carro[i].placa); 
            System.out.println(carro[i].modelo);        
            System.out.println(carro[i].ano);

        }
}

    public static void main (string [] args) {
        String marca = "Fiat";
        String placa = "kiu1312"; 
        String modelo = "Uno";               
        int ano = 2000;
    }
    public static void main (string [] args) {
        Carro carro = new carro ();
        Carro carro2 = new carro ();
        Pessoa pessoa = new pessoa ();

        carro.marca = "Fiat";
        carro.placa = "ksw1k23";
        carro.modelo = "Uno";        
        carro.ano = "2000";

        carro2.marca = "Chevrolet";
        carro2.placa = "pdw3k45";
        carro2.modelo = "Prisma";        
        carro2.ano = "2010";

        pessoa.nome = "fulano";
        pessoa.idade = 25;
        pessoa.cpf = "70607120349";

        System.out.println(carro.marca);
        System.out.println(carro.placa); //acesso a variáveis da classe
        System.out.println(carro.modelo);        
        System.out.println(carro.ano);

        System.out.println(carro2.marca);
        System.out.println(carro2.placa); 
        System.out.println(carro2.modelo);        
        System.out.println(carro2.ano);

        System.out.println(pessoa.nome);
        System.out.println(pessoa.idade); 
        System.out.println(pessoa.cpf);  
    }
}