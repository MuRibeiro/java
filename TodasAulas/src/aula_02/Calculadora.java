package aula_02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###.##");
		
		double n1, n2;
		
		System.out.println("Digite o 1° número: ");
		n1 = leia.nextDouble();
		
		System.out.println("Digite o 2° número: ");
		n2 = leia.nextDouble();
		
		//Potência
		System.out.println("O numero " + n1 + " elevado ao numero " + n2 + 
				" é igual a " + Math.pow(n1, n2));
		
		//Raiz quadrada
		System.out.println("A raiz quadrada de " + n1 + " é igual a " + df.format(Math.sqrt(n1)));
		
		/*
		System.out.println("Pre Incremento: ");
		System.out.println(n1);
		System.out.println(++ n1);
		
		System.out.println("Pós Incremento: ");
		System.out.println(n2);
		System.out.println(n2 ++);
		System.out.println(n2);
		*/
		/*
		System.out.println("Pre Decremento: ");
		System.out.println(n1);
		System.out.println(-- n1);
		
		System.out.println("Pós Decremento: ");
		System.out.println(n2);
		System.out.println(n2 --);
		System.out.println(n2);
		*/
		
		System.out.println("A soma de n1 + n2 é igual a: " + (n1 += n2)); //n1 = n1 + n2
		System.out.println("Valor de n1 é: " + n1);
		
		leia.close();
	}

}
