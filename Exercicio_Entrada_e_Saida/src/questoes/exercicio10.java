/*(10)*/
package questoes;

import java.util.Scanner;
import java.math.*;
public class exercicio10 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double x,y,equacao;
		
		System.out.print("Digite um valor para x:");
		x = entrada.nextInt();
		
		System.out.print("Digite um valor para y:");
		y = entrada.nextInt();
		
		equacao=2*((Math.sqrt(3*x +30)/3)+(y-32) +(Math.pow(y, 4)-Math.pow(32, 4)));
		
		System.out.print(equacao);
	}

}
