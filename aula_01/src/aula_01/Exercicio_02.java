package aula_01;

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
	
	Scanner leitor = new Scanner(System.in);
	
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		float mediaFinal;
		
		System.out.println("Informe a nota 1:");
		nota1 = leitor.nextFloat();
		System.out.println("Informe a nota 2:");
		nota2 = leitor.nextFloat();
		System.out.println("Informe a nota 3:");
		nota3 = leitor.nextFloat();
		System.out.println("Informe a nota 4:");
		nota4 = leitor.nextFloat();

		mediaFinal = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.printf("Média final: %.1f", mediaFinal);
	}

}
