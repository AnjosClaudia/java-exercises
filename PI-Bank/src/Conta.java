
public class Conta {
	protected String nomeTitular;
	protected String cpf;
	protected int numeroConta;
	protected double saldo;

	public Conta(String nomeTitular, String cpf, int numeroConta) {
		super();
		this.nomeTitular = nomeTitular;
		this.cpf = cpf;
		this.numeroConta = numeroConta;
		this.saldo = 0;
	}

	public boolean debitar(double valor) {
		if (valor >= this.saldo) {
			return false;
		}
		this.saldo = getSaldo() - valor;
		return true;
	}

	public void creditar(double valor) {
		this.saldo = getSaldo() + valor;
	}

	public String exibirInfo() {
		String msg = "=============================================\n"
				+ " E X T R A T O \n"  
				+ "=============================================\n"
				+"Saldo da conta: R$ "
				+ String.format("%.2f\n", this.saldo) 
				+ "=============================================";
		return msg;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
