
public class Ebook {
	private String titulo;
	private String autor;
	private int totalPag;
	private int pagAtual;

	public Ebook(String titulo, String autor, int totalPag, int pagAtual) {
		this.titulo = titulo;
		this.autor = autor;
		if (totalPag >= 0 && totalPag <= totalPag) {
			this.totalPag = totalPag;
			this.pagAtual = pagAtual;

		}
	}

	public void mostrarDados() {
		System.out.println("o título do ebook é " + titulo + "e o autor é " + autor);
	}

	public int getTotalPag() {
		return totalPag;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void avancarPag() {
		pagAtual++;
		System.out.println("A próxima página é: " + pagAtual);
	}

	public void voltarPag() {
		pagAtual--;
		System.out.println("a página anterior é: " + pagAtual);
	}

}
