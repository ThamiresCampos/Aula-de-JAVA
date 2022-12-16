package exemplo;

public class ExemploVetorComLacoDeRepeticao3 {

	public static void main(String[] args) {
		
		
		String [] email = {"thamires_campos29@hotmail.com", "rosilda.cristovao.campos@gmail.com","josinaldo.paulo.campos@gmail.com","thamithamicampos7@gmail.com","camilly.cristovao.campos@gmail.com"};
		
		for (int i = 0; i < email.length; i++) {
			
			System.out.println(email[i]);
		}
		System.out.println("A quantidade de emails guardados é de : "+email.length);
	}

}
