package exemplo;

public class ExemploJavaMath {

	public static void main(String[] args) {
		
		int numero = 25;
		int numero2 = 20;
	
		System.out.println(Math.max(numero,numero2));
		System.out.println(Math.min(numero,numero2));
		System.out.println(Math.sqrt(numero));
		
		int subtracao = numero2 - numero;
		System.out.println("Subtração : "+subtracao);
		System.out.println(Math.abs(subtracao));
		
		System.out.println(Math.random()*101);
		int valor = (int) ((Math.random()*1001));
		
		System.out.println(valor);
	}

}
