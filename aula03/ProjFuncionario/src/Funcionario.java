
public class Funcionario {
	private String nome;
	private int horasTrabalhadas;
	private double valorDaHoraTrabalhada;

	public Funcionario(String nome, int horasTrabalhadas, double valorDaHoraTrabalhada) {
		super();
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorDaHoraTrabalhada = valorDaHoraTrabalhada;
	}

	public String getNome() {
		return nome;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorDaHoraTrabalhada() {
		return valorDaHoraTrabalhada;
	}

	public void setValorDaHoraTrabalhada(double valorDaHoraTrabalhada) {
		this.valorDaHoraTrabalhada = valorDaHoraTrabalhada;
	}

	public double calcularSalario() {
		return valorDaHoraTrabalhada * horasTrabalhadas;
	}

	public String exibir() {
		return nome + "- " + valorDaHoraTrabalhada + " - " + horasTrabalhadas;
	}
}
