package mtransporte;

public class TestaTransporte {

	public static void main(String[] args) {
		
		Transporte t1 = new Transporte(5);
		
		Terrestre tr1 = new Terrestre(5, 4, 200);
		
		Automovel a1 = new Automovel(5, 4, 200, "Preta", 4, "MUR-2613", 5);
		
		t1.visualizar();
		
		System.out.println("\n");
		
		tr1.visualizar();
		
		System.out.println("\n");
		
		a1.visualizar();
		
		System.out.println("\n");
		
		a1.mensagem();
		
		a1.mensagem("O carnaval acabou!");
	}

}
