
public class Placar {
	private String timeA, timeB;
	private int golsA, golsB;

	public Placar() {
		this("time", "time");
	}

	public Placar(String timeA, String timeB) {
		this.timeA = timeA;
		this.timeB = timeB;
		golsA = 0;
		golsB = 0;
	}

	public Placar(String timeA, String timeB, int golsA, int golsB) {
		this.timeA = timeA;
		this.timeB = timeB;
		this.golsA = golsA;
		this.golsB = golsB;
	}

	public String mostrarPlacar() {
		return timeA + " x " + timeB + " " + golsA + " " + golsB;
	}

}
