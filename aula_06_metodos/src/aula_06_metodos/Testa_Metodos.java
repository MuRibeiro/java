package aula_06_metodos;

//import static aula_06_metodos.pacote2.Classe2.*; // importando o classe 2 para a classe principal
import static aula_06_metodos.pacote2.Classe2.*;

public class Testa_Metodos {

	public static void main(String[] args) {
		
		metodoPublic();
		metodoPadrao();
		metodoProtegido();
		metodoPrivado();
		
		Classe1.metodoPublico1();
		Classe1.metodoFriendly1();
		Classe1.metodoProtegido1();
		//Classe1.metodoPrivado1(); //Não funciona, pois esse metodo só funciona na mesma Classe.
		
		metodoPublicoPacote1();
		/*metodoFriendlyPacote1();
		metodoProtegidoPacote1();
		metodoPrivadoPacote1();*/ /* Não é possivel acessar. pois estao em outro pacote. Só é 
		possivel acessar o metodo public*/
		
		
		System.out.println(soma(2, 4));
	}

	public static void metodoPublic() {
		System.out.println("Eu sou um Método Público!");
	}
	
	public static int soma(int numero1, int numero2) {
		return numero1 + numero2;
	}
	
	static void metodoPadrao() {
		System.out.println("Eu spu um Método Friendly!");
	}
	
	protected static void metodoProtegido() {
		System.out.println("Eu sou um Método Protegido");
	}
	
	private static void metodoPrivado() {
		System.out.println("Eu sou um Método Privado!");
	}
}

//Todos funiconaram pois estão dentro da mesma classe!
