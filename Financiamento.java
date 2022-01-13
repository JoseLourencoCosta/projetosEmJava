package aula08;

import java.util.Scanner;

public class Financiamento {
	
	public static void validaValorEntrada (double valorTotal, double valorEntrada) {
		double valorMinimo = valorTotal * 0.1;
		if (valorEntrada < valorMinimo) {
			System.out.println("Não será possivel financiar.");
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Valor total do imóvel?");
		double valorTotal = scan.nextDouble();
		
		System.out.println("Valor de entrada?");
		double valorEntrada = scan.nextDouble();
		
		validaValorEntrada(valorTotal, valorEntrada);
		
		System.out.println("Salário mensal?");
		double salario = scan.nextDouble();
		
		System.out.println("Vai pagar em quantos meses?");
		int meses = scan.nextInt();
		
		scan.close();
		
		double valorFinanciamento = valorTotal - valorEntrada;
		double valorFinal = valorFinanciamento * 1.25;
		double valorParcela = valorFinal / meses;
		double valorSalarioMinimo = valorParcela * 0.5;
		if (salario < valorSalarioMinimo) {
			System.out.println("Não será possivel financiar.");
			System.exit(0);
		}
		
	}

}
