public class Funcionario {
    private int matricula;
    private int departamento;
    private String nome;
    private double salario;
    private String funcao;
    
    
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public int getDepartamento() {
        return departamento;
    }
    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    public Funcionario(int matricula, int departamento, String nome, double salario, String funcao) {
        this.matricula = matricula;
        this.departamento = departamento;
        this.nome = nome;
        this.salario = salario;
        this.funcao = funcao;
    }
}


