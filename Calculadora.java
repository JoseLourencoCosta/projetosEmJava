package aula07;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bem vindo a calculadora Mister Mário!");
		
		while(true) {
			
			System.out.println("Digite uma opção (0-4)");
			System.out.println("0 - SAIR");
			System.out.println("1 - SOMAR");
			System.out.println("2 - SUBTRAIR");
			System.out.println("3 - MULTIPLICAR");
			System.out.println("4 - DIVIDIR");
			
			int opcao = scan.nextInt();
			
			if(opcao == 0) {
				
				System.out.println("FIM!");
				break;
				
			} else if (opcao >= 1 && opcao <= 4) {
				
				System.out.println("Digite o primeiro número: ");
				double primeiroNumero = scan.nextDouble();
				
				System.out.println("Digite o segundo número: ");
				double segundoNumero = scan.nextDouble();
				
				if(opcao == 1) {
					double soma = primeiroNumero + segundoNumero;
					System.out.println("Soma = " + soma);				
				} else if (opcao == 2) {
					double subtracao = primeiroNumero - segundoNumero;
					System.out.println("Subtração = " + subtracao);
				} else if (opcao == 3) {
					double multiplicacao = primeiroNumero * segundoNumero;
					System.out.println("Multiplicação = " + multiplicacao);
				} else {
					double divisao = primeiroNumero / segundoNumero;
					System.out.println("Divisão = " + divisao);
				}
				
			} else {
				
				System.out.println("Opção inválida!");
			}
		}
		scan.close();
	}
}
