package aula_02;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
		boolean resposta;
		
		System.out.println("Informe seu nome:");
		nome = leia.nextLine();
		
		System.out.println("Informe sua idade:");
		idade = leia.nextInt();
		
		System.out.println("Primeira doação?");
		resposta = leia.nextBoolean();

			if (idade >= 18 && idade <= 59)
				System.out.println(nome + " está apta para doar sangue!");
			else if ((idade >= 60 && idade <= 69) &&  (!resposta))
				System.out.println(nome + " está apta para doar sangue!");
			else 
				System.out.println(nome + " não está apto para doar sangue!");
			
			leia.close();
	}

}
