package exemplo;
import java.util.Scanner;

public class IfEleseTernario01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dígite um valor:");
		int valor = sc.nextInt();
		
		String resultado = (valor%2==0)? "Número digitado é par" : "Número é ímpar";
		System.out.println(resultado);
		
sc.close();
	}

}
