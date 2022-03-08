package Introducao.atividade3;

public class Switch {
	
	String jogo;
	int bateria;
	boolean ligado;

	public void jogar() {
		if (this.ligado==true && this.bateria>0) {
			System.out.println("Ligando Switch...");
			System.out.println("Abrindo "+jogo+"\nA bateria está em "+this.bateria+"%.");
		} else if (this.bateria==0) {
			System.out.println("O Switch está descarregado,"
					+ " recarregue para jogar.");
		} else {
			System.out.println("Ligue o Switch.");
		}
	}
	
	public void recarregar() {
		System.out.println("Carregando bateria...");
	}
	
}
