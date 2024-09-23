public class CamaroteSuperior extends Vip {
	
	private char classe;
	
	@Override
	public Double mostraValor(){
		if(classe == 'A'){
			return valor *1.75;
		}
		if(classe == 'B'){
			return valor *1.5;
		}
		
		return 1.5;
	}
	
	public char getClasse() {
		return classe;
	}

	public void setClasse(char classe) {
		this.classe = classe;
	}

	public CamaroteSuperior(Double valor, Double adicional, char classe){
		super(valor, adicional);
		this.classe = classe;
		
	}
}
