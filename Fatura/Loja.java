
import java.util.*;

public class Loja {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o numero do produto: ");
		int numero = scan.nextInt();
		scan.nextLine();
		System.out.print("Informe a descricao do produto: ");
		String descricao = scan.nextLine();
		System.out.print("Informe o preco do produto: ");
		Double preco = scan.nextDouble();
		System.out.print("Informe a quantidade do produto: ");
		int quantidade  = scan.nextInt();
		
		Fatura fatura = new Fatura(numero, descricao, quantidade, preco);
		
		System.out.printf("Dados da Fatura\nProduto: %s\nQuantidade: %d\nPreco: R$ %.2f\nTotal da Fatura: R$ %.2f\n",fatura.descricao, fatura.quantidade, fatura.preco, fatura.getValorDaFatura());
		
		
		
	}
}
