
public class ContaEspecial extends Conta {
	private double limite;

	public ContaEspecial(String nomeTitular, String cpf, int numeroConta) {
		super(nomeTitular, cpf, numeroConta);
		this.limite = 100;
	}
	
	@Override
	public boolean debitar(double valor) {
		if(valor > super.saldo + this.limite) {
			return false;
		}
		super.saldo = super.getSaldo() - valor;
		return true;
	}
	
}
