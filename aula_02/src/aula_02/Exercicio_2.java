package aula_02;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n1;
		
		System.out.println("Digite um número:");
		n1 = leia.nextInt();
		
		if ((n1 %2) == 0 && n1 > 0)
			System.out.println("O Número " + n1 + " é par e positivo!");
			
		else if ((n1 %2) == 0 && n1 < 0)
			System.out.println("O Número " + n1 + " é par e negativo!");
		
		else if ((n1 %2) != 0 && n1 > 0)
			System.out.println("O Número " + n1 + " é ímpar e positivo!");
		
		else if ((n1 %2) != 0 && n1 < 0)
			System.out.println("O Número " + n1 + " é ímpar e negativo!");
			
		leia.close();
		
	}

}
