package aula_02;

import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		 int codItem, quantidade;
		
		System.out.println("Produto:\n");
		System.out.println("1-\tCachorro Quente\tR$10,00");
		System.out.println("2-\tX-Salada\tR$15,00");
		System.out.println("3-\tX-Bacon\t\tR$18,00");
		System.out.println("4-\tBauru\t\tR$12,00");
		System.out.println("5-\tRefrigerante\tR$8,00");
		System.out.println("6-\tSuco de laranja\tR$13,00\n\n");
		
		System.out.println("Informe o código do produto:");
		codItem = leia.nextInt();
			
		
			switch (codItem) {
			
			case 1: 
				System.out.println("Informe a quantidade:");
				quantidade = leia.nextInt();
				System.out.println(quantidade + " Cachorro Quente");
				System.out.printf("Valor do pedido é igual: R$" + (quantidade * 10.00));
					
				break;
				
			case 2: 
				System.out.println("Informe a quantidade:");
				quantidade = leia.nextInt();
				System.out.println(quantidade + " X-Salada");
				System.out.printf("Valor do pedido é igual: R$" + (quantidade * 15.00));
					
				break;
			
			case 3:
				System.out.println("Informe a quantidade:");
				quantidade = leia.nextInt();
				System.out.println(quantidade + " X-Bacon");
				System.out.printf("Valor do pedido é igual: R$" + (quantidade * 18.00));
					
				break;
			
			case 4: 
				System.out.println("Informe a quantidade:");
				quantidade = leia.nextInt();
				System.out.println(quantidade + " Bauru");
				System.out.printf("Valor do pedido é igual: R$" + (quantidade * 12.00));
					
				break;
				
			case 5: 
				System.out.println("Informe a quantidade:");
				quantidade = leia.nextInt();
				System.out.println(quantidade + " Refrigerante");
				System.out.printf("Valor do pedido é igual: R$" + (quantidade * 8.00));
					
				break;
				
			case 6: 
				System.out.println("Informe a quantidade:");
				quantidade = leia.nextInt();
				System.out.println(quantidade + " Suco de Laranja");
				System.out.printf("Valor do pedido é igual: R$" + (quantidade * 13.00));
					
				break;
				
				
			default:
				System.out.println("Código inválido");
				
			}
		
		leia.close();
	}

}
