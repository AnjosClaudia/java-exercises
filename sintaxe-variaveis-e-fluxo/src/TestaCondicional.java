
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando Condicionais");
		int idade = 20;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;

		if (idade >= 18 || acompanhado) {
			System.out.println("Você pode entrar!");
		} else {
			System.out.println("Não pode entrar");
		}
		
		//imprimir de 0 a 10
		int valor = 0;
		while(valor <= 10) {
			System.out.println(valor);
			valor ++;
		}
		System.out.println(valor);
		
		for(int contador = 0; contador <= 10; contador++) {
			System.out.println(contador);
		}

	}
}
