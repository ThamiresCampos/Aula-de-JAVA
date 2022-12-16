package exemplo;

public class ExemploMetodoSecundario2 {

	public static void main(String[] args) {
		soma();
		soma();

	}
	public static void soma() {
		
		int valor1 =15;
		int valor2 = 10;
		
		int soma = valor1 + valor2;
		
		System.out.println("O resultado da soma é : " +soma);
	}
	

}
