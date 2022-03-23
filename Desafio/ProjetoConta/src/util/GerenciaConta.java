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
		return "N�o foi poss�vel encontrar";
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
}
