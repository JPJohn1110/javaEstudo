
import java.util.*;

public class Empresa {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Funcionario f = new Funcionario("Func", 111, 1000.0);
		Gerente g = new Gerente("Gere", 222, 1000.0, 10);
		Vendedor v = new Vendedor("Vend", 333, 1000.0, 10000.0);
		
		
		System.out.printf("\nFuncionario: %s\tSalario: R$ %.2f",f.getNome(), f.calculaSalario());
		System.out.printf("\nGerente: %s\tSalario: R$ %.2f",g.getNome(), g.calculaSalario());
		System.out.printf("\nVendedor: %s\tSalario: R$ %.2f",v.getNome(), v.calculaSalario());
	}
}
