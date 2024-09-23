/*
 * Empresa.java
 * 
 * Copyright 2023 João Pedro <jpsr@jpsr-Nitro-AN515>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

import java.util.*;
public class Empresa {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		Funcionario[] func = new Funcionario[3];
		
		for(int i=0; i<3; i++){
			func[i] = new Funcionario();
			System.out.println("Digite o nome do funcionario, horas trabalhadas e valor da hora");
			func[i].nome = scan.nextLine();
			func[i].horasTrabalhadas = scan.nextDouble();
			func[i].valorHora = scan.nextDouble();
			scan.nextLine();
		System.out.printf("O funcionário %s receberá R$%.2f \n", func[i].nome, func[i].salariofinal());
		
		}
	}
}

