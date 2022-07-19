package main.exercicio4;

public class Ingresso {

	public double ValorIngresso;

	public double getValorIngresso() {
		return this.ValorIngresso;
	}
	public void setValorIngresso(double valorIngresso) {
		this.ValorIngresso = valorIngresso;
	}

	public void imprimeValor(double valor) {
		valor = this.ValorIngresso;
		System.out.printf("Valor do Igresso:" + valor);
	}
}
