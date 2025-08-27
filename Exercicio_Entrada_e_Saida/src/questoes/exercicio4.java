/*
 * Leia uma temperatura em graus Celsius e apresente-a convertida em graus Fahrenheit. A
formula de conversão é: F = C∗(9.0/5.0)+32.0, sendo F a temperatura em Fahrenheit e C
a temperatura em Celsius.
 * */
package questoes;

import java.util.Scanner;
public class exercicio4 {
	public static void main(String[] args) {

		
		Scanner entrada = new Scanner(System.in);
		
		//gC representa a varivavel de graus celcius 
		//gF representa a variavel em graus Fahrenheit
		float gC,gF;
		
		System.out.println("Digite o valor em graus Celcius: ");
		gC = entrada.nextFloat();
		gF = gC *(9.0f/5.0f)+32.0f;
		System.out.println(" O valor em graus Celcius e igual a ["+gC+"]\nE o valor em graus Fahrenheit sao ["+gF+"]");
	}
 	
}
