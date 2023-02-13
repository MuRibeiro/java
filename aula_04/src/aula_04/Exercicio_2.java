package aula_04;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int vetorInteiros[] = new int[10];
		int numero;
		float soma = 0, media;
		
		for (int contador = 0; contador < vetorInteiros.length; contador ++) {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			vetorInteiros[contador] = numero;
		}
		
		System.out.print("Elemento nos índices ímpares: ");
		
		for (int contador = 0; contador < vetorInteiros.length; contador ++) {
			if (contador %2 != 0) {
			System.out.print(vetorInteiros[contador] + " ");	
			}
		}
		
		System.out.print("\nElemento nos índices ímpares: ");
		for (int contador = 0; contador < vetorInteiros.length; contador ++) {
			if (vetorInteiros[contador] %2 == 0) {
				System.out.print(vetorInteiros[contador] + " ");
			}
		}
		
		for (int contador = 0; contador < vetorInteiros.length; contador ++) {
			soma = vetorInteiros[contador] + soma;
		}
		
		System.out.println("\nSoma: " + soma);
		
		media = soma / vetorInteiros.length;
		
		System.out.println("Média " + media);
		
		leia.close();
	}

}
