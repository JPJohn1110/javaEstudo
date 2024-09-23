public class Motocicleta extends Veiculo{
	
	private int cilindrada;
	
	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public Double autonomia(){
		return  super.autonomia()/passageiros;
	}

	public Motocicleta(int passageiros, int combustivel, Double rendimento, int cilindrada){
		super(passageiros, combustivel, rendimento);
		this.cilindrada  = cilindrada;
	}
}

