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
		int numero;
		double saldo, limite;
		String texto;
		Conta c;

		while (menu != 7) {
			System.out.println("Para criar nova conta corrente: 1");
			System.out.println("Para criar nova conta especial: 2");
			System.out.println("Para consultar conta corrente: 3");
			System.out.println("Para consultar conta especial: 4");
			System.out.println("Para remover conta corrente: 5");
			System.out.println("Para remover conta especial: 6");
			System.out.println("Terminar a operação: 7");
			texto = teclado.nextLine();
			menu = Integer.parseInt(texto);

			switch (menu) {
			case 1:
				System.out.println("Digite o número da conta corrente:");
				texto = teclado.nextLine();
				numero = Integer.parseInt(texto);
				System.out.println("Digite o valor do saldo:");
				texto = teclado.nextLine();
				saldo = Integer.parseInt(texto);
				c = new ContaCorrente(numero, saldo);
				contas.adicionar(c);
				break;
			case 2:
				System.out.println("Digite o numero da conta especial:");
				texto = teclado.nextLine();
				numero = Integer.parseInt(texto);
				System.out.println("Digite o valor do saldo");
				saldo = teclado.nextDouble();
				c = new ContaEspecial(numero, saldo, limite);
				contas.adicionar(c);
				break;

			case 3:
				System.out.println("Digite o número da conta corrente para procurar:");
				texto = teclado.nextLine();
				numero = Integer.parseInt(texto);
				System.out.println(contas.exibir(numero));
				break;
			case 4:

				System.out.println("Digite o número da conta Especial para procurar:");
				texto = teclado.nextLine();
				numero = Integer.parseInt(texto);
				System.out.println(contas.exibir(numero));

				break;
			case 5:
				System.out.println("Digite o número da conta corrente a ser removido:");
				texto = teclado.nextLine();
				numero = Integer.parseInt(texto);
				boolean removeu = contas.remover(numero);
				if (removeu) {
					System.out.println("Conta removida com sucesso");
				} else {
					System.out.println(
							"NÃo foi possível remover a conta informada. Por favor, verifique o número e tente novamente!");
				}

				break;
			case 6:
				System.out.println("Digite o número da conta Especial a ser removido:");
				texto = teclado.nextLine();
				numero = Integer.parseInt(texto);
				boolean removeu = contas.remover(numero);
				if (removeu) {
					System.out.println("Conta removida com sucesso");
				} else {
					System.out.println(
							"NÃo foi possível remover a conta informada. Por favor, verifique o número e tente novamente!");
				}

				break;
			case 7:
				System.out.println("Fim da operação");
                break;
            default:
                System.out.println("Opçao invalida");
                break;
        }

				
				
				
				System.out.println("Fim do programa.");
				break;
			default:
				System.out.println("Opçao invalida");
				break;

			}

		}
}