
public class Vendedor extends Funcionario {
	
	private Double totalDeVendas;
	
	
	@Override
	public Double calculaSalario(){
		Double comissao = totalDeVendas * 0.025;
		return (salarioBase + comissao) * 0.92;
	}
	
	public Vendedor(String nome, int matricula, Double salarioBase, Double totalDeVendas){
		super(nome, matricula, salarioBase);
		this.totalDeVendas = totalDeVendas;
	}
	
}
