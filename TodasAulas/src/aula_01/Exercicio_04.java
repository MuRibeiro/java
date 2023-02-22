package Aula_01;

import java.util.Scanner;

public class Exercicio_04 {

		
	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		float num1, num2, num3, num4, diferenca;
		
		System.out.println("Informe o número 1:");
		num1 = leia.nextFloat();
		System.out.println("Informe o número 2:");
		num2 = leia.nextFloat();
		System.out.println("Informe o número 3:");
		num3 = leia.nextFloat();
		System.out.println("Informe o número 4:");
		num4 = leia.nextFloat();

		diferenca = (num1 * num2) - (num3 * num4);
		
		System.out.printf("Diferença é: %.0f", diferenca);
	
		leia.close();
	}

}
