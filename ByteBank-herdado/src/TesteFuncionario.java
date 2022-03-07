
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario nico = new Funcionario();

		nico.setNome("Nico");
		nico.setCpf("123");
		nico.setSalario(100);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
		Gerente g1 = new Gerente();
		g1.setNome("Claudia");
		g1.setCpf("233");
		g1.setSalario(2000);
		g1.setSenha(123);
		boolean autenticou = g1.autentica(123);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getSalario());
		System.out.println(autenticou);
		System.out.println(g1.getBonificacao());
	}

}
