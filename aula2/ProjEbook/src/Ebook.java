
public class Ebook {
	private String titulo;
	private String autor;
	private int totalpag;
	private int pagatual;

	public Ebook(String titulo, String autor, int totalpag, int pagatual) {
		this.titulo = titulo;
		this.autor = autor;
		this.totalpag = totalpag;
		this.pagatual = pagatual;
	}

	public void mostrarDados() {
		System.out.println("o título do ebook é " + titulo + "e o autor é " + autor);
	}

	public int getTotalpag() {
		return totalpag;
	}

	public int getPagatual() {
		return pagatual;
	}

}
