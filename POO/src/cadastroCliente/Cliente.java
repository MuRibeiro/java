package cadastroCliente;

public class Cliente {
	
	private String nome;
	private int idade;
	private String sexo;
	private int rg;
	private String telefone;
	
	public Cliente(String nome, int idade, String sexo, int rg, String telefone) {
		
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.rg = rg;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public String getTelefone() {
		return telefone;
	}

	public void seTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void visualizar() {
		
		System.out.println(".........................................");
		System.out.println(".         DADOS DO CLIENTE              .");
		System.out.println(".........................................");
		System.out.println("Nome do cliente: " + this.nome);
		System.out.println("Idade do cliente: " + this.idade);
		System.out.println("Sexo do cliente: " + this.sexo);
		System.out.println("RG do cliente: " + this.rg);
		System.out.println("Telefone do cliente: " + this.telefone);
		
	}

}
