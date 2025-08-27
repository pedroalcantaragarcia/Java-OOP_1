/*(11)Dados os pontos A e B, cujas coordenadas reais A(x1, y1) e B(x2, y2) serão informadas
via teclado, escreva um programa que calcule a distância euclidiana entre A e B, onde:*/

package questoes;

import java.util.Scanner;
import java.math.*;

public class exercicio11 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double x1,x2,y1,y2,ED;
		
		System.out.print("Digite um valor para x:");
		x1 = entrada.nextDouble();
		
		System.out.println("Digite um valor para y: ");
		x2 = entrada.nextDouble();
		
		System.out.println("Digite o valor de y1: ");
		y1 = entrada.nextDouble();
		
		System.out.println("Digite o valor de y2:");
		y2 = entrada.nextDouble();
		
		ED = Math.sqrt(Math.pow(y2 - y1, 2)+ Math.pow(x2 - x1, 2));
		
		System.out.print(" A distancia Euclidiana e igual a: "+ED);
		
	}

}
