package br.com.erickfreire.instrucaoauxialidaporcomputador;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * Programa em Java que ensina um alunos a aprender multiplicação
 * @author Erick Freire
 * @version 1 - Criado em 15-05-2021 as 14:23
 */

public class InstrucaoAuxiliadaPorComputadorReduzinadoAFadigaDoAluno {
		
		public static void main(String[] args) {
			
			System.out.println("Programa que ajuda aprender multiplicação");
			
			multiplicacao();

		}
		
		public static void multiplicacao() {
			
			int numero1;
			int numero2;
			int multiplicacao;
			int resposta;
			int correta;
			int incorreta;
			
			SecureRandom numeroAleatorio = new SecureRandom();
			Scanner entrada = new Scanner(System.in);
			
			numero1 = numeroAleatorio.nextInt(10);
			numero2 = numeroAleatorio.nextInt(10);
			multiplicacao = numero1 * numero2;
			
			System.out.printf("%nQuanto é %d * %d ?%n", numero1, numero2);
			resposta = entrada.nextInt();
			
			if(resposta == multiplicacao) {
				correta = 1 + numeroAleatorio.nextInt(4);
				
				switch (correta)
				{
				case 1:
					System.out.println("Muito Bom!");
					break;
				case 2:
					System.out.println("Excelente!");
					break;
				case 3:
					System.out.println("Bom Trabalho!");
					break;
				case 4:
					System.out.println("Mantenha um bom trabalho!");
					break;
				default:
						System.out.println("Muito Bem!");
						break;
				}
			} else {
				while(resposta != multiplicacao) {
					incorreta = 1 + numeroAleatorio.nextInt(4);
					
					switch (incorreta)
					{
					case 1:
						System.out.println("Não, por favor tente de novo");
						break;
					case 2:
						System.out.println("Errado. Tente mais uma vez.");
						break;
					case 3:
						System.out.println("Não desista!");
						break;
					case 4:
						System.out.println("Não. Continue tentando.");
						break;
					default:
							System.out.println("Errado!");
							break;
					}
					System.out.printf("%nResposta Incorreta! Tente de novo! Quanto é %d * %d ?%n", numero1, numero2);
					resposta = entrada.nextInt();
				}
				System.out.println("Muito Bem!");
			}
		}
		

}
