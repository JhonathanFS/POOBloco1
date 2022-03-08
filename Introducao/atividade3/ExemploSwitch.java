package Introducao.atividade3;

public class ExemploSwitch {
	public static void main(String[] args) {
		

		Switch s1 = new Switch();
		Switch s2 = new Switch();
		
		s1.jogar();
		s1.recarregar();
		System.out.print("\n");
		s2.bateria = 76;
		s2.jogo = "Zelda - Breathing the wild";
		s2.ligado = true;
		s2.jogar();
		s2.recarregar();
	
	}
}
