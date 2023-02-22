package cadastroFarmacia;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaFarmacia {

	public static void main(String[] args) {
		
		ArrayList<Farmacia> medicamentos = new ArrayList<Farmacia>();
		
		Scanner leia = new Scanner(System.in);
		
		long id;
		String nome, nomeComercial, fabricante, foto, opcao;
		float preco;
		
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
		
		Farmacia f1 = new Farmacia(id, nome, nomeComercial, fabricante, foto, preco);
		medicamentos.add(f1);
		
		System.out.println("Deseja continuar?");
		leia.skip("\\R?");
		opcao = leia.nextLine();
		
		}while(opcao.equalsIgnoreCase("S"));
		
		for(var medicamento : medicamentos)
			medicamento.visualizar();
		
		//Farmacia f2 = new Farmacia(1, "Paracetamol", "Tylenol", "Neo Quimica", "--", 20.0f);
		
		//f1.visualizar();
		
		//f2.visualizar();
		
		leia.close();
		
	}

}
