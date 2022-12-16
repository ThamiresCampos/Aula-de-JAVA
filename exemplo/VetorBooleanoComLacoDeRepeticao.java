package exemplo;
import java.util.Scanner;

public class VetorBooleanoComLacoDeRepeticao {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);		
		String filhos[] = new String[5];
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Possui filhos? ");
			System.out.println("Sim ou Não:");
			filhos[i] = sc.next();
		}
		
		for (int i =0; i < filhos.length; i++) {
			System.out.println("As respostas armazenadas são : "+filhos[i]);
		}
		sc.close();
	}

}
