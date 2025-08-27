/*
 * Faça um algoritmo que calcule a quantidade de litros de combustível gasta em uma
viagem, utilizando um automóvel que faz 12Km por litro. Para obter o cálculo, o usuário
deve fornecer o tempo gasto na viagem e a velocidade média durante ela. Desta forma,
será possível obter a distância percorrida com a fórmula DISTANCIA = TEMPO *
VELOCIDADE. Tendo o valor da distância, basta calcular a quantidade de litros de
combustível utilizada na viagem com a fórmula: LITROS_USADOS = DISTANCIA /
AUTONOMIA. O programa deve apresentar os valores da velocidade média, tempo gasto
na viagem, a distância percorrida e a quantidade de litros utilizada na viagem.
 * 
 * */

package questoes;

import java.util.Scanner;

public class exercicio6 {
	public static void main(String[] args) {
		
		float tempoViagem, velocidadeMedia, distancia, litrosUsados, autonomia;
		autonomia = 12.0f;
		Scanner entrada = new Scanner(System.in);
 	
		System.out.println(" Qual foi o tempo gasto na viagem?");
		tempoViagem = entrada.nextFloat();
		
		System.out.println("Qual foi a velocidade media durante a viagem?");
		velocidadeMedia = entrada.nextFloat();
		
		distancia = tempoViagem * velocidadeMedia;
		litrosUsados = distancia/ autonomia;
		
		System.out.print(" A velocidade media foi "+velocidadeMedia+"\nTempo gasto: "+tempoViagem+"\nDistancia percorrida: "+distancia+" \nQuantidade de litros gasto:"+litrosUsados);
	}

}
