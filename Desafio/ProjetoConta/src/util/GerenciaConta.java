package util;

import java.util.ArrayList;

import core.Conta;

public class GerenciaConta {

	private ArrayList<Conta> contas;

	public GerenciaConta() {
		contas = new ArrayList<>();
	}

	public void adicionar(Conta c) {
		contas.add(c);
	}

	public String exibir(int numero) {
		for (int i = 0; i < contas.size(); i++) {
			if (contas.get(i).getNumero() == numero) {
				return contas.get(i).toString();
			}
		}
		return "Não foi possível encontrar";
	}

	private int posicao(int numero) {
		for (int i = 0; i < contas.size(); i++) {
			if (contas.get(i).getNumero() == numero) {
				return i;
			}
		}
		return -1; // retorna -1 se nao achou
	}

	public boolean remover(int numero) {
		int posicao = posicao(numero);
		if (posicao >= 0) {
			if (contas.remove(posicao) != null) {
				return true;
			}
		}
		return false;
	}
	
	public boolean sacar(int numero, double valorASacar) {
        for (int i = 0; i < contas.size(); i++) {
                if (contas.get(i).getNumero() == numero) {
                        contas.get(i).sacar(valorASacar);
                        ;
                        return true;
                }
        }
        return false;
	}

	public boolean depositar(int numero, double valorADepositar) {
        for (int i = 0; i < contas.size(); i++) {
                if (contas.get(i).getNumero() == numero) {
                        contas.get(i).depositar(valorADepositar);
                        return true;
                }
        }
        return false;
}
}
