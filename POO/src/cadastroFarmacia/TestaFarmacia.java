package cadastroFarmacia;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaFarmacia {

	public static void main(String[] args) {
		
		ArrayList<Farmacia> medicamentos = new ArrayList<Farmacia>();
		
		Scanner leia = new Scanner(System.in);
		
		long id;
		String nome, nomeComercial, fabricante, foto, opcao, principioAtivo, fragancia;
		float preco;
		int tipo;
		
		do {
			
		System.out.println("Id: " );
		id = leia.nextLong();
		
		System.out.println("Nome: " );
		leia.skip("\\R?");
		nome = leia.nextLine();
		
		System.out.println("Nome Comercial: " );
		nomeComercial = leia.nextLine();
		
		System.out.println("Fabricante: " );
		fabricante = leia.nextLine();
		
		System.out.println("Foto: " );
		foto = leia.nextLine();
		
		System.out.println("Preço: " );
		preco = leia.nextFloat();
		
		System.out.println("Tipo: " );
		tipo = leia.nextInt();
		
		switch(tipo) {
		
			case 1 -> {
				System.out.println("Principio ativo: " );
				leia.skip("\\R?");
				principioAtivo = leia.nextLine();
				
				Medicamento m1 = new Medicamento(id, nome, nomeComercial, fabricante, foto, preco, tipo, principioAtivo);
				
				medicamentos.add(m1);
			}
			
			case 2 -> {
				System.out.println("Fragância: " );
				leia.skip("\\R?");
				fragancia = leia.nextLine();
				
				Perfumaria p1 = new Perfumaria(id, nome, nomeComercial, fabricante, foto, preco, tipo, fragancia);
				
				medicamentos.add(p1);
			}
		}
		
		System.out.println("Deseja continuar?");
		leia.skip("\\R?");
		opcao = leia.nextLine();
		
		}while(opcao.equalsIgnoreCase("S"));
		
		for(var medicamento : medicamentos) {
			medicamento.reajuste(0.010f);
			medicamento.visualizar();
		}
		
		leia.close();
		
	}

}
