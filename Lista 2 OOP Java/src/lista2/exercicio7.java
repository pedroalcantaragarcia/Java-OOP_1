package lista2;

import java.util.Scanner;

/* [7] Faça um algoritmo que receba o salário e um código correspondente ao cargo de um
funcionário e imprima seu cargo, o salário, e o valor do aumento segundo o percentual de
aumento ao qual este funcionário tem direito segundo a tabela a seguir e o valor do
aumento baseado no salário. Ao final, mostre o salário com o aumento.*/

public class exercicio7 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double salario;
		int cod;
		
		System.out.println("Digite o codigo do seu cargo:");
		cod = input.nextInt();
		
		System.out.println("Digite o valor do seu salario");
		salario = input.nextDouble();
		
		input.close();
		
		switch (cod) {
		case 1:
			System.out.printf("Codigo %d Cargo Escrituario salario %.2f", cod, salario + (salario* 0.5));
			break;
		case 2:
			System.out.printf("Codigo %d Cargo Secretario salario %.2f", cod, salario + (salario* 0.35));
			break;
		case 3:
			System.out.printf("Codigo %d Cargo Caixa salario %.2f", cod, salario + (salario* 0.2));
			break;
		case 4:
			System.out.printf("Codigo %d Cargo Gerente salario %.2f", cod, salario + (salario* 0.10));
			break;
		case 5:
			System.out.printf("Codigo %d Cargo Secretario salario %.2f", cod, salario );
			break;

		}
	}
}
