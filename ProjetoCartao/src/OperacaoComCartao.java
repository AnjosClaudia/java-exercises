
public class OperacaoComCartao {
	public static void main(String[] args) {
		CartaoPrePago cartao;
		
		cartao = new CartaoPrePago("123", "Claudia", 2023, 05);
		
		System.out.println(cartao.exibirInfo());
		
		System.out.println(cartao.comprar(15)?
							"Compra efetuada":"Sem saldo suficiente");
		
		System.out.println(cartao.exibirInfo());
	}
}
