package exemplo;
import java.util.Scanner;

public class VetorGeneroComLacoDeRepeticao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		String genero[] = new String[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println("D�gite seu sexo : ");
			genero[i] = sc.next();		
		
		}
		
		for (int i = 0; i  < genero.length; i++) {
			System.out.println("Os g�neros armazenados s�o : "+genero[i]);
		}
	}
	

}
