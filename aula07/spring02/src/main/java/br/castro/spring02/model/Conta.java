package br.castro.spring02.model;

public abstract class Conta {
	private int numero;
	private double saldo;

	public Conta(int numero, double saldo) {
		super();
		this.numero = numero;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void mostrarDados() {
		System.out.println(numero + " - " + saldo);
	}

	public double sacar(double valor) {
		this.saldo -= valor;
		return saldo;
	}

	public double depositar(double valor) {
		this.saldo += valor;
		return saldo;
	}

	@Override
	public String toString() {
		return numero + " - " + saldo;
	}

}
