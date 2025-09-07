/*Escreva um programa que pergunte o nome e a idade de um indivíduo e imprima
(aproximadamente) quantos dias de vida ele possui. Considere que o ano tem 365 dias.*/

package questoes;

import java.util.Scanner;

public class exercicio3 {
	

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		String nome;
		float idade, 
			  diasVividos,
			  ano = 365f,
			  calcAno;
		
		
		System.out.println("Digite o seu nome:");
		nome = input.next();
		System.out.println("Digite quantos anos voce tem:");
		idade = input.nextFloat();
		
		calcAno = idade * ano;

		System.out.printf("Seu nome e %s e voce viveu aproximadamente %.2f dias ",nome,calcAno);
	}
}
