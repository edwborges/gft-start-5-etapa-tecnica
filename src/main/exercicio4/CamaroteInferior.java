package main.exercicio4;

public class CamaroteInferior extends VIP {

	private String LocalIngresso;
    
    public String getLocalIngresso(){
      return this.LocalIngresso;
    }
    public void setLocalIngresso(String local){
        this.LocalIngresso = local;
    }
   
    public String acessaLocalizacao(){
        return this.LocalIngresso;
    }
    public void imprimeLocalizacao(String local){
        local = this.LocalIngresso;
        System.out.println("Local:"+ local);
    }
}

