package aula_03;

import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);

		float numero, soma = 0, contador = 0, media;
		
		do {
			
			System.out.println("Informe um número:");
			numero = leitor.nextInt();
			
			if (numero > 0 && numero %3 == 0) {
				contador++;
				soma += numero;
			}
			
		} while(numero != 0);
		
		media = soma / contador;
		
		System.out.println("A média de todos os números múltiplos de 3 é: " + media);
		
		leitor.close();
	}

}
