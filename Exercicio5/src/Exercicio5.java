import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int soma, numero;
		soma = 0;
				numero = 1;
		while (numero != 0) {
			System.out.println("Por favor, digite um número!");
			numero = teclado.nextInt();
			soma = soma + numero;
		}
			System.out.println("A soma de todos os números digitados é: " + soma);
			teclado.close();
		}
}


