/*Uma loja resolveu realizar uma promoção de seus produtos oferecendo um desconto
variável em % informado pelo vendedor. Escreva um programa que leia o valor original
do produto e o valor do desconto oferecido pelo vendedor e imprima o novo valor do
produto.*/

package questoes;

import java.util.Scanner;
public class exercicio5 {
	
	public static void main(String[] args) {
		
		float produto,produtoPromocao,descontoPorcento,produtoFinal;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quanto custa o produto? ");
		produto = entrada.nextFloat();
		
		System.out.println("De quantos % sera o desconto do vendedor? ");
		descontoPorcento = entrada.nextFloat();
		 
		produtoPromocao = ((produto/100)*descontoPorcento);
		produtoFinal = produto - produtoPromocao;
		
		System.out.println("O produto em seu valor original custa["+produto+"]\nAgora o produto com desconto vale ["+produtoFinal+"]\nPois o desconto foi de["+descontoPorcento+"%]");
	}

}
