import java.util.Scanner;

public class Resposta2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a palavra: ");
		String palavra = teclado.nextLine();
		
		boolean ehPalindromo = true;
		
		int tamanhoDaPalavra = palavra.length();
		
		for(int i = 0; i < tamanhoDaPalavra; i++) {
			if(palavra.charAt(i) != palavra.charAt(tamanhoDaPalavra - 1 - i)) {
				ehPalindromo = false;
				break;
			}
		}
		
		System.out.println((ehPalindromo?"Palindromo":"Não é palindromo"));
		
		teclado.close();

	}

}
