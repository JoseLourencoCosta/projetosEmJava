package aula07;

import java.util.Scanner;

public class NomeESobrenome {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite seu nome!" );
		String nome = scan.nextLine();
		nome.split(" ");
		String nomes[] = nome.split(" ");	
		System.out.println("nome: " + nomes[0]);
		
		String sobrenomes = "";
		for(int i=1; i<nomes.length; i++) {
			sobrenomes += nomes[i] + " ";
		} 
		System.out.println(sobrenomes);
		scan.close();
	}
	
}
