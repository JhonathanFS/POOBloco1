package Introducao.atividade2;

public class Aviao {
	
	String empresa, saida, chegada;
	int acentos, combustive;
	boolean motores;
	
	public void voar() {
		if (this.motores == true) {
			System.out.println("O avi�o da empresa "+this.empresa+
			", saindo de "+this.saida+" com destino a "+this.chegada+".");
		} else {
			System.out.println("O avi�o da empresa "+this.empresa+", n�o decolou.");
		}
	}
		
	public void vagas() {
		System.out.println(this.acentos/4+" s�o acento de primeira classe."+
		"\n"+this.acentos/4+" s�o acento executivos."+
		"\n"+this.acentos/2+" s�o acento econ�micos.");
	}
}
