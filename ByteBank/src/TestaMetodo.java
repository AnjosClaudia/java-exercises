
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaPaulo = new Conta();
		
		contaPaulo.deposita(100);
		System.out.println(contaPaulo.saldo);
		
		contaPaulo.saca(20);
		System.out.println(contaPaulo.saldo);
		
		boolean conseguiuRetirar = contaPaulo.saca(10.15);
		System.out.println(contaPaulo.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaMarcela = new Conta();
		contaMarcela.deposita(1000);
		
		if(contaMarcela.transfere(300, contaPaulo)) {
			System.out.println("TRANFERENCIA COM SUCESSO");
		} else {
			System.out.println("FALTOU DINHEIRO");
		}
		
		System.out.println(contaMarcela.saldo);
		System.out.println(contaPaulo.saldo);

	}

}
