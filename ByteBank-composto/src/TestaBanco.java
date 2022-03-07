
public class TestaBanco {
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "222222222";
		paulo.profissao = "Programador";

		Conta contaPaulo = new Conta();
		contaPaulo.deposita(100);

		contaPaulo.titular = paulo;
		System.out.println(contaPaulo.titular.nome);
		System.out.println(contaPaulo.titular);

	}
}
