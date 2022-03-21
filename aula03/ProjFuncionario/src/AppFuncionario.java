
public class AppFuncionario {
	public static void main(String[] args) {
		Funcionario f = new Funcionario("Joaquim", 30, 7);
		Senior s = new Senior("Odete", 140, 8, 0.50);

		f.exibir();
		f.calcularSalario();

		s.calcularSalario();
		s.exibir();
	}

}
