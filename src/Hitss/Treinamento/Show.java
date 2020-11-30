package Hitss.Treinamento;

import java.util.Scanner; /// *** Importando

import javax.sound.midi.Soundbank; /// *** Importando

public class Show {
	
	public static void main(String[] args) {
		System.out.println(""); /// *** Pula 1 Linha
		System.out.println("         Hitss Treinamento"); /// *** Enunciado do Programa
		System.out.println(""); /// *** Pula 1 Linha
		System.out.println("Digite o Valor de A:"); /// *** O Programa Pede para digitar o Valor de A
		System.out.println(""); /// *** Pula 1 Linha
		try { /// *** Inicialização do Tratamento
			int a, b, c, delta; /// *** Declaração das Variáveis a, b, c e delta
			
			Scanner teclado = new Scanner(System.in); /// *** Comando para digitar o valor no teclado
			
			a = teclado.nextInt(); /// *** Variável A Recebe um comando para digitar o seu valor no teclado
			
			System.out.println(""); /// *** Pula 1 Linha
			
			System.out.println("Digite o Valor de B:"); /// *** O Programa pede para digitar o Valor de B
			System.out.println(""); /// *** Pula 1 Linha
			
			b = teclado.nextInt(); /// *** Variável B recebe o Comando para digitar o valor pelo teclado
			
			System.out.println(""); /// *** Pula 1 Linha
			
			System.out.println("Digite o Valor de C:"); /// *** Programa Pede Para digitar o Valor de C
			System.out.println(""); /// *** Pula 1 Linha
			
			c = teclado.nextInt(); /// *** Variável C recebe um comando para digitar o Valor pelo Teclado
			
			System.out.println(""); /// *** Pula 1 Linha
			
			delta = (b * b) - (4 - a * c); /// *** Variável Delta recebe a Função da Equação de 2º Grau
			
			System.out.println("O Valor de Delta é: " + delta); /// *** O Programa Informa o Valor de Delta
			
		} catch (Exception e) { /// *** Cai no Catch
			System.out.println(""); /// *** Pula 1 Linha
			System.out.println("Erro de processamento: " + e.getMessage()); /// *** Se Der Bug o Programa Informa o Erro
		}
	}
}
