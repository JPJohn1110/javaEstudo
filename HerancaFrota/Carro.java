public class Carro extends Veiculo {
	
	protected boolean cambioAutomatico;
	
	@Override
	public Double autonomia(){
		if(cambioAutomatico){
			return (combustivel*rendimento*0.9);
		}
		
		return combustivel*rendimento;
	}
	
	public Carro(int passageiros, int combustivel, Double rendimento, boolean cambioAutomatico){
		super(passageiros,combustivel,rendimento);
		this.cambioAutomatico = cambioAutomatico;
		
	}

	public boolean isCambioAutomatico() {
		return cambioAutomatico;
	}

	public void setCambioAutomatico(boolean cambioAutomatico) {
		this.cambioAutomatico = cambioAutomatico;
	}

}

