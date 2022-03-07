
public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 300;
		System.out.println("Saldo 1ª conta: "+primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println("Saldo 2ª conta: "+segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("Saldo 2ª conta: "+segundaConta.saldo);
		System.out.println("Saldo 1ª conta: "+primeiraConta.saldo);
		
		System.out.println((primeiraConta == segundaConta) ? 
						    "mesma conta":"contas diferentes");
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
