package br.castro.spring02.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "conta_corrente")
public class ContaCorrente extends Conta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numero;

	@Column(name = "saldo")
	private double saldo;

	public int getNumero() {
return numero;
	}
	
	public void setnumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public ContaCorrente() {
	}

	public ContaCorrente(int numero, double saldo) {
		super(numero, saldo);
	}

	@Override
	public double sacar(double valor) {

		if (valor > 0 && valor <= getSaldo()) {
			return super.sacar(valor);
		} else {
			System.out.println("Não é possível realizar a operação!");
		}
		return getSaldo();
	}

	@Override
	public double depositar(double valor) {
		if (valor > 0) {
			return super.depositar(valor);
		} else {
			return 0;
		}
	}
}
