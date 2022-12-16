package exemplo;
import java.util.Scanner;

public class VetorTelefoneComLacoDeRepeticao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		String telefone[] = new String[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Insira um telefone : ");
			telefone[i] = sc.next();
		}
		for (int i = 0; i < telefone.length; i++) {
			System.out.println("Os telefones armazenados são : "+telefone[i]);
		}
		sc.close();

	}

}
