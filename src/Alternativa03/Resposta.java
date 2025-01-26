package Alternativa03;

public class Resposta {

    public static void main(String[] args) {
    	
        double[][] faturamento = {
            {1, 22174.1664}, {2, 24537.6698}, {3, 26139.6134}, {4, 0.0}, {5, 0.0}, {6, 26742.6612}, {7, 0.0},
            {8, 42889.2258}, {9, 46251.174}, {10, 11191.4722}, {11, 0.0}, {12, 0.0}, {13, 3847.4823}, {14, 373.7838},
            {15, 2659.7563}, {16, 48924.2448}, {17, 18419.2614}, {18, 0.0}, {19, 0.0}, {20, 35240.1826},
            {21, 43829.1667}, {22, 18235.6852}, {23, 4355.0662}, {24, 13327.1025}, {25, 0.0}, {26, 0.0},
            {27, 25681.8318}, {28, 1718.1221}, {29, 13220.495}, {30, 8414.61}
        };

        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        double somaFaturamento = 0.0;
        double diaMenorFaturamento = 0;
        double diaMaiorFaturamento = 0;
        int diasComFaturamento = 0;
        int diasAcimaDaMedia = 0;

        for (double[] dias : faturamento) {
        	double dia = dias[0];
            double valor = dias[1];
            
            if (valor > 0) {
                if (valor < menorFaturamento) {
                    menorFaturamento = valor;
                    diaMenorFaturamento = dia;
                }
                if (valor > maiorFaturamento) {
                    maiorFaturamento = valor;
                    diaMaiorFaturamento = dia;
                }
                somaFaturamento += valor;
                diasComFaturamento++;
            }
        }

        double mediaFaturamento = somaFaturamento / diasComFaturamento;
        
        for (double[] dias : faturamento) {
            double valor = dias[1];
            
            if (valor > mediaFaturamento) {
                diasAcimaDaMedia++;
            }
        }

        System.out.println("Menor valor de faturamento foi no dia " + (int) diaMenorFaturamento + " com valor de R$" + String.format("%.2f", menorFaturamento));
        System.out.println("Maior valor de faturamento foi no dia " + (int) diaMaiorFaturamento + " com valor de R$" + String.format("%.2f", maiorFaturamento));
        System.out.println("Número de dias com faturamento acima da média: " + diasAcimaDaMedia + " dias");
    }
}
