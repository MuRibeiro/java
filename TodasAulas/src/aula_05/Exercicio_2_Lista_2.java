package aula_05;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio_2_Lista_2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Stack<String> pilha = new Stack<String>();
		
		int opcao = 0;
		String nomeLivro;
		do {
			
			System.out.println("CONTROLE DE LIVROS\n");
			System.out.println("1 - Adicionar um novo livro");
			System.out.println("2 - Listar todos os livros ");
			System.out.println("3 - Retirar um livro");
			System.out.println("0 - Finalizar\n");
			System.out.println("Informe a opção desejada:");
			opcao = leia.nextInt();
			
			switch(opcao) {
			
			case 1: 
				System.out.println("Adicionar livro:");
				leia.skip("\\R?");
				nomeLivro = leia.nextLine();
				pilha.push(nomeLivro);
				System.out.println("Livro adicionado!");
				break;
				
			case 2: 
				System.out.println("Lista de todos os livros:");
				if (pilha.empty())
					System.out.println("Lista vazia!");
				else
					pilha.forEach(System.out::println);
					System.out.println("Quantidade de livros: " + pilha.size());
				break;
				
			case 3:
				System.out.println("Retirar livro:");
				if (pilha.empty()) 
					System.out.println("A pilha está vazia!");
				else  
					pilha.pop();
					pilha.forEach(System.out::println);
					System.out.println("Um livro foi retirado");
					System.out.println("Quantidade de livros: " + pilha.size());
				
				break;
				
			default:
				if (opcao < 0 || opcao > 0)
				System.out.println("Opção inválida!");
			}
			
		}while(opcao != 0);
		
		System.out.println("Programa finalizado!");
		
		leia.close();
		
	}

}
