package core;

public class ContaEspecial extends Conta {
	private double limite;

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


