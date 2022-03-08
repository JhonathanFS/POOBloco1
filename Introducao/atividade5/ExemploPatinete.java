package Introducao.atividade5;

public class ExemploPatinete {
	public static void main(String[] args) {
		
		Patinete p1 = new Patinete();
		Patinete p2 = new Patinete();
		
		p1.ligado();
		p1.acelerar();
		System.out.print("\n");
		p2.acelerador = true;
		p2.ligado = true;
		p2.combustivel = 3;
		System.out.print("\n");
		p2.ligado();
		p2.acelerar();
		
	}
}
