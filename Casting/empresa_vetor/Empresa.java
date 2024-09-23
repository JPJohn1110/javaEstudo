import java.util.Scanner;

public class Empresa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        SetorPessoal teste = new SetorPessoal(20);
        Funcionario dados = new Funcionario(1,2,"jorge",100.0, "casa");
        Funcionario dados2 = new Funcionario(2,2,"joaisa",10880.0, "casa");

        int matricula;
        int departamento;
        double salario;
        String nome;
        String funcao;
	
	
	while(true){
        System.out.println("Escolha uma opção: \n1-Add \n2-Remover \n3-Buscar \n4-Listar \n5-Listar>>Empresa \n6-Folha de pagamento");
        int a = scan.nextInt();

        switch (a) {
            case 1:
                System.out.println(teste.adicionarFuncionario(dados));
                System.out.println(teste.adicionarFuncionario(dados2));

                break;
        
			case 2:
                System.out.print(teste.removerFuncionario(dados));
                break;
                
            case 3:
                System.out.println(teste.buscarFuncionario(1).getNome());
                break;
			
			case 4:
                teste.removerFuncionario(dados);
                break;
                
            case 5:
                teste.listarFuncionarios("casa");
                break;
            case 6:
                
                for(Funcionario temo : teste.listarFuncionarios()){
					if (temo != null) {
						System.out.println(temo.getNome());
					}
                }
                
                break;
                
            case 7:
                break;
            
            default:
                break;
			}
		}
    }
}
