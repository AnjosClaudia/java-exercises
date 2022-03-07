
public class AppQueUsaTV {
	public static void main(String[] args) {
		
		Televisao t1, t2;
		
		//como estou tratando de classes, preciso declarar e INSTANCIAR
		t1 = new Televisao(); //solicito à MV Java, a quantidade de memória necessário para acomodar essa estrutura a memória
		t2 = new Televisao();
		
		t1.marca = "Telefunken";
		t1.tamanho = 20;
		t1.ligado = false;
		t1.canal = 5;
		t1.volume = 0;
		
		t2.marca = "Filipis";
		t2.tamanho = 55;
		t2.ligado = true;
		t2.canal = 4;
		t2.volume = 2;
		
		//invocamos o método na classe principal
		t1.ligar();
		t1.aumentarVolume();
		t1.sintonizarCanal(506);
		t1.exibirTV();
		t1.desligar();
		t1.aumentarVolume();
		t2.exibirTV();
		
		System.out.println("A TV foi desligada no canal "+t1.obterCanalSintonizado());
		
	}
}
