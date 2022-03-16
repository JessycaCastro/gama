	import java.util.Scanner;
	
	public class Credito {
		public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			double salario, prestacao, percentual;
			System.out.println("Qual é o seu salário bruto?");
		salario = teclado.nextDouble();
		System.out.println("Qual é o valor da prestação?");
		prestacao = teclado.nextDouble();
		percentual = salario * 30 / 100;
		System.out.println("A prestação deve ter valor máximo de " + percentual);
		if (prestacao <= percentual) {
			System.out.println("Parabéns! Seu crédito foi aprovado.");
		} else {
			System.out.println("Crédito não aprovado");
			}
		}
	
	}
