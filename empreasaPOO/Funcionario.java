public class Funcionario {
	
	private String nome;
	private Double salarioBase;
	private int tempoDeServico;
	
	public Double mostrarSalario(){
		if(tempoDeServico <= 10){
			return salarioBase * 1.12;
		}else{
			return salarioBase * 1.17;
		}
	}
	
	public Double mostrarSalario(Double totalDeVendas){
		if(tempoDeServico <= 10){
			return salarioBase * 1.05 + totalDeVendas * 0.015;
		}else{
			return salarioBase * 1.1 + totalDeVendas * 0.02;
		}
	}
	
	public Funcionario(String nome, Double salarioBase, int tempoDeServico){
		this.nome = nome;
		this.salarioBase = salarioBase;
		this.tempoDeServico = tempoDeServico;
	}
	
	//get e set
}
