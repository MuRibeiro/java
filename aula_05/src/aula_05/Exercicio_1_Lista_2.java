package aula_05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio_1_Lista_2 {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);
		
		int opcao = 0;
		String nome;
		
		
		do {
			
			System.out.println("**************FILA DO BANCO********************");
			System.out.println("                                               ");
			System.out.println("        1 - Adicionar novo cliente na fila     ");
			System.out.println("        2 - Listar todos os clientes da fila   ");
			System.out.println("        3 - Chamar um cliente da fila          ");
			System.out.println("        0 - Finalizar fila                     ");
			System.out.println("                                               ");
			System.out.println("Digite a opção desejada:                       ");
			opcao = leia.nextInt();
			
			if (opcao == 0) {
				System.out.println("Programa finalizado!");
				System.exit(0);
			}
			
			switch(opcao) {
			
			case 1:
				System.out.println("Informe o nome do cliente:");
				nome = leia.next();
				fila.add(nome);
				System.out.println("Cliente foi adicionado!");
				break;
				
			case 2: 
				System.out.println("Lista da fila:");
				if (fila.isEmpty())
					System.out.println("Lista vazia");
				else
					System.out.println("Quantidade de pessoas: " + fila.size());
					fila.forEach(System.out::println);
				break;
				
			case 3: 
				System.out.println("Próximo cliente!");
				System.out.println("Cliente " + fila.poll() + " compareça ao guichê!");
				System.out.println("Próximos clientes:1");
				fila.forEach(System.out::println);
				System.out.println("O cliente foi chamado!");
				break;
				
			default:
				System.out.println("Informação Inválida!");
			}
			
		}while(opcao != 0);

		leia.close();
	}

}
