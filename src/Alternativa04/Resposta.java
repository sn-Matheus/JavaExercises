package Alternativa04;

public class Resposta {
	public static void main(String[] args) {
		double sp = 67836.43, rj = 36678.66, mg = 29229.88, es = 27165.48, outros = 19849.53;
		double total = sp + rj + mg + es + outros;
		
		System.out.println("Percentual de SP: " + (Math.round(sp / total * 100)) + "%");
		System.out.println("Percentual de RJ: " + (Math.round(rj / total * 100)) + "%");
		System.out.println("Percentual de MG: " + (Math.round(mg / total * 100)) + "%");
		System.out.println("Percentual de ES: " + (Math.round(es / total * 100)) + "%");
		System.out.println("Percentual de Outros: " + (Math.round(outros / total * 100)) + "%");
	}

}
