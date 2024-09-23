public class Funcionario {

	private int matricula;
	private int departamento;
	private String nome;
	private double salario;
	private String funcao;
	
	public Funcionario(int matricula, int departamento, String nome,
	double salario, String funcao){
		this.matricula = matricula;
		this.departamento = departamento;
		this.nome = nome;
		this.salario = salario;
		this.funcao = funcao;

		}

	public String getNome(){
		return this.nome;
	}

	public int getMatricula(){
		return this.matricula;
	}

}

