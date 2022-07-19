package main.exercicio2;

public class Raca {

	private double forca;
	private double destreza;
	private double constituicao;
	private double inteligencia;
	private double sabedoria;
	private double carisma;
	
	
	
	public Raca() {
	}

	public Raca(double forca, double destreza, double constituicao, double inteligencia, double sabedoria,
			double carisma) {
		super();
		this.forca = forca;
		this.destreza = destreza;
		this.constituicao = constituicao;
		this.inteligencia = inteligencia;
		this.sabedoria = sabedoria;
		this.carisma = carisma;
	}

	public double getForca() {
		return forca;
	}
	public void setForca(double forca) {
		this.forca = forca;
	}

	public double getDestreza() {
		return destreza;
	}
	public void setDestreza(double destreza) {
		this.destreza = destreza;
	}

	public double getConstituicao() {
		return constituicao;
	}
	public void setConstituicao(double constituicao) {
		this.constituicao = constituicao;
	}

	public double getInteligencia() {
		return inteligencia;
	}
	public void setInteligencia(double inteligencia) {
		this.inteligencia = inteligencia;
	}

	public double getSabedoria() {
		return sabedoria;
	}
	public void setSabedoria(double sabedoria) {
		this.sabedoria = sabedoria;
	}

	public double getCarisma() {
		return carisma;
	}
	public void setCarisma(double carisma) {
		this.carisma = carisma;
	}

	@Override
	public String toString() {
		return "forca: "
				+ forca 
				+ ", destreza: "
				+ destreza
				+ ", constituicao: "
				+ constituicao 
				+ ", inteligencia: "
				+ inteligencia 
				+ ", sabedoria: "
				+ sabedoria
				+ ", carisma: "
				+ carisma;
	}
	
	
}
