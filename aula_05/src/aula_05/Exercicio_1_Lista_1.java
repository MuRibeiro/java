package aula_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio_1_Lista_1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
				
		ArrayList<String> cores = new ArrayList<String>();
		
		String nomeCor;
		
		for(int i = 0; i < 5; i ++) {
			
			System.out.println("Informe uma cor:");
			nomeCor = leia.nextLine();
			cores.add(nomeCor);		
			
		}
		
		System.out.println("Lista de todas as cores:");
		cores.forEach(System.out::println);
		
		Collections.sort(cores);
		
		System.out.println("Lista de cores ordenadas:");
		cores.forEach(System.out::println);
		
		System.out.println("Quantidade de cores informada: " + cores.size());
		
		leia.close();
		
	}

}
