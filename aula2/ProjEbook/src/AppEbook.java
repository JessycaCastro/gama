
public class AppEbook {
	public static void main(String[] args) {
		Ebook e1 = new Ebook("Dom Casmurro", "Machado de Assis", 400);

		e1.mostrarDados();
		System.out.println("o total de p�ginas �: " + e1.getTotalpag());

		System.out.println("A p�gina atual �: " + e1.getPagatual());
	}

}
