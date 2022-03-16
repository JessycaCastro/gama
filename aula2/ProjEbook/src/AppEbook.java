
public class AppEbook {
	public static void main(String[] args) {
		Ebook e1 = new Ebook("Dom Casmurro", "Machado de Assis", 400);

		e1.mostrarDados();
		System.out.println("o total de páginas é: " + e1.getTotalpag());

		System.out.println("A página atual é: " + e1.getPagatual());
	}

}
