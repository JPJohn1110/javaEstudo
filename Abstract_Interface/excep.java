import java.util.*;
public class excep {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        try {
            a = scan.nextInt();
            
        } catch (InputMismatchException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
            System.out.println("Falha ao validar idade.");
        }
    }
}