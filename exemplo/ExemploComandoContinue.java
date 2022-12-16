package exemplo;

public class ExemploComandoContinue {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			if ((i==7) || (i==5)) {
				continue;
			}
			System.out.println(i);
		}
		
	}

}
