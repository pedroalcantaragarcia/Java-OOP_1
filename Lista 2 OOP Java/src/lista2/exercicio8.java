/*[8] Faça um programa que leia um código, x e y e calcule f(x,y) de acordo com as equações 
abaixo:

1 -> Função algébrica com raiz e fração
2 -> Função algébrica racional + raiz
3 -> Função polinomial com raiz quadrada
4 -> Função trigonométrica
*/

package lista2;

import java.util.Scanner;

public class exercicio8 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int x,y = 0;
		
		System.out.println("Digite valores para x e y:");
		x = input.nextInt();
		y = input.nextInt();
		 
		input.close();
		
		
	}
}
