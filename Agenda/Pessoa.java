
public class Pessoa {
	
	private String nome;
	private String telefone;
	private Data nascimento;
	
	public String[] aniversario(){
		String[] resposta = new String[2];
		resposta[0] = Integer.toString(nascimento.getDia());
		resposta[1] = Integer.toString(nascimento.getMes());
		return resposta;
	}
	
	public Pessoa(String nome){
		this.nome = nome;
		this.telefone = "0";
		this.nascimento = new Data(1, 1, 2000);
	}
	
	public Pessoa(String nome, String telefone, Data nascimento){
		this.nome = nome;
		this.telefone = telefone;
		this.nascimento = nascimento;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setTelefone(String telefone){
		this.telefone = telefone;
	}
	
	public String getTelefone(){
		return telefone;
	}
	
	public void setNascimento(Data nascimento){
		this.nascimento = nascimento;
	}
	
	public Data getNascimento(){
		return nascimento;
	}
}
