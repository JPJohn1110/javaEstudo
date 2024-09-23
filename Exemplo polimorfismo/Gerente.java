
public class Gerente extends Funcionario {
	
	private int tempoNaFuncao;
	
	@Override
	public Double calculaSalario(){
		int fator = tempoNaFuncao / 2;
		Double gratificacao = salarioBase * fator * 2 / 100;
		return (salarioBase + gratificacao) * 0.92;
	}
	
	public Gerente(String nome, int matricula, Double salarioBase, int tempoNaFuncao){
		super(nome, matricula, salarioBase);
		this.tempoNaFuncao = tempoNaFuncao;
	}
	
	//gets e sets
	
}
