package aula_03;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n1, n2;
		
		System.out.println("Informe o 1º número do intervalo:");
		n1 = leia.nextInt();
		
		System.out.println("Informe o 2º número do intervalo:");
		n2 = leia.nextInt();
		
		if (n1 > n2)
			System.out.println("Intervalo inválido!");
		
		for(n1 = n1; n1 <= n2; n1++) {
			
			if (n1 %3 == 0 && n1 %5 == 0)
				System.out.println(n1 + " é múltiplo de 3 e 5 ");
		}
		
		leia.close();
		
	}

}
