public class Agenda {
	
	private Pessoa[] contatos;
	
	
	public boolean adicionaContato(Pessoa pessoa){
		for(int i=0; i<contatos.length; i++){
			if(contatos[i] != null){
				if(contatos[i].getNome().equals(pessoa.getNome())){
					return false;
				}
			}
		}
		
		for(int i=0; i<contatos.length; i++){
			if(contatos[i] == null){
				contatos[i] = pessoa;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeContato(Pessoa pessoa){
		for(int i=0; i<contatos.length; i++){
			if(contatos[i] != null){
				if(contatos[i].getNome().equals(pessoa.getNome())){
					contatos[i] = null;
					return true;
				}
			}
		}
		return false;
	}
	
	public Pessoa buscaContato(String nome){
		for(int i=0; i<contatos.length; i++){
			if(contatos[i] != null){
				if(contatos[i].getNome().equals(nome)){
					return contatos[i];
				}
			}
		}
		return null;
	}
	
	public boolean alteraContato(String nome, Pessoa pessoa){
		for(int i=0; i<contatos.length; i++){
			if(contatos[i] != null){
				if(contatos[i].getNome().equals(nome)){
					contatos[i] = pessoa;
					return true;
				}
			}
		}
		return false;
	}
	
	public Pessoa[] listaAniversarios(String mes){
		int pos = 0;
		String[] aniversario;
		Pessoa[] aniversariantes = new Pessoa[contatos.length];
		for(int i=0; i<contatos.length; i++){
			if(contatos[i] != null){
				aniversario = contatos[i].aniversario();
				if(aniversario[1].equals(mes)){
					aniversariantes[pos++] = contatos[i];
				}
			}
		}
		return aniversariantes;
	}
	
	public Pessoa[] listaTelefone(){
		int pos=0;
		Pessoa[] telefones = new Pessoa[contatos.length];
		for(int i=0; i<contatos.length; i++){
			if(contatos[i] != null){
				if(!contatos[i].getTelefone().equals("0")){
					telefones[pos++] = contatos[i];
				}
			}
		}
		return telefones;
	}
				
	
	
	
	public Agenda(int tamanho){
		contatos = new Pessoa[tamanho];
	}
	
	public Pessoa[] getcontatos(){
		return contatos;
	}
}
