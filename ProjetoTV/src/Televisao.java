//a ideia é que a classe Televisao seja apenas para armazenar as infos relativas a uma TV
public class Televisao {
	//aqui defino os atributos (variaveis) que compoem sua definição
	String marca;
	int tamanho;
	boolean ligado;
	int canal;
	int volume;
	
	
	//Criamos o método exibirTV
	void exibirTV(/*entradas*/) {
		//função void não retorna valor 
		System.out.println("      \\/       ");
		System.out.println("+==============+");
		System.out.println("| "+marca+" |");
		System.out.println("| "+tamanho+" |");
	}
	
	void ligar() {
		ligado = true;
		System.out.println("A Tv "+marca+" está ligada");
	}
	
	void desligar() {
		ligado = false;
		System.out.println("A Tv "+marca+" está desligada");
	}
	
	void aumentarVolume() {
		if(!ligado) {
			System.out.println("Ligue a TV!");
		}
		else {
			volume++;
			System.out.println("Agora a Tv está no volume "+volume);
		}
	}
	
	void avancarCanal() {
		if(!ligado) {
			System.out.println("Para mudar de canal, ligue a TV");
		}
		else {
			canal++;
			System.out.println("Canal "+canal);
		}
		
	}
	
	void sintonizarCanal(int novoCanal) {
		if(!ligado) {
			System.out.println("Para mudar de canal, ligue a TV");
		}
		else {
			if(novoCanal <= 0 || novoCanal > 999) {
				System.out.println("Erro - canal inválido");
			}
			else {
				canal = novoCanal;
				System.out.println("Agora está no canal "+canal);
			}
		}
	}
	
	//método diferente de void tem que ter return
	int obterCanalSintonizado() {
		return canal;
	}
	
	
	
}
