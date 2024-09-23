public class Exemplo{

    public static void Valor(int valor) {
        if (valor < 0) {
            throw new RuntimeException("O valor não pode ser negativo!");
        }
        System.out.println("Valor válido: " + valor);
    }

    public static void main(String[] args) {
        try {
            Valor(-2);  
        } catch (RuntimeException e) {
            System.out.println("Exceção tratada: " + e.getMessage());
        }
    }
}
