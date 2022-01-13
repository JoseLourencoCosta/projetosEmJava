package aula08;

public class Conta {
	
	private String nome;
	
	private String cpf;
	
	private String agencia;
	
	private String numero;
	
	private double saldo = 0;
	
	public Conta(String nome, String cpf, String agencia, String numero) {
		this.nome = nome;
		this.cpf = cpf;
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public void depositar(double valorDeposito) {
		this.saldo += valorDeposito;
	}

	public void sacar(double valorSaque) {
		if(valorSaque > this.saldo) {
			System.out.println("Valor de saque maior que saldo disponível");
		} else {
			this.saldo -= valorSaque;
		}
	}

	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	public String getAgencia() {
		return agencia;
	}
	public String getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
}
