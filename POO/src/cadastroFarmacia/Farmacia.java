package cadastroFarmacia;

public class Farmacia {

	private long id;
	private String nome; 
	private String nomeComercial;
	private String fabricante;
	private String foto;
	private float preco;
	
	public Farmacia(long id, String nome, String nomeComercial, String fabricante, String foto, float preco) {
		this.id = id;
		this.nome = nome;
		this.nomeComercial = nomeComercial;
		this.fabricante = fabricante;
		this.foto = foto;
		this.preco = preco;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeComercial() {
		return nomeComercial;
	}

	public void setNomeComercial(String nomeComercial) {
		this.nomeComercial = nomeComercial;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public void visualizar() {
		System.out.println("*************************************");
		System.out.println("*         DADOS DO PRODUTO          *");
		System.out.println("*************************************");
		System.out.println("Id: " + this.id);
		System.out.println("Nome: " + this.nome);
		System.out.println("Nome Comercial: " + this.nomeComercial);
		System.out.println("Fabricante: " + this.fabricante);
		System.out.println("Foto: " + this.foto);
		System.out.println("Preço: R$" + this.preco);
	}
		
}
