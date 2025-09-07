/**
 *[1] Faça um programa que leia o nome e sobrenome de duas pessoas (marido e esposa) e um
ano (inteiro). E exiba a seguinte mensagem: “Fulano da Silva é casado com Ciclana de
Souza há XX anos”. Considere o ano atual como 2018.*/


package questoes;

import java.util.Scanner;
public class exercicio1 {
	
	public static void main(String[] args) {
		
		// As entradas serao armazenadas dentro da variavel input 
		Scanner input = new Scanner(System.in);
		
		// variaves do programa
		String nomeMarido, nomeEsposa; // variaves que vao receber o nome.
		
		int anoAtual = 2018, // variavel criada e inicializada ja recebendo o ano de de 2018
			anoCasamento,	 // essa variavel ira receber um valor atraves do input do usuario
			anoDeCasados; 	 // variavel que calcula o tatal de anos casados
		
		System.out.println("Digite o nome do marido: ");
		nomeMarido = input.next();

		System.out.println("Digite o nome da esposa: ");
		nomeEsposa = input.next();
		
		System.out.println("Desde quando são casados?");
		anoCasamento = input.nextInt();
		
		anoDeCasados = anoAtual - anoCasamento;
		
		System.out.printf("%s e %s sao casados a %d anos",nomeMarido,nomeEsposa,anoDeCasados);
		
	}
}
