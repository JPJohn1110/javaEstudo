import java.util.*;

public class Empresa {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Funcionario funcionario1 = new Funcionario("Fulano", 1000.0, 5);
		Funcionario funcionario2 = new Funcionario("Ciclano", 2000.0, 20);
		
		System.out.printf("Salario do gerente: R$ %.2f\n", funcionario1.mostrarSalario());
		System.out.printf("Salario do vendedor: R$ %.2f\n", funcionario2.mostrarSalario(10000.0));

		
	}
}
