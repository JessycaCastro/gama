import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
		double nota1, nota2, media;
		System.out.println("Por favor, digite sua primeira nota");
		nota1 = teclado.nextDouble();
		System.out.println("Agora, digite a segunda");
		nota2 = teclado.nextDouble();
		media = (nota1 + nota2) / 2;
		System.out.println("Sua média foi: " + media);
	}

}
