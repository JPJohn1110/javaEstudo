public class Pickup extends Carro{
	
	private int capacidadeCarga;
	private int pesoCarga;
	
	@Override
	public Double autonomia(){
		if(this.pesoCarga > this.capacidadeCarga){
			return 0.0;	
		}
		
		if(this.pesoCarga == this.capacidadeCarga){
			return this.combustivel*this.rendimento/2;
		}
		
		return this.combustivel*this.rendimento;
	
	}
	
	public Pickup(int passageiros, int combustivel, Double rendimento, 
	boolean cambioAutomatico, int capacidadeCarga, int pesoCarga){
		super(passageiros,combustivel,rendimento,cambioAutomatico);
		this.capacidadeCarga = capacidadeCarga;
		this.pesoCarga = pesoCarga;
		
	}

	public int getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(int capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}

	public int getPesoCarga() {
		return pesoCarga;
	}

	public void setPesoCarga(int pesoCarga) {
		this.pesoCarga = pesoCarga;
	}


}
