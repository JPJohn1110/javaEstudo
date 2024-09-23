public class Veiculo{

		protected int passageiros;
		protected Double rendimento;
		protected int combustivel;

	public Double autonomia(){
		return this.combustivel* this.rendimento;
	}

	public Veiculo(int passageiros, int combustivel, Double rendimento){
		this.passageiros = passageiros;
		this.combustivel = combustivel;
		this.rendimento = rendimento;
	}

	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}

	public Double getRendimento() {
		return rendimento;
	}

	public void setRendimento(Double rendimento) {
		this.rendimento = rendimento;
	}

	public int getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(int combustivel) {
		this.combustivel = combustivel;
	}

}

