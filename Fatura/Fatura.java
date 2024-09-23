
public class Fatura {
	
	int numero;
	String descricao;
	int quantidade;
	Double preco;
	
	public Double getValorDaFatura(){
		return preco * quantidade;
	}
	
	public Fatura(int numero, String descricao, int quantidade, Double preco){
		this.numero = numero;
		this.descricao = descricao;
		if(quantidade < 0){
			this.quantidade = 0;
		}else{
			this.quantidade = quantidade;
		}
		if(preco < 0){
			this.preco = 0.0;
		}else{
			this.preco = preco;
		}
	}
	
}
