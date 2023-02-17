package aula_03;

import java.util.Scanner;

public class Tabuada_versao2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		boolean ok = false;
		char continua = 's';
		
		do {
			do {

				System.out.println("Informe a tabuada desejada:");
				numero = leia.nextInt();

				if (numero < 1 || numero > 10)
					System.out.println("Informe um número entre 1 e 10");
				else
					ok = true;

			} while (ok == false);
			
			int contador = 1;
			
			while (contador <= 10) {
				System.out.println("\n" + numero + " x " + contador + " = " + (numero * contador));
				contador++;
			}
			
			ok = false;
			
			System.out.println("Deseja continuar?");
			continua = leia.next().charAt(0);

		} while (continua == 'S' || continua == 's');
		
		leia.close();

	}

}
