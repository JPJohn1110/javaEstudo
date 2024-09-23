public class Amigo extends Pessoa{
    private String aniversario;
    
    public Amigo(String nome, int idade, String aniversario){
        super(nome, idade);
        this.aniversario = aniversario;
        this.tipo = "A";
    }    

    public Amigo(){
        super("Indefinido", 0);
        this.aniversario = "Indefinido";
        this.tipo = "A";
        }
    public String getAniversario() {
        return aniversario;
    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }
}