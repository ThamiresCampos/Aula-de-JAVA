package exemplo;

public class Narrow {
	
	public static void main(String[]args) {
 	//convers�o direta//
			float numero = 130.01f;
			int numero1 = (int)numero;
			
			System.out.println(numero);
			System.out.println(numero1);
			System.out.println(Math.round(numero));
			
			System.out.println("--------------------");
			
			//byt -128 at� 1277
			//-128, -127, -126
			
			int a = 140;
			byte b = (byte)a;
			System.out.println(a);
}
}
