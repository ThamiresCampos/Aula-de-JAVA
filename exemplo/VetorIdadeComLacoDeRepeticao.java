package exemplo;
import java.util.Scanner;

public class VetorIdadeComLacoDeRepeticao {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		String idade[] = new String[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println("D�gite uma idade : ");
			idade[i] = sc.next();
		}
		
		for (int i = 0; i < idade.length; i++) {
			System.out.println("As idades guardadas s�o : "+idade[i] + " anos");
		}
		sc.close();
	}
}
