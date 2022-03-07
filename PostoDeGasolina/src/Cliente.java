import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Posto posto = new Posto();
		
		int num, res;
		double valor;
		
		do {
			System.out.println("POSTO DE GASOLINA");
			System.out.println("Selecione: 1 - abastecer em litros /"+ 
								"2 - abastecer em reais / 0 - Para sair");
			
			res = teclado.nextInt();
			System.out.println("Qual tipo de combustível: ");
			num = teclado.nextInt();
			
			switch (res) {
			case 1:
				System.out.println("Quantos litros?");
				valor = teclado.nextDouble();
				double total = posto.abastecerEmLitros(num, valor);
				System.out.println("Abasteceu "+String.format("%.2f", valor)+
						" litros e ficou R$ "+String.format("%.2f", total));
				System.out.println();
				break;
			case 2:
				System.out.println("Qual valor?");
				valor = teclado.nextDouble();
				double quantidade = posto.abastecerEmReais(num, valor);
				System.out.println("Abasteceu "+String.format("%.2f", quantidade)+
						" litros e ficou R$ "+String.format("%.2f", valor));
				System.out.println();
				break;
			case 0:
				System.out.println("Obrigado pela preferência!");
				break;
			default:
				System.out.println("Digite um valor válido!");
				System.out.println();
				break;
			}
		} while (res != 0);
		
		
		
		teclado.close();
	
	}

}
