
public class Funcionario {
	
	protected String nome;
	protected int matricula;
	protected Double salarioBase;
	
	public Double calculaSalario(){
		return salarioBase * 0.92;
	}
		
	protected Funcionario(String nome, int matricula, Double salarioBase){
		this.nome = nome;
		this.matricula = matricula;
		this.salarioBase = salarioBase;
	}
	
	//gets e sets
	
	public String getNome(){
		return nome;
	}
	
}
