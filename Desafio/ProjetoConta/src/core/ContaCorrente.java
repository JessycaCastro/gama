package core;

public class ContaCorrente extends Conta {

	public ContaCorrente(int numero, double saldo) {
		super(numero, saldo);
	}

	@Override
	public double sacar(double valor) {

		if (valor > 0 && valor <= getSaldo()) {
			return super.sacar(valor);
		} else {
			System.out.println("Não é possível realizar a operação!");
		} return getSaldo();
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


