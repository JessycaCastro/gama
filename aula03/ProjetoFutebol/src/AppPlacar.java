
public class AppPlacar {
	public static void main(String[] args) {
		Placar p1 = new Placar();
		Placar p2 = new Placar("Goi�s", "Atl�tico");
		Placar p3 = new Placar("Goi�s", "Atl�tico", 3, 1);

		p1.mostrarPlacar();
		p2.mostrarPlacar();
		p3.mostrarPlacar();
	}

}
