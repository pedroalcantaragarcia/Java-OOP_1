/*Escreva um programa que calcule o fatorial de um número inteiro N fornecido pelo
usuário. Cuidado com valores inválidos!*/

package lista2;
 
import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numero;
		int fatorial =1;
		
		System.out.println("PROGRAMA QUE CALCULA O FATORIAL DE UM NUMERO INTEIRO");
		System.out.println("Digite o valor do numero: ");
		numero = input.nextInt();
		input.close();
				
		for(int i = 2; i <= numero; i++)
			fatorial *=  i;
		
		System.out.printf("O fatorial de %d e %d",numero, fatorial);
	}
}
