package exemplo;

public class ExemploString {

	public static void main(String[] args) {
		
		String nome = "Thamires";
		System.out.println(nome);
		
		int qtdCaracteres = nome.length();
		
		System.out.println(qtdCaracteres);
		
		String nomeMaiusculo = nome.toUpperCase();
		
		System.out.println(nomeMaiusculo);
		
		String nomeMinusculo = nome.toLowerCase();
		
		System.out.println(nomeMinusculo);
		
		String texto = "Bom dia, o sol já nasceu lá na fazendinha";
		
		int localizarPalavra = texto.indexOf("sol");
		
		System.out.println(localizarPalavra);
		
		String primeiroNome = "Thamires ";
		
		String segundoNome = "Campos";
		
		System.out.println(primeiroNome +" "+ segundoNome);
		
		System.out.println(primeiroNome.concat(segundoNome));

	}

}
