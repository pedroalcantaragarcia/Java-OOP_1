/*(9)Faça um algoritmo que leia o RAIO (R) e calcule a ÁREA e o PERÍMETRO de uma
esfera. Area = 4πR2 e Perimetro = 2πR. Considere π = Math.PI.*/
package questoes;

import java.util.Scanner;
import java.math.*;

public class exercicio9 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double r,areaEsfera, perimetroEsfera;
		
		System.out.println("Digite o valor do raio da esfera: ");
		r = entrada.nextFloat();
		
		areaEsfera = ((4*Math.PI) *(Math.pow(r, 2)));
		
		perimetroEsfera = (2*Math.PI*(r));
		
		System.out.println("A area da esfera e igual a: "+areaEsfera+"\nO perimetro: "+perimetroEsfera);
		
	}	
}
