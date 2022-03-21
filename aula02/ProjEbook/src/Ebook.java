
public class Ebook {
	private String titulo;
	private String autor;
	private int totalPag;
	private int pagAtual;

	public Ebook(String titulo, String autor, int totalPag, int pagAtual) {
		this.titulo = titulo;
		this.autor = autor;
		if (totalPag >= 0 && pagAtual <= totalPag) {
			this.totalPag = totalPag;
			this.pagAtual = pagAtual;

		}
	}

	public void mostrarDados() {
		System.out.println("o t�tulo do ebook � " + titulo + "e o autor � " + autor);
	}

	public int getTotalPag() {
		return totalPag;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void avancarPag() {
		pagAtual++;
	}

	public void voltarPag() {
		pagAtual--;
	}

}
