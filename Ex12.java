package lista03;
import java.util.Scanner;
public class Ex12 {
		    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Solicita a temperatura em Fahrenheit
	        System.out.print("Digite a temperatura em graus Fahrenheit: ");
	        double fahrenheit = scanner.nextDouble();

	        // Calcula a temperatura em Celsius
	        double celsius = (fahrenheit - 32) * 5 / 9;

	        // Exibe o resultado
	        System.out.printf("A temperatura em graus Celsius é: %.2f\n", celsius);

	        scanner.close();
	    }
	}

