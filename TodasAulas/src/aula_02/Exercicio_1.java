package aula_02;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int A, B, C;
		
		System.out.println("Informe o 1° valor: ");
		A = leia.nextInt();
		
		System.out.println("Informe o 2° valor: ");
		B = leia.nextInt();
		
		System.out.println("Informe o 3° valor: ");
		C = leia.nextInt();
		
			if ((A + B) > C )
				System.out.println("A Soma A + B é maior que C");
			else if ((A + B) < C)
				System.out.println("A Soma A + B é menor que C");
			else 
				System.out.println("A Soma A + B é igual a C");
								
		leia.close();
	}

}
