
public class Movimentacao {
	public static void main(String[] args) {
		Conta conta1;
		
		conta1 = new Conta();
		
		conta1.numeroDaConta = 123;
		conta1.nome = "Claudia";
		conta1.cpf = 12345678;
		conta1.tipo = 2;
		conta1.saldo = 50.03;
		
		conta1.exibirDados();
		conta1.depositar(100);
		conta1.sacar(50);
		conta1.sacar(10000);
		conta1.exibirDados();
		
	}
}
