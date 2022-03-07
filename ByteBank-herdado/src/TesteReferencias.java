
public class TesteReferencias {

	public static void main(String[] args) {
		//polimorfismo
		//Funcionario g1 = new Gerente();
		
		Gerente g1 = new Gerente();
		g1.setNome("Claudia");
		g1.setSalario(1000);
		
		//g1.autentica(123); o método é do Gerente e não do funcionário
		
		Funcionario f1 = new Funcionario();
		f1.setNome("Claudia");
		f1.setSalario(1000);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(f1);
		controle.registra(g1);
		
		System.out.println(controle.getSoma());
		

	}

}
