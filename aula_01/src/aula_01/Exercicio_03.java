package aula_01;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float salarioBruto, addNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.println("Informe o salario bruto:");
		salarioBruto = leia.nextFloat();
		System.out.println("Informe o adicional noturno:");
		addNoturno = leia.nextFloat();
		System.out.println("Informe quantidade de horas extras:");
		horasExtras = leia.nextFloat();
		System.out.println("Informe os descontos:");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + addNoturno + (horasExtras * 5) - descontos;
		
		System.out.printf("Salário liquído é: %.2f", salarioLiquido);
		
		leia.close();
		
	}

}
