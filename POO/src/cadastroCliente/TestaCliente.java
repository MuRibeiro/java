package cadastroCliente;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Murilo", 26, "Masculino", 12345678, "981330736");
		
		Cliente c2 = new Cliente("Juliana", 24, "Feminino", 12365478, "991007433");
		
		c1.visualizar();
		
		c2.visualizar();

		PessoaFisica pf1 = new PessoaFisica("Davi", 20, "Masculino", 12345678, "981330736", "43912347874");
	
		PessoaFisica pf2 = new PessoaFisica("Julia", 21, "Feminino", 12365478, "991007433", "46878461548");
		
		pf1.visualizar();
		
		pf2.visualizar();
		
		PessoaJuridica pj1 = new PessoaJuridica("Marcelo", 26, "Masculino", 12345678, "981330736", "12345678/0001-50", "Devs Company");

		PessoaJuridica pj2 = new PessoaJuridica("Marcela", 24, "Feminino", 12365478, "991007433", "12345678/0001-96", "Devs Suport");
	
		pj1.visualizar();
		
		pj2.visualizar();
	
	}

}
