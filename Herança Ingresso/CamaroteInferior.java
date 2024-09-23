
public class CamaroteInferior extends Vip{
	
	private String localizacao;
	
	@Override
	public Double mostraValor(){
	
		if(localizacao.equals("LATERAL")){
			return (valor + this.adicional)*1.2;
		}
		if(localizacao.equals("FRONTAL")){
			return (valor + this.adicional)*1.35;
		}
		return valor*1.2;

	}
	
	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public CamaroteInferior(Double valor, Double adicional, String localizacao){
		super(valor, adicional);
		this.localizacao = localizacao;
	}

}

