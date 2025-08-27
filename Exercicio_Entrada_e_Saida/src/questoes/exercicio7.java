/*
 * (7) Uma Progressão Aritmética (P.A) é determinada pela sua razão (r) e pelo seu primeiro
termo (a1). Escreva um programa que determine o n-ésimo termo de uma P.A utilizando
a fórmula abaixo. Para tal, leia o primeiro termo, a razão e o valor de n que representa o
índice do n-ésimo termo. Ao final, imprima o valor da P.A de n (an).
*/

package questoes;

import java.util.Scanner;

public class exercicio7 {
	public static void main(String[] args) {
		int r,a1,an,n;
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Digite o valor do primeiro termo: ");
		a1 = entrada.nextInt();
		
	
		System.out.println("Digite o valor da razao:");
		r = entrada.nextInt();
		 
		System.out.println("Digite o valor de n:");
		n = entrada.nextInt();
				
		an = (a1+(n -1)*r);
		
		System.out.println(an);
	}
	
}
