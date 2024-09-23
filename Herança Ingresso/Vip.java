

public class Vip extends Ingresso{

	protected Double adicional;
	
	@Override
	public Double mostraValor(){
		return valor + adicional;
	}
		
	public Double getAdicional() {
		return adicional;
	}

	public void setAdicional(Double adicional) {
		this.adicional = adicional;
	}

	public Vip(Double valor, Double adicional){
		super(valor);
		this.adicional = adicional;
	}
}

