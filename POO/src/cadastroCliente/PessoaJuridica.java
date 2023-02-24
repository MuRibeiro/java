package cadastroCliente;

public class PessoaJuridica extends Cliente{

	private String cnpj;
	private String nomeEmpresa;

	public PessoaJuridica(String nome, int idade, String sexo, int rg, String telefone, String cnpj, String nomeEmpresa) {
		super(nome, idade, sexo, rg, telefone);
		this.cnpj = cnpj;
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("CNPJ: " + this.cnpj);
		System.out.println("Nome da empresa: " + this.nomeEmpresa);
	}
	
}
