package cadastroEmpresa;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario("Murilo", 121, 981330736, "Desenvolvedor Back-end", 4000.0f);
		
		Funcionario f2 = new Funcionario ("Davi", 122, 999707099, "Desenvolvedor Front-end", 3800.0f);
		
		f1.visualizar();
		
		f2.visualizar();
		
		Vendedor v1 = new Vendedor("Pedro", 123, 999999999, "Vendedor", 3500.0f, 8000.0f, 87000.0f);
		
		v1.visualizar();

		Gerente g1 = new Gerente("Pedro", 123, 999999999, "Gerente", 15000.0f, 2);
		
		g1.visualizar();
		
	}

}
