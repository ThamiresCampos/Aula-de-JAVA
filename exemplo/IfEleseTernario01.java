package exemplo;
import java.util.Scanner;

public class IfEleseTernario01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("D�gite um valor:");
		int valor = sc.nextInt();
		
		String resultado = (valor%2==0)? "N�mero digitado � par" : "N�mero � �mpar";
		System.out.println(resultado);
		
sc.close();
	}

}
