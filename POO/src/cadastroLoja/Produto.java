package cadastroLoja;

public class Produto {

	private String nomeJogo;
	private String categoria;
	private String console;
	private float preco;
	private String fabricante;
	
	public Produto(String nomeJogo, String categoria, String console, float preco, String fabricante) {
		this.nomeJogo = nomeJogo;
		this.categoria = categoria;
		this.console = console;
		this.preco = preco;
		this.fabricante = fabricante;
	}

	public String getNomeJogo() {
		return nomeJogo;
	}

	public void setNomeJogo(String nomeJogo) {
		this.nomeJogo = nomeJogo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	public void visualizar() {
		
		System.out.println("\t++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("\t+             DADOS DO JOGO                +");
		System.out.println("\t++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("\t                                            ");
		System.out.println("\tNome: " + this.nomeJogo);
		System.out.println("\tCategoria: " + this.categoria );
		System.out.println("\tConsole: " + this.console );
		System.out.println("\tPreço: R$" + this.preco );
		System.out.println("\tFabricante: " + this.fabricante );
		System.out.println("\t++++++++++++++++++++++++++++++++++++++++++++\n\n");
	}
	
	
}
