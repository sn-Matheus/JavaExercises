package Alternativa02;


import java.util.Scanner;

public class Resposta {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número para verificar se ele pertence à sequência de Fibonacci: ");
		
		int numero = scanner.nextInt();
		
		scanner.close();
		
		if (isFibonacci(numero)) {
			System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
		} else {
			System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
		}
	}
	
	private static boolean isFibonacci(int n) {
		int a = 0, b = 1, soma;
		
		while (a < n) {
			soma = a + b;
			a = b;
			b = soma;
		}
		
		return a == n;
	}
}

