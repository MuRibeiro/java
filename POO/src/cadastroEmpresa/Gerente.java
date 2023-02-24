package cadastroEmpresa;

public class Gerente extends Funcionario{
	
	private int quantidadeEquipes;

	public Gerente(String nome, int matricula, int celular, String funcao, float salario, int quantidadeEquipes) {
		super(nome, matricula, celular, funcao, salario);
		this.quantidadeEquipes = quantidadeEquipes;
	}

	public int getQuantidadeEquipes() {
		return quantidadeEquipes;
	}

	public void setQuantidadeEquipes(int quantidadeEquipes) {
		this.quantidadeEquipes = quantidadeEquipes;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("         - Quantidade de equipes para comandar: " + this.quantidadeEquipes);
	}
}
