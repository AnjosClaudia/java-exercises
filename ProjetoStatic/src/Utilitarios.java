//esta classe vai ter funções para fazer continhas
public class Utilitarios {
	//static - disvinculo a instanciação (métodos de classe)
	public static double soma(double a, double b) {
		return a+b;
	}
	
	public static double subt(double a, double b) {
		return a-b;
	}
	
	public static double pot(double a, int b) {
		double pot = 1;
		for(int cont=0; cont < b; cont++) {
			pot = pot*a;
		}
		return pot;
	}
	
}
