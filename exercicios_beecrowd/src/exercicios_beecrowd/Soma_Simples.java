package exercicios_beecrowd;

import java.util.Scanner;

public class Soma_Simples {

	public static void main(String[] args) {
	
		/*
		 * Leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a 
		 * soma entre elas e atribua à variável SOMA. A seguir escrever o valor desta variável.
		 *
		*/
		
		Scanner leia = new Scanner(System.in);
		
		int A, B, soma;
		
		A = leia.nextInt();
		B = leia.nextInt();
		soma = A + B;
		
		System.out.println("SOMA = " + soma);
		
		leia.close();
		 		 
	}

}
