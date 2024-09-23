public class Pessoa {
    private String nome;
    private Data nascimento;

    public Pessoa(String nome){
    this.nome = nome;
    this.nascimento.setDia(1);
    this.nascimento.setMes(1);
    this.nascimento.setAno(2000);
    }

    public Pessoa(String nome, Data nascimento) {
    this.nome = nome;
    this.nascimento = new Data(1, 1, 2000);
    }   

    public String mostrarIdade(Data hoje){
        
        return (this.nome + "possui" + nascimento.calculaTempo(hoje) + "anos"); 
    }

    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }
}

