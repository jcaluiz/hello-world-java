package nutrition;
import java.util.Scanner;

public class Diagnostico {

	public static void main(String[] args) {
		Avaliacao instanciaDeAvaliacao = new Avaliacao();
		
		Scanner instanciaDeScanner = new Scanner(System.in);

		System.out.print("Qual o seu peso: ");
		String pesoEntrada = instanciaDeScanner.next();
		
		
		System.out.print("Qual a sua altura: ");
		String alturaEntrada = instanciaDeScanner.next();
		
		instanciaDeScanner.close();
		
		double peso = Double.parseDouble(pesoEntrada);
		double altura = Double.parseDouble(alturaEntrada);
		
		instanciaDeAvaliacao.calculaIMC(peso, altura);
	}

}
