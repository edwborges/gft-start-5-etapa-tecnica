package main.exercicio4;

public class CamaroteSuperior extends VIP {

	private double TaxaAdicional;
	   
    public void setTaxaAdicional(double valor){
        this.TaxaAdicional = valor;
    }
    public double getTaxaAdicional(){
        return this.TaxaAdicional;
    }  
    public double valorIngressoAdd(double valor){
        valor = this.ValorAdicional;
        double valorAdd = (this.TaxaAdicional * this.ValorIngresso) * 4 + this.ValorIngresso;
    return valorAdd;
    }
}