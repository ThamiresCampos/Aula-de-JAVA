package exemplo;
import java.util.Scanner;

public class exemplo02 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("D�gite um nu�mero: ");
		int valor1 = sc.nextInt();
		System.out.println();
		
		System.out.println("D�gite mais um n�mero :");
		int valor2 = sc.nextInt();
		System.out.println();
		
		int soma = valor1 + valor2;
		System.out.println("O resultado da soma � : ");
		
		if (soma>10) {
			System.out.println("Maior que 10");
			
		}else {
			System.out.println("Menor que 10");
		}
		
		sc.close();
	}

}
