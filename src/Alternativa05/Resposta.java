package Alternativa05;

import java.util.Scanner;

public class Resposta {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite uma string para inverter: ");
		
		String input = scanner.nextLine();
		scanner.close();

		String invertida = inverterString(input);
		System.out.println("A string foi invertida: " + invertida);
	}

	private static String inverterString(String str) {
		char[] caracteres = str.toCharArray();
		String resultado = "";
		
		for (int i = caracteres.length - 1; i >= 0; i--) {
			resultado += caracteres[i];
		}
		
		return resultado;
	}
}
