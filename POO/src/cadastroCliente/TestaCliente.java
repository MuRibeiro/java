package cadastroCliente;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Murilo", 26, "Masculino", 12345678, 981330736);
		
		Cliente c2 = new Cliente("Juliana", 24, "Feminino", 12365478, 991007433);
		
		c1.visualizar();
		
		c2.visualizar();

	}

}
