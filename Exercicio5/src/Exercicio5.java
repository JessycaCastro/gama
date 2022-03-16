import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		System.out.println("Digite anúmeros té que o programa pare");
		numero = teclado.nextInt();
		teclado.close();
		while (numero != 0) {
			numero++;
			System.out.println(numero++);
		}
	}

}
