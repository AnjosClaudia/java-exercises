
public class TestaVariaveis {
	public static void main(String[] args) {
		System.out.println("Olá novo teste!");
		
		int idade;
		idade = 35 + 10;
		System.out.println("A idade é "+idade);
		
		double salario = 85.50;
		System.out.println("O salário é "+salario);
		
		int divisao = 5 / 2;
		System.out.println(divisao); //resulta em apenas 2
		
		double novaDivisao = 5 / 2;
		System.out.println(novaDivisao); //resulta em 2.0
		
		double novaTentativa = 5.0 / 2;
		System.out.println(novaTentativa); //resulta em 2.5
		
		int valor = (int) salario;
		System.out.println(valor); //resulta em 85 //casting - conversão manual
		
		long numeroGrande = 646866L; //l no final
		short valorPequeno = 2131;
		byte b = 127; //só vai até 127
		
		/*Para o Java, 3.14 é um double com 64bits. É um valor que cabe em um tipo 
		 * flutuante com 32bits? Não, e informações podem ser perdidas. 
		 * Neste caso, usa-se o casting, o que seria estranho, ou se indica que este 
		 * literal, o valor 3.14, é um float, colocando-se "f" no fim: */
		float pontoFlutuante = 3.14f;
		
		System.out.println(numeroGrande+valorPequeno+b+pontoFlutuante);
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println(total); //resulta em 0.30000000000000004
		
		char letra = 'a'; //guarda um único caracter com aspas simples
		System.out.println(letra);
		
		char valorChar = 66;
		System.out.println(valorChar);//resulta em B
		
		String palavra = "Java";
		System.out.println(palavra);
		
	}
} 
