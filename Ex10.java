package lista03;
import java.util.Scanner;
public class Ex10 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Entrada
	        System.out.print("Digite o custo de fábrica do carro: ");
	        double custoFabrica = scanner.nextDouble();
	        
	        // Percentuais
	        double percentualDistribuidor = 0.28;
	        double percentualImpostos = 0.45;
	        
	        // Cálculo do custo final
	        double valorDistribuidor = custoFabrica * percentualDistribuidor;
	        double valorImpostos = custoFabrica * percentualImpostos;
	        double custoFinal = custoFabrica + valorDistribuidor + valorImpostos;
	        
	        // Saída
	        System.out.printf("O custo final ao consumidor é: R$ %.2f\n", custoFinal);
	        
	        scanner.close();
	    }
	}


	
