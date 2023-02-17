package exercicios_beecrowd;

import java.util.Scanner;

public class Area_Circulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*A fórmula para calcular a área de uma circunferência é: area = π . raio2. 
		 Considerando para este problema que π = 3.14159: Efetue o cálculo da área, 
		 elevando o valor de raio ao quadrado e multiplicando por π.
		*/
		
		Scanner leia = new Scanner(System.in);
		
		double n = 3.14159, raio, area;
		
		System.out.println("Digite raio:");
		raio = leia.nextDouble();
		
		area = n * (Math.pow(raio, 2));
		
		System.out.printf("A = %.4f", area);
		
		leia.close();
	}

}
