package Introducao.atividade2;

public class ExemploAviao {
	
	public static void main(String[] args) {
		
		Aviao a1 = new Aviao();
		Aviao a2 = new Aviao();
	
		a1.vagas();
		a1.voar();
		System.out.print("\n");
		a2.acentos = 100;
		a2.motores = true;
		a2.chegada = "São Paulo - Guarulhos";
		a2.saida = "Bahia - Porto Seguro";
		a2.empresa = "Azul";
		a2.vagas();
		a2.voar();
	}
}
