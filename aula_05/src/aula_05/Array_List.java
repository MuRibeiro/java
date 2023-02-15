package aula_05;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_List {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList <Double> notas = new ArrayList<Double>();
		
		
		int opcao = 0;
		double nota = 0.0;
		
		do {
			
			System.out.println("MENU:\n");
			System.out.println("1 - Cadastrar nota");
			System.out.println("2 - Listar nota");
			System.out.println("3 - Buscar uma nota");
			System.out.println("4 - Apagar uma nota");
			System.out.println("5 - Atualizar uma nota");
			System.out.println("6 - Sair\n");
			System.out.println("Digite a opção desejada:");
			opcao = leia.nextInt();
		
			switch(opcao) {
				
			case 1:
				System.out.println("Digite uma nota entre 1 e 10");
				nota = leia.nextDouble();
				if (nota < 0 || nota > 10)
					System.out.println("Nota inválida");
				else
					notas.add(nota);
				break;
				
			case 2:
				System.out.println("Lista de todas as notas:");
				if (notas.isEmpty())
					System.out.println("Base de dados vazia!");
				else
				/*//imprime todas as notas. Cria uma nova variavel dentro do for.
				for(var listaNota : notas)
				System.out.println(listaNota);	*/
					notas.forEach(System.out::println);//mostrar todas as notas 
				
				break;
				
			case 3: 
				System.out.println("Procurar uma nota");
				System.out.println("Digite a nota");
				nota = leia.nextDouble();
				//verifica se existe esse dado cadastrado
				System.out.println("A nota " + nota + " existe? " + notas.contains(nota));
				
				if(notas.contains(nota))
					//verifica a posição do dado. Porem o ArrayList permite duplicar dado e exibe a primeira. 
					System.out.println("O índice da minha nota é: " + notas.indexOf(nota));
				break;
				
			case 4:
				System.out.println("Digite a nota");
				nota = leia.nextDouble();
				//notas.remove(nota); //Nota
				notas.remove(notas.indexOf(nota)); //procura o indice da nota
				break;
				
			case 5:
				System.out.println("Atualizar uma nota");
				System.out.println("Digite a nota atual: ");
				nota = leia.nextDouble();
				System.out.println("Digite a nota");
				double notaNova = leia.nextDouble();
				notas.set(notas.indexOf(nota), notaNova); //Fazer update da nota
				break;
				
			default:
				if(opcao > 6)
					System.out.println("Opção Inválida");
			}
			
			
			
		}while(opcao != 6);
		
		
		/*notas.add(9.0);
		notas.add(8.0);
		notas.add(7.0);
		
		
		for(var nota : notas) {
			System.out.println(nota);
		}*/

		leia.close();
	}

}
