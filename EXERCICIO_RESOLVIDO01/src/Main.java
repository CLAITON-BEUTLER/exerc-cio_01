import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a largura do terreno: ");
		double largura = sc.nextDouble();
		System.out.println("Digite o comprimento do terreno: ");
		double comprimento = sc.nextDouble();
		System.out.println("Digite o preco do metro quadrado do terreno: ");
		double metro_quadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metro_quadrado;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
	

		
		sc.close();
	}

}
