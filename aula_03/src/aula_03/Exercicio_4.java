package aula_03;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int idade = 0, sexo = 0, categoria = 0, backend = 0, frontend = 0, mobile = 0, full = 0;
		String continua = "S";
		
		while(continua.equalsIgnoreCase("S")) {
			
			System.out.println("Informe a idade: ");
			idade = leitor.nextInt();
					
			System.out.println("Informe a sexo: ");
			sexo = leitor.nextInt();
			
			System.out.println("Informe a categoria: ");
			categoria = leitor.nextInt();
			
			if (categoria == 1) {
				backend++;
			} else if (sexo == 2 && categoria == 2){
				frontend++;
			} else if (categoria == 3 && sexo == 1 && idade > 40) {
				mobile++;
			} else if (categoria == 4 && sexo == 2 && idade < 30) {
				full++;
			}
			
			System.out.println("Deseja continua? (S/N)");
			leitor.skip("\\R?");
			continua = leitor.nextLine();
		}
		
		System.out.println("Total de pessoas desenvolvedoras Backend: " + backend);
		System.out.println("Total de mulheres desenvolvedoras Frontend: " + frontend);
		System.out.println("Total de homens desenvolvedores Mobile maiores de 40 anos: " + mobile);
		System.out.println("Total de mulheres desenvolvedoras Fullstack menores de 30 anos: " + full);
		
		leitor.close();
	}

}
