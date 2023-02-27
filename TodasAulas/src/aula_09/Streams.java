package aula_09;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

		List<Integer> numerosDesordenados = Arrays.asList(6,7,8,1,4,5,9,10,2,3);

		List<String> estados = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais","Espirito Santo", 
		"São Paulo", "Rio de Janeiro", "Minas Gerais", "São Paulo", "Rio de Janeiro");
		
		List<String> estados2 = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais", 
				"Espirito Santo", "Rio Grande do Sul", "Santa Catarina", "Paraná");


		System.out.println("\nExemplo - Método Map");
		
		List<Integer> numerosAoCubo = numeros.stream()
		        .map(x -> x*x*x)
		        .collect(Collectors.toList());
		
		System.out.println("\nNumeros elevados ao Cubo: " + numerosAoCubo);
		
		List<Integer> numerosPares = numeros.stream()
		        .filter(x -> x%2 == 0)
		        .collect(Collectors.toList());
		
		System.out.println("\nNumeros pares: " + numerosPares);
		
		List<Integer> numerosOrdenados = numerosDesordenados.stream()
		        .sorted()
		        .collect(Collectors.toList());
		
		System.out.println("\nNumeros em ordem crescente: " + numerosOrdenados);
		
		List<Integer> numerosOrdenadosDesc = numerosDesordenados.stream()
		        .sorted(Comparator.reverseOrder())
		        .collect(Collectors.toList());
		
		System.out.println("\nNumeros em ordem decrescente: " + numerosOrdenadosDesc);
		
		List<String> estadoNaoDuplicados = estados.stream()
		        .distinct()
		        .collect(Collectors.toList());
		
		System.out.println("\nEstados sem repetições: " + estadoNaoDuplicados);
		
		long estadosComLetraR = estados2.stream()
		        .filter(x -> x.toString().startsWith("R"))
		        .count();
		
		System.out.println("\nQuantos estados com a letra R: " + estadosComLetraR);
		
		List<String> estadosIniciamLetraR = estados2.stream()
		        .filter(x -> x.toString().startsWith("R"))
		        .collect(Collectors.toList());
		
		System.out.println("\nEstados com a letra R: " + estadosIniciamLetraR);
		
	}

}
