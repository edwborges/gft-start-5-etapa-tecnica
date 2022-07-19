package main.exercicio4;

public class VIP extends Ingresso {
	
	protected double ValorAdicional;

	public double getValorAdicional() {
		return this.ValorAdicional;
	}

	public void setValorAdicional(double valorAdicional) {
		this.ValorAdicional = valorAdicional;
	}

	public double valorIngressoVip(double valoringresso) {
		this.ValorIngresso = valoringresso;
		return this.ValorIngresso + (this.ValorAdicional * this.ValorIngresso);
	}
}