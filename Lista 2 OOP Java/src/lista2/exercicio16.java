package lista2;

import java.util.Scanner;

public class exercicio16 {
	/*[17]  Faça um programa que leia um numero inteiro N e mostre todos os números primos entre
	1 e N. Número primo é aquele que é divisível apenas por 1 e ele mesmo. 
	Ex. 17 é um número primo, pois só é divisível por 1 e por ele mesmo.*/
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		int numero = 0,
			i = 0;
		char opc = ' ';
		
		
		do {
			System.out.println("Digite o valor do numero: ");
			numero = input.nextInt();
			
			for(i = 1; i <= numero; i++) {
				if(numero % i == 0) {
					System.out.printf("%d primo %n", i);
				}else {
					System.out.printf("%d nao primo %n", i);
				}
			}
			System.out.println("Deseja continuar? Sim/nao");
			opc = input.next().toLowerCase().charAt(0);
		}while(opc != 'n');
	}
}
