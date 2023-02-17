package aula_02;

import java.util.Scanner;

public class Exercicio_8 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int codigo; 
		float deposito, saque, saldo = 1000.00f;
		
		System.out.println("BEM VINDO AO BANCO DEVELOPER\n");
		System.out.println("Operação:\n");
		System.out.println("1-\tSaldo");
		System.out.println("2-\tSaque");
		System.out.println("3-\tDepósito\n");
		
		System.out.println("Escolha a opção desejada:");
		codigo = leia.nextInt();
			
		
		switch (codigo) {
		
		case 1: 
			System.out.println("Saldo diponível: R$" + saldo);
		break;
		
		case 2:
			System.out.println("Informe o valor do saque:");
			saque = leia.nextFloat();
				if (saque > saldo) {
					System.out.println("Saldo insuficiente");
				} else {
					System.out.println("Saque liberado");
				}
			System.out.println("Saldo disponível: R$" + (saldo - saque));	
		break;
		
		case 3:
			System.out.println("Informe o valor do depósito:");
			deposito = leia.nextFloat();
			
			System.out.println("Valor do depósito: R$" + deposito);
			System.out.println("Depósito realizado com sucesso\n");
			System.out.println("Saldo disponível: R$" + (deposito + saldo));
		break;
		
		default:
			System.out.println("Opção inválida");
			
		}

		leia.close();
	}
	

}
