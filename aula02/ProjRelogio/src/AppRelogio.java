
public class AppRelogio {
	public static void main(String[] args) {
		Relogio relogio1 = new Relogio(2, 12, 30);

		relogio1.setHora(4);
		relogio1.setMinuto(90);
		System.out.println(relogio1.getHoraAtual());
	}

}
