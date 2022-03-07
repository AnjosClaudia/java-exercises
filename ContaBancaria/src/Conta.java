
public class Conta {
	int numeroDaConta;
	String nome;
	int cpf;
	int tipo;
	double saldo;
	
	void depositar(double valor) {
		saldo += valor;
	}
	
	boolean sacar(double valor) {
		if(saldo < valor) {
			return false;
		}
		else {
			saldo -= valor;
			return true;
		}
	}
	
	void exibirDados() {
		System.out.println("Dados da Conta: "+numeroDaConta);
		System.out.println("Nome: "+nome);
		System.out.println("Saldo: "+saldo);
	}
}
