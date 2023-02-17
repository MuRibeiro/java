package aula_05;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Murilo");
		fila.add("Vitória");
		fila.add("João");
		fila.add("Rebeca");
		fila.add("Rony");
		fila.add("Natanael");
		fila.add("Rafael\n");
		
		Iterator<String> iFila = fila.iterator();//grava a situação atual da fila
		
		while(iFila.hasNext()) {// percorre a lista e imprime todos os dados da mesma 
			System.out.println(iFila.next());
		}
		
		System.out.println("Retirar um elemento da fila:");
		
		System.out.println(fila.poll());
		
		System.out.println("Fila atualizada:\n");
		
		Iterator<String> iFila1 = fila.iterator(); // criação de um novo iterator para imprimir a fila
		
		while(iFila1.hasNext()) {// percorre a lista e imprime todos os dados da mesma 
			System.out.println(iFila1.next());
		}
				
		System.out.println("Fila atualizada:\n");
		
		for(var elemento : fila) { // forma pra imprimir a fila
			System.out.println(elemento);
		}
		
		System.out.println(fila.peek());// mostra o primeiro da fila
		
		System.out.println("Quantidade de pessoas: " + fila.size());// mostra o tamanho da fila(quantidade)
	}

}
