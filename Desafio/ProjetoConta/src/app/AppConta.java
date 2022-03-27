package app;

import java.util.Scanner;

import core.Conta;
import core.ContaCorrente;
import core.ContaEspecial;
import util.GerenciaConta;

public class AppConta {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		GerenciaConta contas = new GerenciaConta();
		int menu = 0;
		int numero, tipo;
		double saldo, limite, valor;
		boolean removeu, alterou, validacao;
		Conta c;

		while (menu != 6) {
			System.out.println("Para criar nova conta: 1");
			System.out.println("Para consultar conta: 2");
			System.out.println("Para remover conta: 3");
			System.out.println("para sacar: 4");
			System.out.println("Para depositar: 5");
			System.out.println("Terminar a operação: 6");
			menu = teclado.nextInt();

			switch (menu) {
			case 1:
				System.out.println("Digite o número da conta");
				numero = teclado.nextInt();
				System.out.println("Digite o valor do saldo:");
				saldo = teclado.nextDouble();
				System.out.println("Digite 1 para conta corrente ou 2 para conta especial:");
				tipo = teclado.nextInt();
				if (tipo == 1) {
					c = new ContaCorrente(numero, saldo);
					contas.adicionar(c);
					System.out.println("Conta corrente criada com sucesso!");
				} else {
					System.out.println("Qual é o limite?");
					limite = teclado.nextDouble();
					c = new ContaEspecial(numero, saldo, limite);
					contas.adicionar(c);
					System.out.println("Conta Especial criada com sucesso!");
				}
				break;
			case 2:
				System.out.println("Digite o número da conta para procurar:");
				numero = teclado.nextInt();
				System.out.println(contas.exibir(numero));
				break;
			case 3:
				System.out.println("Digite o número da conta a ser removido:");
				numero = teclado.nextInt();
				removeu = contas.remover(numero);
				if (removeu) {
					System.out.println("Conta removida com sucesso");
				} else {
					System.out.println(
							"NÃo foi possível remover a conta informada. Por favor, verifique o número e tente novamente!");
				}
				break;
			case 4:
				System.out.println("Digite o numero da conta:");
				numero = teclado.nextInt();
				System.out.println("Digite o valor  para sacar:");
				valor = teclado.nextDouble();
				alterou = contas.sacar(numero, valor);
				if (alterou) {
					System.out.println("Saque realizado");
				} else {
					System.out.println("Não há saldo suficiente");
				}
				break;
			case 5:
				System.out.println("Digite o numero da conta:");
				numero = teclado.nextInt();
				System.out.println("Digite o valor  para Depositar:");
				valor = teclado.nextDouble();
				validacao = contas.depositar(numero, valor);
				if (validacao) {
					System.out.println("Deposito realizad");
				} else {
					System.out.println("Falha no deposito");
				}
				break;
			case 6:
				System.out.println("Fim da operação");
				break;
			default:
				System.out.println("Opçao invalida");
				break;
			}
			teclado.close();
		}
	}
}
