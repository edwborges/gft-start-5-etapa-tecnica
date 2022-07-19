package main.exercicio4;

public class Program {

	public static void main(String[] args) {

		Ingresso ingresso = new Ingresso();
        Normal normal = new Normal();
        CamaroteInferior camaroteinferior = new CamaroteInferior();
        CamaroteSuperior camarotesuperior = new CamaroteSuperior();
        
        VIP vip = new VIP();
        
        ingresso.setValorIngresso(50.00);
        
        normal.setValorIngresso(50);
        normal.imprimeingressoNormal(normal.getValorIngresso());
        
        vip.setValorAdicional(1);
        camarotesuperior.setTaxaAdicional(0.5);
        camaroteinferior.setLocalIngresso("Ultimo andar");
        
        System.out.println();
        
        System.out.println("Ingresso Vip:" 
        + vip.valorIngressoVip(ingresso.getValorIngresso()));
        
        System.out.println();
        
        System.out.println("Ingresso Vip Camarote Inferior:" 
        + vip.valorIngressoVip(ingresso.getValorIngresso() * 150 / 100));
        
        camaroteinferior.imprimeLocalizacao(camaroteinferior.getLocalIngresso());
        camarotesuperior.setValorAdicional(0.30);
        camarotesuperior.setValorIngresso(70);
        
        System.out.println();
        
        System.out.println("Ingresso Vip Camarote Superior:" 
        + camarotesuperior.valorIngressoAdd(vip.getValorAdicional()));
		
	}

}
