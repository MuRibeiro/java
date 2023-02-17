package aula_02;

import java.util.Scanner;

public class Plano_Saude_Versao2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int faixa;
		
		System.out.println("Faixas Etárias:\n");
		System.out.println("1-\tAté 10 anos");
		System.out.println("2-\tDe 10 até 29 anos");
		System.out.println("3-\tDe 29 até 45 anos");
		System.out.println("4-\tDe 45 até 59 anos");
		System.out.println("5-\tDe 59 até 65 anos");
		System.out.println("6-\tMaior que 65 anos\n\n");
		
		System.out.println("Informe sua faixa etaria:");
		faixa = leia.nextInt();
		
		switch(faixa) {
		
		case 1:
			System.out.println("Valor do plano igual a R$100,00");		
			break;
			
		case 2:
			System.out.println("Valor do plano igual a R$200,00");
			break;
			
		case 3:
			System.out.println("Valor do plano igual a R$300,00");
			break;
			
		case 4:
			System.out.println("Valor do plano igual a R$500,00");
			break;
			
		case 5:
			System.out.println("Valor do plano igual a R$600,00");
			break;
			
		case 6:
			System.out.println("Valor do plano igual a R$1000,00");
			break;
			
		default:
			System.out.println("Faixa etaria inválida");
		}

		leia.close();
	}

}
