
import java.util.*;

public class Principal {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		CartaoWeb[] cartoes = new CartaoWeb[3];
		
		do{
			System.out.print("Cartões disponíveis:\n1 - Namorados\n2 - Natal\n3 - Aniversário\n");
			System.out.print("Informe o tipo de cartão: ");
			switch(scan.nextInt()){
				case 1:
					scan.nextLine();
					System.out.print("Destinatário: ");
					cartoes[0] = new DiaDosNamorados(scan.nextLine());
					System.out.println(cartoes[0].showMessage());
					break;
				case 2:
					scan.nextLine();
					System.out.print("Destinatário: ");
					cartoes[1] = new Natal(scan.nextLine());
					System.out.println(cartoes[1].showMessage());					
					break;
				case 3:
					scan.nextLine();
					System.out.print("Destinatário: ");
					cartoes[2] = new Aniversario(scan.nextLine());
					System.out.println(cartoes[2].showMessage());
					break;
				default:
					System.out.print("Opção Inválida:\n\n");
			}
		}while(true);
		
	}
}
