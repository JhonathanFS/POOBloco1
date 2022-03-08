package Introducao.atividade2;

public class Aviao {
	
	String empresa, saida, chegada;
	int acentos, combustive;
	boolean motores;
	
	public void voar() {
		if (this.motores == true) {
			System.out.println("O avião da empresa "+this.empresa+
			", saindo de "+this.saida+" com destino a "+this.chegada+".");
		} else {
			System.out.println("O avião da empresa "+this.empresa+", não decolou.");
		}
	}
		
	public void vagas() {
		System.out.println(this.acentos/4+" são acento de primeira classe."+
		"\n"+this.acentos/4+" são acento executivos."+
		"\n"+this.acentos/2+" são acento econômicos.");
	}
}
