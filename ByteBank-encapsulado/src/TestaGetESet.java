
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(123, 123);
		
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo");
		
		//juntando a referência de conta e paulo
		conta.setTitular(paulo);
		
		//imprime o endereço de referência
		System.out.println(conta.getTitular());
		
		System.out.println(conta.getTitular().getNome());
		
		//alterar a profissão
		conta.getTitular().setProfissao("programador");
	}
}
