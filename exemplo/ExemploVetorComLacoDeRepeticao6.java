package exemplo;

public class ExemploVetorComLacoDeRepeticao6 {

	public static void main(String[] args) {
		
		String [] genero = {"Feminino", "Outros","Feminino", "Masculino","Outros"};
		
		for (int i = 0; i < genero.length; i++) {
			System.out.println(genero[i]);
		}
		System.out.println("A quantidade de dados armazenados é de : "+genero.length);
	}

}
