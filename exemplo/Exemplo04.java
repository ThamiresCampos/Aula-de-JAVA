package exemplo;
import java.util.Scanner;

public class Exemplo04 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		

		System.out.println("D�gite um n�mero :");
		int numero = sc.nextInt();
		
		
		switch (numero) {
		case 1:
			System.out.println("Segunda");
			break;
			
		case 2:
			System.out.println("Ter�a");
			break;
			
		case 3:
			System.out.println("Quarta");
			break;
			
		case 4:
			System.out.println("Quinta");
			break;
			
		case 5:
			System.out.println("Sexta");
			break;
			
		case 6:
			System.out.println("S�bado");
			break;
			
		case 7:
			System.out.println("Domingo");
			break;
			
		default:
			System.out.println("N�o encontrado");
			break;
	
		}
		
		sc.close();
		
	}

}
