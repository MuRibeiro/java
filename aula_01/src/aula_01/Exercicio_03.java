package aula_01;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		float salarioBruto, addNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.println("Informe o salario bruto:");
		salarioBruto = leitor.nextFloat();
		System.out.println("Informe o adicional noturno:");
		addNoturno = leitor.nextFloat();
		System.out.println("Informe quantidade de horas extras:");
		horasExtras = leitor.nextFloat();
		System.out.println("Informe os descontos:");
		descontos = leitor.nextFloat();
		
		salarioLiquido = salarioBruto + addNoturno + (horasExtras * 5) - descontos;
		
		System.out.printf("Salário liquído é: %.2f", salarioLiquido);
		

	}

}
