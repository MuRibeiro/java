package aula_05;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_2_Lista_1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		int valor;
		
		for(int i = 0; i <10; i ++) {
			
			System.out.println("Digite um valor:");
			valor = leia.nextInt();
			numeros.add(valor);
			
		}
		
		System.out.println("Digite o número que deseja encontrar:");
		valor = leia.nextInt();
		
		if(numeros.contains(valor))
			System.out.println("O número " + valor + " está localizado na posição " + numeros.indexOf(valor));
		else 
			System.out.println("O número " + valor + " não foi encontrado!");
	
		leia.close();
		
	}

}
