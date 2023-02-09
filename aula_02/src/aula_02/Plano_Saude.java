package aula_02;

import java.util.Scanner;

public class Plano_Saude {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Informe sua idade:");
		idade = leia.nextInt();
		
			if (idade >= 0 && idade <= 10)
				System.out.println("Valor do plano igual a R$100,00");
			else if (idade > 10 && idade <= 29)
				System.out.println("Valor do plano igual a R$200,00 ");
			else if (idade > 29 && idade <= 45)
				System.out.println("Valor do plano igual a R$300,00 ");
			else if (idade > 45 && idade <= 59)
				System.out.println("Valor do plano igual a R$500,00 ");
			else if (idade > 59 && idade <= 65)
				System.out.println("Valor do plano igual a R$600,00 ");
			else if (idade > 65)
				System.out.println("Valor do plano igual a R$1000,00");
			else
				System.out.println("Idade Inválida");
		
		leia.close();
	}

}
