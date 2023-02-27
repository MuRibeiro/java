package aula_09;

import java.util.Scanner;

public class Calculadora {

	public static int calcular(OperacaoMatematica om, int num1, int num2) {
		return om.executar(num2, num2);
	}
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Digite o 1º numero:");
		num1 = leia.nextInt();
		
		System.out.println("Digite o 2º numero:");
		num2 = leia.nextInt();
		
		System.out.println("A somo dos dois numeros é igual a: " + calcular((a,b) -> a + b, num1, num2));
		
		leia.close();
		
		
	}

}
