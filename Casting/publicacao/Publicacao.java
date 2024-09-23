public class Publicacao{
    protected int isnb;
    protected String nome;
    protected int numeroDeCopias;
    protected int copiasEmprestadas = 0;
    private String tipo;
   

    public String emprestar(int dia, int mes){


        return dia +"/"+mes;

    }
   
    public Publicacao(int isnb, String nome, int numeroDeCopias, int copiasEmprestadas, String tipo) {
        this.isnb = isnb;
        this.nome = nome;
        this.numeroDeCopias = numeroDeCopias;
        this.copiasEmprestadas = copiasEmprestadas;
        this.tipo = tipo;
    }
    public int getIsnb() {
        return isnb;
    }
    public void setIsnb(int isnb) {
        this.isnb = isnb;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNumeroDeCopias() {
        return numeroDeCopias;
    }
    public void setNumeroDeCopias(int numeroDeCopias) {
        this.numeroDeCopias = numeroDeCopias;
    }
    public int getCopiasEmprestadas() {
        return copiasEmprestadas;
    }
    public void setCopiasEmprestadas(int copiasEmprestadas) {
        this.copiasEmprestadas = copiasEmprestadas;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
