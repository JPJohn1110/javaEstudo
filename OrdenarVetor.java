import java.util.*;
public class OrdenarVetor {

	public static void main (String[] args) {
		
		int MAX=10;
		Scanner scan = new Scanner(System.in);
		
		int[] vetor = new int [MAX]; 
		
		for(int i=0; i<MAX; i++){
			System.out.println("Escreva um numero");
			vetor[i] = scan.nextInt();			
		}
		
		for(int j=0; j<MAX; j++){
			System.out.print("[" + vetor[j] + "]" );
		}
		
		System.out.println();
		
	//ORDENAR COM INSERCTION SORT
	
		for(int i = 1; i<MAX; i++){
			int j = i;

			while(j>0 && vetor[j] < vetor[j-1]){
				int aux = vetor[j];
				vetor[j] = vetor[j-1];
				vetor[j-1] = aux;
				j--;
			
			}
			
			
		}
		
		for(int j=0; j<MAX; j++){
			System.out.print("[" + vetor[j] + "]");
		}
	}
}

