package aula_05;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();
		
		pilha.push("Murilo");//entrada de dado na pilha
		pilha.push("Vitória");
		pilha.push("João");
		pilha.push("Rebeca");
		pilha.push("Rony");
		pilha.push("Natanael");
		pilha.push("Rafael");
		
		for( var elemento : pilha)
			System.out.println(elemento);
		
		System.out.println("Remover 1 elemento da pilha:");
		
		pilha.pop();// remove o ultimo dado que entrou na pilha
		
		for( var elemento : pilha)
			System.out.println(elemento);
		
		System.out.println("Topo da pilha: " + pilha.peek());
		
		System.out.println(pilha.size());
		

	}

}
