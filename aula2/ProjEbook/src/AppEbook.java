
public class AppEbook {
	public static void main(String[] args) {
		Ebook e1 = new Ebook("Dom Casmurro", "Machado de Assis", 400, 1);

		e1.mostrarDados();
		System.out.println("o total de p�ginas �: " + e1.getTotalPag());

		System.out.println("A p�gina atual �: " + e1.getPagAtual());

		e1.avancarPag();
		e1.voltarPag();

	}
}
