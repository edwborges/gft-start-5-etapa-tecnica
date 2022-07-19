package main.exercicio1;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] vetorNumeros = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

		String[] vetorRoamanos = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

			try {
				System.out.println("Digite um número para saber o Algarismo Romano: ");
				int numero = sc.nextInt();
				if (numero == 0)
					
				System.out.printf("%4d ", numero);
				int i = 0;
				while (numero > 0) {
					if (numero >= vetorNumeros[i]) {
						System.out.print(vetorRoamanos[i]);
						numero -= vetorNumeros[i];
					} else {
						i++;
					}
				}
				System.out.println();
			} catch(java.util.InputMismatchException e){
				System.out.println("Digite apenas números!");
			}
		
		sc.close();
	}
}
