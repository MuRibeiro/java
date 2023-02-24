package cadastroEmpresa;

public class Vendedor extends Funcionario{
	
	private float comissao;
	private float quantidadeVendasMes;
	
	public Vendedor(String nome, int matricula, int celular, String funcao, float salario, float comissao,
			float quantidadeVendasMes) {
		super(nome, matricula, celular, funcao, salario);
		this.comissao = comissao;
		this.quantidadeVendasMes = quantidadeVendasMes;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}

	public float getQuantidadeVendasMes() {
		return quantidadeVendasMes;
	}

	public void setQuantidadeVendasMes(float quantidadeVendasMes) {
		this.quantidadeVendasMes = quantidadeVendasMes;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("         - Quantidade de vendas no mês: R$" + this.quantidadeVendasMes);
		System.out.println("         - Comissão: R$" + this.comissao);
	}

}
