	import java.util.Scanner;
	
	public class Credito {
		public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			double salario, prestacao, percentual;
			System.out.println("Qual � o seu sal�rio bruto?");
		salario = teclado.nextDouble();
		System.out.println("Qual � o valor da presta��o?");
		prestacao = teclado.nextDouble();
		percentual = salario * 30 / 100;
		System.out.println("A presta��o deve ter valor m�ximo de " + percentual);
		if (prestacao <= percentual) {
			System.out.println("Parab�ns! Seu cr�dito foi aprovado.");
		} else {
			System.out.println("Cr�dito n�o aprovado");
			}
		}
	
	}
