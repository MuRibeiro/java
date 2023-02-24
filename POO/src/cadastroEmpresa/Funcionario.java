package cadastroEmpresa;

public class Funcionario {

	private String nome;
	private int matricula;
	private int celular;
	private String funcao;
	private float salario;
	
	public Funcionario(String nome, int matricula, int celular, String funcao, float salario) {
		this.nome = nome;
		this.matricula = matricula;
		this.celular = celular;
		this.funcao = funcao;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getCelular() {
		return celular;
	}

	public void setCelular(int celular) {
		this.celular = celular;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public float getSalario() {
		return salario;
	}

	public void setTurno(float salario) {
		this.salario = salario;
	}
	
	public void visualizar() {
		
		System.out.println("         --------------------------------------------------");
		System.out.println("         -              DADOS FUNCIONARIO                 -");
		System.out.println("         --------------------------------------------------");
		System.out.println("                                                           ");
		System.out.println("         - Nome: " + this.nome);
		System.out.println("         - Matricula: " + this.matricula);
		System.out.println("         - Celular: " + this.celular);
		System.out.println("         - Função: " + this.funcao);
		System.out.println("         - Salario: R$" + this.salario);
		
	}
	
	
}
