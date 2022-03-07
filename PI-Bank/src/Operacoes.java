import java.util.Scanner;

public class Operacoes {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		ContaEspecial contaPremium = new ContaEspecial("Claudia", "321", 321);
		
		int opcao;
		double valor;
		
		do {
			System.out.println("=======================================");
			System.out.println("  B  A  N  C  O   C  E  N  T  R  A  L");
			System.out.println("=======================================");
			System.out.println(" 0 - Inserir Credito");
			System.out.println(" 1 - Solicitar Saque");
			System.out.println(" 2 - Exibir informações");
			System.out.println("-1 - Sair");
			System.out.println();
			
			opcao = teclado.nextInt();
			
			switch (opcao) {
			case 0:
				System.out.println("Digite o credito a inserir");
				valor = teclado.nextDouble();
				contaPremium.creditar(valor);
				break;
			case 1:
				System.out.println("Digite o valor do saque");
				valor = teclado.nextDouble();
				System.out.println(contaPremium.debitar(valor) ? 
						           String.format("Você sacou R$ %.2f",valor) : 
						           "Saldo insuficiente!"); 
				break;
			case 2:
				System.out.println(contaPremium.exibirInfo());
				break;
			default:
				System.out.println("Opção inválida. Digite novamente.");
				break;
			}
			
			
		} while (opcao != -1);
		
		
		
		teclado.close();

	}

}
