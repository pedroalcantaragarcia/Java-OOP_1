/*(8)Faça um programa que leia 2 números inteiros A e B. Em seguida realize a troca dos
números, onde o valor da variável B seja colocado em A e vice-versa. Apresente os
valores trocados.*/

package questoes;
import java.util.Scanner;

public class exercicio8 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int a,b;
		
		System.out.println("Digite o valor de A: ");
		a = entrada.nextInt();
		
		System.out.println("Digite o valor de B: ");
		b = entrada.nextInt();
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("A: "+a+" \nB: "+b);
	}

}
