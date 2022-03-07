
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		//a conta está inconsistente em relação à regra de negócio
		//conta.setAgencia(-50);
		//conta.setNumero(-330);
		
		//default é zero
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(1337, 245626);
		Conta conta3 = new Conta(1337, 45626);
		
		//System.out.println(conta2.getTotal());
		//System.out.println(conta3.getTotal());
		System.out.println(Conta.getTotal()); //método static
	}
}
