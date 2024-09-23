/*
 * Teste_paciente.java
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
public class Testepaciente {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		Paciente Pac1 = new Paciente();
		Paciente Pac2 = new Paciente();


			System.out.println("Qual o nome do paciente:");
			Pac1.nome = scan.nextLine();
			System.out.println("Qual o sexo do paciente:");
			Pac1.sexo = scan.nextLine();
			System.out.println("Qual o peso do paciente :");
			Pac1.peso = scan.nextDouble();
			System.out.println("Qual a altura do paciente :");
			Pac1.altura = scan.nextDouble();
			System.out.println("o IMC de " + Pac1.nome + " é de " + Pac1.IMC());
			
			scan.nextLine();
			System.out.println("Qual o nome do paciente:");
			Pac2.nome = scan.nextLine();
			System.out.println("Qual o sexo do paciente:");
			Pac2.sexo = scan.nextLine();
			System.out.println("Qual o peso do paciente :");
			Pac2.peso = scan.nextDouble();
			System.out.println("Qual a altura do paciente :");
			Pac2.altura = scan.nextDouble();
			System.out.println("o IMC de " + Pac2.nome + " é de " + Pac2.IMC());

			
	}
}

