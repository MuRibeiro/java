package cadastroLoja;

public class TestaGame {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("FIFA 23", "Futebol", "PS4/ PS5/ X-Box", 210.0f, "EASports");
		
		Produto p2 = new Produto("The Last Of Us", "Aventura", "PS4/ PS5", 299.9f, "Sony");
		
		p1.visualizar();
		
		p2.visualizar();
		
	}

}
