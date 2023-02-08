package aula_01;

import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
	
	Scanner leitor = new Scanner(System.in);
	
		float num1, num2, num3, num4, diferenca;
		
		System.out.println("Informe o número 1:");
		num1 = leitor.nextFloat();
		System.out.println("Informe o número 2:");
		num2 = leitor.nextFloat();
		System.out.println("Informe o número 3:");
		num3 = leitor.nextFloat();
		System.out.println("Informe o número 4:");
		num4 = leitor.nextFloat();

		diferenca = (num1 * num2) - (num3 * num4);
		
		System.out.printf("Diferença é: %.0f", diferenca);
	}

}
