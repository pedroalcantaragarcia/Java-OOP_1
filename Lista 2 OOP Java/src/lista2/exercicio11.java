package lista2;

import java.util.Scanner;

/*Escrever um programa que calcule todos os números inteiros divisíveis por um certo valor
indicado pelo usuário, e compreendidos em um intervalo também especificado pelo
usuário. O usuário deve entrar com um primeiro valor correspondente ao divisor e após
ele vai fornecer o valor inicial do intervalo, seguido do valor final deste intervalo.
Exemplo: Valor do divisor: 3;
Inicio do Intervalo: 17;
Fim do Intervalo: 29;
Saída-> Números divisíveis por 3 no intervalo de 17 a 29: 18, 21, 24, 27.*/
public class exercicio11 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int divisor, 
			intervalo,
			fimIntervalo;
		
		System.out.print("Digite o valor do numero divisor:");
		divisor = entrada.nextInt();
		
		System.out.print("Digite o valor do inicio do intervalo:");
		intervalo = entrada.nextInt();
		
		System.out.print("Digite o valor do final do intervalo:");
		fimIntervalo = entrada.nextInt();
		
		for(int i = intervalo; intervalo <= fimIntervalo; intervalo++) {
			if(intervalo % divisor == 0) {
				System.out.printf("%d\n", intervalo);
			}
		}
	}
}
