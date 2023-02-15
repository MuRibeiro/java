package aula_05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio_3_Lista_1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		Set<Integer> numeros = new HashSet<Integer>();
		
		int valor;
		
		for(int i = 0; i < 10; i ++) {
		
			System.out.println("Digite um valor:");
			valor = leia.nextInt();
			numeros.add(valor);
			
		}
		
		Iterator<Integer> iNumeros = numeros.iterator();
		
		System.out.println("Listar dados do set: ");
		while(iNumeros.hasNext()) 
			System.out.println(iNumeros.next());
			
		leia.close();
				
	}

}
