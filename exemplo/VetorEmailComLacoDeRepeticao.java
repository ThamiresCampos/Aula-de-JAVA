package exemplo;
import java.util.Scanner;

public class VetorEmailComLacoDeRepeticao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String email[] = new String[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Insira um email : ");
			email[i] = sc.next();
		}

		for (int i =0; i < email.length; i++) {
			System.out.println("Os emails armazenados são : "+email[i]);
		}
		sc.close();
	}

}
