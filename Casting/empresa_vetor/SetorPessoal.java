public class SetorPessoal {
	
	Funcionario[] funcionario; 
	public SetorPessoal(int quantidade){
		funcionario = new Funcionario[quantidade];
	}
	

	public boolean adicionarFuncionario(Funcionario func){

		for( int f=0; f< funcionario.length ;f++){
			if (funcionario[f] != null){
				if(funcionario[f].getMatricula() == func.getMatricula() || funcionario[f].getNome().equals(func.getNome())){
					return false;
				}
			}
		}
					
		for(int f=0; f<funcionario.length;f++){
			if(funcionario[f] == null){
				funcionario[f] = func;
				return true;

				
			}
		}
		return false;
    }		

    public boolean removerFuncionario(Funcionario func){
        for( int f=0; f<funcionario.length;f++){
			if (funcionario[f] != null){
				if(funcionario[f].getMatricula() == func.getMatricula()){
					funcionario[f] = null;
					return true;
				}
            } 

        }
          
        return false;

    }

   public Funcionario buscarFuncionario(int matricula){
		for(int i=0; i<funcionario.length; i++){
			if(funcionario[i] != null){
				if(funcionario[i].getMatricula() == matricula){
					return funcionario[i];
				}
			}
		}
		
		return null;
	}

    public Funcionario[] listarFuncionarios(int departamento){
        Funcionario [] aux = new Funcionario[funcionario.length];
        for(Funcionario temp : funcionario){
			if (temp != null){
				if(temp.getDepartamento() == departamento){
				 int p =0;
				aux[p] = temp;
				p++;
				}
			}
        }
        return aux;


    }


     public Funcionario[] listarFuncionarios(String funcao){
        Funcionario [] aux = new Funcionario[funcionario.length];
        for(Funcionario temp : funcionario){
			if (temp != null){
				if(temp.getFuncao().equals(funcao)){
				int p =0;
				aux[p] = temp;
				p++;
				}
			}
        }
     return aux;

    }

    public Funcionario[] listarFuncionarios(){
		
        return funcionario;
    }

}
