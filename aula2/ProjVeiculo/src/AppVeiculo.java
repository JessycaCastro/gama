
public class AppVeiculo {
	public static void main(String[] args) {
		Veiculo v1 = new Veiculo("chevrolet", "Cruze", 10);
		Veiculo v2 = new Veiculo("Chevrolet", "Celta", 12);

		v1.mostrar();
		System.out.println("Consumo = " + v1.getConsumo());

		v2.mostrar();
		System.out.println("Consumo = " + v2.getConsumo());

	}

}
