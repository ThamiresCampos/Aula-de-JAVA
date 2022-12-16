package exemplo;
import java.util.Scanner;	
public class VetorNomeComLacoDeRepeticao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		String nome[] = new String[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Dígite um nome : ");
			nome[i] = sc.next();
		}
		
		for (int i = 0; i < nome.length; i++) {
			System.out.println("Os nomes guardados são : "+nome[i]);
		}
		sc.close();
	}

}
