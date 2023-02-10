package aula_03;

import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int num, soma = 0;
		
		do {
			System.out.println("Informe um número:");
			num = leitor.nextInt();
			
			if(num > 0)
				soma += num;
		
		} while (num != 0);
		
			System.out.println("A soma de todos os números é: " + soma);
		
		leitor.close();
	}

}
