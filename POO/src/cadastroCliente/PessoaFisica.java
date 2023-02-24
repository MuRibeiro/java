package cadastroCliente;

public class PessoaFisica extends Cliente{
	
	private String cpf;

	public PessoaFisica(String nome, int idade, String sexo, int rg, String telefone, String cpf) {
		super(nome, idade, sexo, rg, telefone);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("CPF: " + this.cpf);
	}

}
