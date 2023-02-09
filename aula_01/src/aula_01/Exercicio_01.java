package aula_01;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
	
	Scanner leitor = new Scanner(System.in);
		
		float salario, abono, novoSalario;
		String nome;
		
		System.out.println("Informe o nome do funcionário:");
		nome = leitor.nextLine();
		
		System.out.println("Informe o salário do funcionário:");
		salario = leitor.nextFloat();
		
		System.out.println("Informe o abono:");
		abono = leitor.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.printf("Novo salário do funcionário " + nome + " é: R$%.2f ", novoSalario );
	
		leitor.close();
	}

}
