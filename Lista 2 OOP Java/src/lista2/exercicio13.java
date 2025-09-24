package lista2;

import java.util.Scanner;

/*
[13] Faça um programa que leia uma senha (número inteiro). Em seguida, pergunte ao usuário
a senha informada, caso a senha esteja errada imprima “Senha incorreta, tente
novamente” e leia novamente a senha. Caso o usuário digite a senha correta, imprima
“Senha correta! Bem-vindo ao sistema”.
*/
public class exercicio13 {
	public static void main(String[] args) {
		
		int password,
			passwordUser;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Crie uma senha: ");
		password = input.nextInt();
		
		do {
			System.out.print("Confirme sua senha:");
			passwordUser = input.nextInt();
			
			if(passwordUser != password) {
				System.out.print("Senha errada! Tente novamente:\n");
			}else {
				System.out.println("Senha correta! Bem vindo ao sistema!");
			}
		}while(passwordUser != password);
		
		input.close();
	}	
}
