

public class SetorPessoal {

	private int quantidade;
	
	Funcionario[] funcionario = new Funcionario[quantidade];

	Funcionario

	public boolean adicionarFuncionario(Funcionario func){

		for( int f=0; i<func.lenght;f++){
			if(funcioario[f].getMatricula() == func.getMatricula() || funcionario[f].getNome() == func.getNome()){
				return false;
			}
		}
					
		for( int f=0; i<func.lenght;f++){
			if(funcionario[f] == null){
				funcionario[f] == func;
				return true;
				
			}
		}
				

			
		
		

	
	}


	public SetorPessoal(int quantidade){
		this.quantidade = quantidade;
	}
}

