
public class Posto {
	
	private Bomba bomba[];
	private double quantidade;
	private double total;
	
	public Posto() {
		this.quantidade = 0;
		this.total = 0;
		this.bomba = new Bomba[3];
		
		bomba[0] = new Bomba("Gasolina", 25.36);
		bomba[1] = new Bomba("Diesel", 5.26);
		bomba[2] = new Bomba("Alcool", 10);
	}
	
	public double abastecerEmLitros(int bomba, double qtdade) {
		this.total = qtdade * this.bomba[bomba].getValor();
		setQuantidade(qtdade);
		return this.total;
	}
	
	public double abastecerEmReais(int bomba, double valor) {
		this.quantidade = valor / this.bomba[bomba].getValor();
		setTotal(valor);
		return this.quantidade;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Bomba[] getBomba() {
		return bomba;
	}

	public void setBomba(Bomba[] bomba) {
		this.bomba = bomba;
	}
	
	
	
	
}
