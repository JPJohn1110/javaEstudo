public class Hatch extends Carro{
	
	private int bagageiro;
	
	public Double calculaVolume( int passageiros){

		if(passageiros < 3){

			 bagageiro = (int)(bagageiro*2.0);
		}
		if(passageiros == 3){
		
			 bagageiro = (int)(bagageiro*1.5);
		}
		return (double)bagageiro;
	}
	
	public Hatch(int passageiros, int combustivel, Double rendimento, boolean cambioAutomatico, int bagageiro){
		super(passageiros,combustivel,rendimento,cambioAutomatico);
		this.bagageiro = bagageiro;
		
	}

	public int getBagageiro() {
		return bagageiro;
	}

	public void setBagageiro(int bagageiro) {
		this.bagageiro = bagageiro;
	}


}

