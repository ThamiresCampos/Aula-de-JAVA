package exemplo;
import java.util.Scanner;

public class ExemploMatriz3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] numero = new int[4];
		
		
		for (int i = 0; i < 4; i++) {
			System.out.println("Dígite um número : ");
			numero[i] = sc.nextInt();
			
		}
		
		for (int i = 0; i < numero.length; i++) {
			System.out.println(numero[i]);
			
		}
		sc.close();
	}

}
