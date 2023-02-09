package aula_02;

import java.util.Scanner;

public class Exercicio_7 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float n1, n2;
		int codigo;

		System.out.println("Informe o 1º número:");
		n1 = leia.nextFloat();
		
		System.out.println("Informe o 2º número:");
		n2 = leia.nextFloat();
		
		System.out.println("Escolha a operação:\n");
		System.out.println("1-\tSoma");
		System.out.println("2-\tSubtração");
		System.out.println("3-\tMultiplicação");
		System.out.println("4-\tDivisão\n");
	
		System.out.println("Informe o código da operação (1 - 4):");
		codigo = leia.nextInt();
		
			switch (codigo) {
			
			case 1: 
				System.out.println("Resultado = " + n1 + " + " + n2 + " = " + (n1 + n2));
			break;
			
			case 2: 
				System.out.println("Resultado = " + n1 + " - " + n2 + " = " + (n1 - n2));
			break;
			
			case 3: 
				System.out.println("Resultado = " + n1 + " * " + n2 + " = " + (n1 * n2));
			break;
			
			case 4:
				System.out.println("Resultado = " + n1 + " / " + n2 + " = " + (n1 / n2));
			break;
			
			default: 
				System.out.println("Erro! - Opção inválida");
			}
		
		leia.close();
	}

}
