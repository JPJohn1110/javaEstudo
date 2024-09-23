
public class Aluno {
	
	int matricula;
	String nome;
	String cpf;
	String endereco;
	
	public String toString(){
		String resposta = "Matricula: "+matricula+"\nNome: "+nome+"\nCPF: "+cpf+"\nEndereco: "+endereco;
		return resposta;
	}
	
	public Aluno(int matricula, String nome, String cpf, String endereco){
		this.matricula = matricula;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	
}
