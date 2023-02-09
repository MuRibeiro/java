package aula_02;

import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int codigo;
		float salario;
		
		System.out.println("Cargo:\n");
		System.out.println("1-\tGerente");
		System.out.println("2-\tVendedor");
		System.out.println("3-\tSupervisor");
		System.out.println("4-\tMotorista");
		System.out.println("5-\tEstoquista");
		System.out.println("6-\tTécnico de TI\n\n");
		
		System.out.println("Informe o código do seu cargo (1 - 6):");
		codigo = leia.nextInt();
		
		System.out.println("Informe seu nome: ");
		leia.skip("\\R?");
		nome = leia.nextLine();
				
		System.out.println("Informe seu salário: ");
		salario = leia.nextFloat();
		
			switch (codigo) {
			
			case 1: 
				System.out.println("Colaborador: " + nome);
				System.out.println("Cargo: Gerente");
				System.out.println("Salário reajustado: R$" + (salario + (salario*10)/100));
				
				break;
				
			case 2:
				System.out.println("Colaborador: " + nome);
				System.out.println("Cargo: Vendedor");
				System.out.println("Salário reajustado: R$" + (salario + (salario*7)/100));
				
				break;
				
			case 3:
				System.out.println("Colaborador: " + nome);
				System.out.println("Cargo: Supervisor");
				System.out.println("Salário reajustado: R$" + (salario + (salario*9)/100));
				
				break;
				
			case 4:
				System.out.println("Colaborador: " + nome);
				System.out.println("Cargo: Motorista");
				System.out.println("Salário reajustado: R$" + (salario + (salario*6)/100));
				
				break;
				
			case 5:
				System.out.println("Colaborador: " + nome);
				System.out.println("Cargo: Estoquista");
				System.out.println("Salário reajustado: R$" + (salario + (salario*5)/100));
				
				break;
				
			case 6:
				System.out.println("Colaborador: " + nome);
				System.out.println("Cargo: Técnico de TI");
				System.out.println("Salário reajustado: R$" + (salario + (salario*8)/100));
				
				break;
			}
			
		leia.close();
		
	}

}
