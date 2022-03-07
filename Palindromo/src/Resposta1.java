import java.util.Scanner;

public class Resposta1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a palavra: ");
		String palavra = teclado.nextLine();
		
		char letras[] = palavra.toCharArray();
		boolean ehPalindromo = true;
		
		for(int i = 0; i < letras.length/2; i++) {
			if(letras[i] != letras[letras.length - 1 - i]) {
				ehPalindromo = false;
				break;
			}
		}
		
		System.out.println((ehPalindromo?"Palindromo":"Não é palindromo"));
		
		teclado.close();

	}

}
