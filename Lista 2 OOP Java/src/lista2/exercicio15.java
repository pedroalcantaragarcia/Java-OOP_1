package lista2;

import java.util.Scanner;

/*
 [15] Escreva um programa que apresente quatro opções: (a) consulta saldo, (b) saque e
(c)depósito e (d) sair. O saldo deve iniciar em R$ 0,00. A cada saque ou depósito o valor
do saldo deve ser atualizado.
Exemplo: 
		 Opcoes:
		 (A) CONSULTA SALDO
		 (B) SAQUE
		 (C) DEPOSITO
		 > A 
		 	  R$ 0.00
		 Opcoes
		 (A) CONSULTA SALDO
		 (B) SAQUE
		 (C) DEPOSITO  
		 
		 > C VALOR R$ 20.00
		 
*/
public class exercicio15 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		char opc = ' ';

		double totalSaldo = 0.0, saqueSaldo = 0.0, depositoSaldo = 0.0;

		do {
			System.out.printf("Opcoes: %n(a) consulta saldo %n(b) saque %n(c) deposito %nDigite d para sair %n");
			opc = input.next().toLowerCase().charAt(0);

			switch (opc) {
			case 'a':
				System.out.printf("O seu saldo e de: %.2f %n", totalSaldo);
				break;
			case 'b':
				System.out.printf("Digite quanto deseja sacar:");
				saqueSaldo = input.nextDouble();
				if(saqueSaldo <= totalSaldo) {
					totalSaldo -= saqueSaldo;
				}else{
					do {
						System.out.printf("O seu saldo e de %.2f %nTente sacar um valor menor: %n", totalSaldo);
						saqueSaldo = input.nextDouble();
					} while (saqueSaldo > totalSaldo);
				}
				
				
				System.out.printf("Seu saldo era de %.2f e agora e de %.2f %n", totalSaldo + saqueSaldo, totalSaldo);
				break;
			case 'c':
				System.out.printf("Digite quanto deseja depositar: %n");
				depositoSaldo = input.nextDouble();
				totalSaldo += depositoSaldo;
				break;
			case 'd':
				System.out.println("Saindo...");
				break;
			default:
				System.out.print("Erro tente novamente %n");
				break;
			}
			
		} while (opc != 'd');

		System.out.println("Fim do programa.");
	}
}
