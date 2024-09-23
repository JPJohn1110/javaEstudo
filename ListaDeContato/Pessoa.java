public class Pessoa{
    protected String nome;
    protected int idade;
    protected String tipo;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        this.tipo ="Indefinido";
    }
    public Pessoa(){
        this.nome = "Indefinido";
        this.idade = 0;
        this.tipo ="Indefinido";
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}