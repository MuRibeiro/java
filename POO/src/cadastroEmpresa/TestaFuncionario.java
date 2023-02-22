package cadastroEmpresa;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario("Murilo", 121, 981330736, "Desenvolvedor Back-end", "Integral");
		
		Funcionario f2 = new Funcionario ("Davi", 122, 999707099, "Desenvolvedor Front-end", "Noturno");
		
		f1.visualizar();
		
		f2.visualizar();

	}

}
