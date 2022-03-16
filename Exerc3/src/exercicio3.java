import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, contador;
		System.out.println("Por favor digite um número");
		numero = teclado.nextInt();
		contador = 0;
		while (contador < numero) {
			contador++;
			System.out.println(contador);

		}
	}

}
