package exemplo;
import java.util.Scanner;

public class exemplo02 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Dígite um nuúmero: ");
		int valor1 = sc.nextInt();
		System.out.println();
		
		System.out.println("Dígite mais um número :");
		int valor2 = sc.nextInt();
		System.out.println();
		
		int soma = valor1 + valor2;
		System.out.println("O resultado da soma é : ");
		
		if (soma>10) {
			System.out.println("Maior que 10");
			
		}else {
			System.out.println("Menor que 10");
		}
		
		sc.close();
	}

}
