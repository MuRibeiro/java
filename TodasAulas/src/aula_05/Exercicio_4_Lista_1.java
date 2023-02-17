package aula_05;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio_4_Lista_1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		Set<Integer> numeros = new HashSet<Integer>();
		
		int valor, opcao = 0;
			
			for(int i = 0; i < 10; i ++) {
			
				System.out.println("Digite um valor:");
				valor = leia.nextInt();
				numeros.add(valor);
				
			}
			
		do {
			
			System.out.println("Digite o número que você deseja encontrar:");
			valor = leia.nextInt();
			
			if (numeros.contains(valor))
				System.out.println("O número " + valor + " foi encontrado!");
			else 
				System.out.println("O número " + valor + " não foi encontrado!");
		
			System.out.println("Deseja fazer uma nova pesquisa: (1 - Sim / 2 - Não");
			opcao = leia.nextInt();
			
		} while(opcao != 2);
		
		System.out.println("Programa finalizado!");
		System.exit(2);
			
		leia.close();
		
	}

}
