package main.exercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			double valor;
			System.out.printf("Informe um número: ");
			try {
			  valor = sc.nextDouble();
			  System.out.printf("%s\n", extenso(valor));
			} catch (InputMismatchException e) {
			    System.out.println("Digite apenas números");
			}
		}
	  }

	  public static String extenso(double valor) {
	    if (valor == 0)
	       return("zero");

	    long inteiro = (long)Math.abs(valor); 
	    double resto = valor - inteiro;     

	    String valores = String.valueOf(inteiro);
	    if (valores.length() > 15)
	       return("Erro: número superior a 999 trilhões.");

	    String s = "", auxiliar, valorTotal;
	    String num = String.valueOf((int)Math.round(resto * 100));

	    String[] unidade = {"", "um", "dois", "três", "quatro", "cinco",
	             "seis", "sete", "oito", "nove", "dez", "onze",
	             "doze", "treze", "quatorze", "quinze", "dezesseis",
	             "dezessete", "dezoito", "dezenove"};
	    String[] centena = {"", "cento", "duzentos", "trezentos",
	             "quatrocentos", "quinhentos", "seiscentos",
	             "setecentos", "oitocentos", "novecentos"};
	    String[] dezena = {"", "", "vinte", "trinta", "quarenta", "cinquenta",
	             "sessenta", "setenta", "oitenta", "noventa"};
	    String[] qualificaS = {"", "mil", "milhão", "bilhão", "trilhão"};
	    String[] qualificaP = {"", "mil", "milhões", "bilhões", "trilhões"};

	    int n, unid, dez, cent, tam, i = 0;
	    boolean um = false, tem = false;
	    while (!valores.equals("0")) {
	      tam = valores.length();
	      if (tam > 3) {
	         valorTotal = valores.substring(tam-3, tam);
	         valores = valores.substring(0, tam-3);
	      }
	      else { 
	        valorTotal = valores;
	        valores = "0";
	      }
	      if (!valorTotal.equals("000")) {
	         auxiliar = "";
	         if (valorTotal.equals("100"))
	            auxiliar = "cem";
	         else {
	           n = Integer.parseInt(valorTotal, 10);
	           cent = n / 100;                
	           dez = (n % 100) / 10;           
	           unid = (n % 100) % 10;           
	           if (cent != 0)
	              auxiliar = centena[cent];
	           if ((n % 100) <= 19) {
	              if (auxiliar.length() != 0)
	                 auxiliar = auxiliar + " e " + unidade[n % 100];
	              else auxiliar = unidade[n % 100];
	           }
	           else {
	              if (auxiliar.length() != 0)
	                 auxiliar = auxiliar + " e " + dezena[dez];
	              else auxiliar = dezena[dez];
	              if (unid != 0) {
	                 if (auxiliar.length() != 0)
	                    auxiliar = auxiliar + " e " + unidade[unid];
	                 else auxiliar = unidade[unid];
	              }
	           }
	         }
	         if (valorTotal.equals("1") || valorTotal.equals("001")) {
	            if (i == 0) 
	               um = true;
	            else auxiliar = auxiliar + " " + qualificaS[i];
	         }
	         else if (i != 0)
	                 auxiliar = auxiliar + " " + qualificaP[i];
	         if (s.length() != 0)
	            s = auxiliar + ", " + s;
	         else s = auxiliar;
	      }
	      if (((i == 0) || (i == 1)) && s.length() != 0)
	         tem = true; 
	      i = i + 1; 
	    }

	    if (s.length() != 0) {
			if (um)
	          s = s + "";
	       else if (tem)
	               s = s + "";
	            else s = s + "";
	    }

	    if (!num.equals("0")) {
	       if (s.length() != 0) 
	          s = s + " e ";
	       if (num.equals("1"))
	          s = s + "um";
	       else {
	         n = Integer.parseInt(num, 10);
	         if (n <= 19)
	            s = s + unidade[n];
	         else {             
	           unid = n % 10;  
	           dez = n / 10;   
	           s = s + dezena[dez];
	           if (unid != 0)
	              s = s + " e " + unidade[unid];
	         }
	         s = s + " num";
	       }
	    }
	    return(s);
	    
	  }
}
