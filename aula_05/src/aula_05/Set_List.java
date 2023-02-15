package aula_05;

import java.util.HashSet;
import java.util.Set;

public class Set_List {

	public static void main(String[] args) {
		
		Set<Double> nota = new HashSet<Double>();/* não permite a repetição de dados. Porem guarda
		os dados de forma aleatória atraves de um calculo*/
		
		nota.add(7.0);
		nota.add(6.0);
		nota.add(2.0);
		nota.add(5.0);
		nota.add(7.0);
		nota.add(20.0);
		
		System.out.println("Listando todas as notas");
		nota.forEach(System.out::println);
		
		System.out.println("Removendo uma nota");
		nota.remove(20.0);
		
		nota.forEach(System.out::println);
		
		System.out.println("A nota 7 existe? " + nota.contains(7.0));

		for (var notas : nota)
			System.out.println(notas.hashCode());
	}

}
