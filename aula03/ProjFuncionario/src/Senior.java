
public class Senior extends Funcionario {
	private double bonus;

	public Senior(String nome, int horasTrabalhadas, double valorDaHoraTrabalhada, double bonus) {
		super(nome, horasTrabalhadas, valorDaHoraTrabalhada);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public double calcularSalario() {
		return super.calcularSalario() + bonus * getHorasTrabalhadas() / 10;
	}

	@Override
	public String exibir() {
		return super.exibir() + " - " + bonus;
	}

}
