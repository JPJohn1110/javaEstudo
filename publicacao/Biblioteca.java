import java.util.*;

public class Biblioteca {

    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Publicacao estante[] = new Publicacao[2];
		
		for(int i=0; i<2; i++){
			System.out.println("Escreva o codigo");
			int isnb = scan.nextInt();
			scan.nextLine();
			System.out.println("copias");
			int numeroDeCopias = scan.nextInt();
			scan.nextLine();
			System.out.println("nome");
			String nome = scan.nextLine();
			System.out.println("emprestados");
			int copiasEmprestadas = scan.nextInt();
			scan.nextLine();
			System.out.println("tipo");
			String tipo = scan.nextLine();

			if(tipo.equals("L")){
                System.out.print("Autor:");
				String autor = scan.nextLine();
				System.out.print("Editora:");
				String editora = scan.nextLine();				
				Livro livro = new Livro(isnb, nome, numeroDeCopias, copiasEmprestadas, tipo, autor, editora);
                estante[i] = livro;
			}
		    if(tipo.equals("R")){
				System.out.print("Ano:");
				int ano = scan.nextInt();
				scan.nextLine();
				System.out.print("Volume:");
				int volume = scan.nextInt();
				scan.nextLine();
				Revista revista = new Revista(isnb, nome, numeroDeCopias, copiasEmprestadas, tipo, ano, volume);            
                estante[i] = revista;


			}
            
        }
        boolean x = true;
		while(x){	
			System.out.println("Escolha um livro");
			for(int i=0; i<2; i++){
				System.out.printf("[%d] - nome: %s \t cod: %d \n", i, estante[i].nome, estante[i].isnb);
			}
			int escolha = scan.nextInt();
			if (escolha == -1) return;
			
			if (estante[escolha].getTipo().equals("L")){
				Livro livro = (Livro) estante[escolha];
				System.out.println(livro.emprestar(26, 01));
				estante[escolha].setCopiasEmprestadas(estante[escolha].getCopiasEmprestadas() +1);
				System.out.println(livro.getCopiasEmprestadas());

			} 
			else{
				Revista revista = (Revista) estante[escolha];
				System.out.println(revista.emprestar(26, 01));
				estante[escolha].setCopiasEmprestadas(estante[escolha].getCopiasEmprestadas() +1);
				System.out.println(revista.getCopiasEmprestadas());

			}
		}
	}
   
} 
