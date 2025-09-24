package lista2;

import java.util.Scanner;

/*
 [14] Faça um programa que receba 2 notas (valide as notas, onde 0.0 ≤ nota ≤ 10) de um
número indeterminado de alunos. Calcule e mostre:

a. A média aritmética das 2 notas lidas;
b. Uma mensagem de acordo com as regras: Até 3 (Reprovado); Entre 3 e 7
(Exame); de 7 para cima (Aprovado);
c. O total de alunos;
d. Quantidade de alunos Aprovados, Reprovados e de Exame.
e. A Média da classe.
f. O nome e a média dos Alunos com a maior e menor média da classe.
 */
public class exercicio14 {
	public static void main(String[] args) {
		
		double nota1,
			   nota2,
			   mediaAritmetica = 0.0,
			   mediaTotal = 0.0;
		
		double alunoMaiorNota = 0.0,
			   alunoMenorNota = 0.0;
		
		String alunoNome = " ",
			   alunoMaiorMedia = " ",
			   alunoMenorMedia = " ";
		
		int alunoAprovado = 0,
			alunoReprovado = 0,
			alunoDeExame = 0,
			contAlunos = 0;
		
		char opc = ' ';	
		
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("Digite o nome do aluno: ");
			alunoNome = input.next();
			
			System.out.println("Digite a primeira nota do aluno: ");		
			nota1 = input.nextDouble();
			
			if(nota1 < 0.0 || nota1 >10) {
				do{
					System.out.printf(" A nota %.2f nao e valida por gentileza,%ninsira uma nota maior zero e menor ou igual a 10: %n", nota1);
					nota1 = input.nextDouble();
				}while(nota1 < 0.0 || nota1 > 10.0);
			}
			
			System.out.println("digite a segunda nota:");
			nota2 = input.nextDouble();
			
			if(nota2 < 0.0 ) {
				do {
					System.out.printf("A nota %.2f nao e valida por gentileza,%ninsira uma nota maior que zero e menor ou igual a 10: %n", nota2);
					nota2 = input.nextDouble();
				}while(nota2 < 0.0 || nota2 > 10.0);
			}
			
				
			mediaAritmetica = (nota1 + nota2)/ 2.0;
			mediaTotal += mediaAritmetica;
			System.out.printf("A media aritmetica foi %.2f%n", mediaAritmetica);
			
			if(mediaAritmetica >= 7.0) {
				System.out.printf("Aluno aprovado");
				alunoAprovado++;
				alunoMaiorNota = mediaAritmetica;
				alunoMaiorMedia = alunoNome;
			}else if(mediaAritmetica <= 3.0) {
				System.out.printf("Aluno reprovado");
				alunoReprovado++;
				alunoMenorNota = mediaAritmetica;
				alunoMenorMedia = alunoNome;
			}else {
				alunoDeExame++;
			}
			contAlunos++;
			System.out.printf("Deseja continuar? [Sim/nao]");
			opc = input.next().toLowerCase().charAt(0);
		}while(opc != 'n' );
		 
		System.out.printf("A quantidade de alunos avaliados: %d %nQuantidade de alunos aprovados: %d %n"
				+ "Quantidade de alunos de exame: %d %nQuantidade de alunos de reprovados: %d %nMedia da classe: %.2f %n",contAlunos,alunoAprovado, alunoDeExame, alunoReprovado,mediaTotal/contAlunos);
		System.out.printf("%s teve a maior media, conseguindo %.2f como media final  %n", alunoMaiorMedia, alunoMaiorNota);
		System.out.printf("%s teve a menor media, conseguindo %.2f como meida final %n", alunoMenorMedia, alunoMenorNota);
	}
}
