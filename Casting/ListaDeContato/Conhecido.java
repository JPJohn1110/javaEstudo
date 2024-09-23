public class Conhecido extends Pessoa {
    private String email;

    public Conhecido(String nome, int idade, String email) {
        super(nome, idade);
        this.email = email;
        this.tipo="C";
    }

    public Conhecido() {
        super("Indefinido", 0);
        this.email = "Indefinido";
        this.tipo = "C";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    

    
}
