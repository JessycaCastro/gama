package br.castro.spring02.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "conta_especial")
public class ContaEspecial extends Conta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numero;

	@Column(name = "saldo")
	private double saldo;

	@Column(name = "limite")
	private double limite;

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

	public double getLimite() {
		return limite;
	}

public void setLimite(double limite) {
	this.limite = limite;
}

	public ContaEspecial() {
	}

	public ContaEspecial(int numero, double saldo, double limite) {
		super(numero, saldo);
		this.limite = limite;
	}

	@Override
	public double sacar(double valor) {
		double disponivel = limite + getSaldo();
		if (valor > 0 && valor <= disponivel) {
			return super.sacar(valor);
		} else {
			return getSaldo();
		}
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
