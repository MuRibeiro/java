package aula_04;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int vetorInteiros[] = {2,5,1,3,4,9,7,8,10,6};
		int numero;
		
		System.out.println("Digite o número que você deseja encontrar:");
		numero = leia.nextInt();
		
		for ( int indice = 0; indice < vetorInteiros.length; indice ++) {
			
			if (vetorInteiros[indice] == numero)
				System.out.println("O número " + numero + " está localizado na posição " + indice);
			else if (indice == vetorInteiros.length - 1)
				if (vetorInteiros[indice] != numero)
				System.out.println("O número " + numero + " não foi encontrado");
		}
				
		leia.close();
	}

}
