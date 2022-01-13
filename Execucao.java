package aula08;

public class Execucao {
	
	public static void main(String[] args) {
		
		Conta conta1 = new Conta("Kayan", "12267545678", "2202", "234565-9");
		conta1.depositar(1000);
		System.out.println("saldo: " + conta1.getSaldo());
		conta1.sacar(500);
		System.out.println("saldo: " + conta1.getSaldo());
		conta1.sacar(1000);
		System.out.println("saldo: " + conta1.getSaldo());
		
		Conta conta2 = new Conta("José", "1267767676", "2202", "298754-2");
		conta2.depositar(700);
		System.out.println("saldo: " + conta2.getSaldo());
		conta2.sacar(500);
		System.out.println("saldo: " + conta2.getSaldo());
		conta2.sacar(100);
		System.out.println("saldo: " + conta2.getSaldo());
	}

}
