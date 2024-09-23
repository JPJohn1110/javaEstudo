
import java.util.*;

public class Principal {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe a matricula do aluno :");
		int matricula = scan.nextInt();
		scan.nextLine();
		System.out.print("Informe o nome do aluno :");
		String nome = scan.nextLine();
		System.out.print("Informe o cpf do aluno :");
		String cpf = scan.nextLine();
		System.out.print("Informe o endereco do aluno :");
		String endereco = scan.nextLine();
		

		Aluno aluno1 = new Aluno(matricula, nome, cpf, endereco);
		
		System.out.print(aluno1.toString());

		
		System.out.print("\nInforme a matricula do aluno :");
		matricula = scan.nextInt();
		scan.nextLine();
		System.out.print("Informe o nome do aluno :");
		nome = scan.nextLine();
		System.out.print("Informe o cpf do aluno :");
		cpf = scan.nextLine();
		System.out.print("Informe o endereco do aluno :");
		endereco = scan.nextLine();
		
		Aluno aluno2 = new Aluno(matricula, nome, cpf, endereco);
		
		System.out.print(aluno2.toString());
		
		
		
	}
}
