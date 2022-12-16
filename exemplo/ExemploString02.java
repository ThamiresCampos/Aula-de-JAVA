package exemplo;

public class ExemploString02 {

	public static void main(String[] args) {
		
		
		int numero1 = 10;
		int numero2 = 20;

		int soma = numero1 + numero2;
		System.out.println("Soma : " + soma);
		
		String numero3 = "10";
		String numero4 = "10";
		String soma1 = numero3 + numero4;
		System.out.println("Soma : " + soma1);
		
		String soma2 = numero1 + numero3;
		System.out.println("Soma : "+soma2);
		
		
		String txt = "We are the \n so-called\"Vikings\" from the north.";
		
		System.out.println(txt);
		
		String txt1 = "It's \\ alright.";
		System.out.println(txt1);
	}

}
