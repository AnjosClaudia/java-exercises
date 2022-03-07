
public class CartaoPrePago {
	private String numeroCartao;
	private String titular;
	private int anoValidade;
	private int mesValidade;
	private double saldo;
	
	
	public CartaoPrePago(String numeroCartao, String titular, 
			int anoValidade, int mesValidade) {
		super();
		this.numeroCartao = numeroCartao;
		this.titular = titular;
		this.anoValidade = anoValidade;
		this.mesValidade = mesValidade;
		this.saldo = 0.0; //apenas para ser explícito
	}
	
	
	public String getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public int getAnoValidade() {
		return anoValidade;
	}
	public void setAnoValidade(int anoValidade) {
		this.anoValidade = anoValidade;
	}
	public int getMesValidade() {
		return mesValidade;
	}
	public void setMesValidade(int mesValidade) {
		this.mesValidade = mesValidade;
	}
	public double getSaldo() {
		return saldo;
	}
	
	
	public String exibirInfo() {
		String mensagem = "Número do cartão: "+numeroCartao+"\nNome: "+titular+
				"\nSaldo: "+saldo;
		return mensagem;
	}
	
	public void adicionarCredito(double valor) {
		this.saldo += valor;
	}
	
	public boolean comprar(double valor) {
		if(valor <= this.saldo) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
}
