import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Data nascido = new Data(20, 10,2000);
   
        Pessoa pe1 = new Pessoa("João", nascido);
        
        Data hoje = new Data(30, 10, 2023);
        
        System.out.println(pe1.mostrarIdade(hoje));
   
   
    }
}
