/*Escreva um programa que leia dois números inteiros e imprima a seguinte saída, com os
valores calculados, sabendo que o primeiro número informado será o dividendo e o
segundo, o divisor:
Dividendo =
Divisor =
Quociente =
Resto =
*Obs. Para obter o resto de uma divisão utilize o operador %.*/

package questoes;

import java.util.Scanner;

public class exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		float dividendo,
			  divisor,
			  quociente,
			  resto;
		
		
		System.out.println("Digite o valor do numero dividendo *numero a ser dividido: ");
		dividendo = input.nextFloat();
		
		System.out.println("digite o valor do divisor *numero pelo qual sera dividido: ");
		divisor = input.nextFloat();
		
		quociente = dividendo/divisor;
		resto = dividendo%divisor;
		
		if (dividendo%divisor == 0) {
			System.out.printf("[%.2f] / [%.2f] = %.2f",dividendo,divisor,quociente);
		}else if(dividendo%divisor != 0) {
			System.out.printf("[%.2f]/[%.2f] = %.2f com resto %.2f",dividendo,divisor,quociente,resto);
		}else
			System.out.println("Algo na conta esta errado tente novamente");
	}
 
}
