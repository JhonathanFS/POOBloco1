package Introducao.atividade6;

public class ExemploConta {
	public static void main(String[] args) {
		
	
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		
		c1.transferencia();
		c1.credito();
		System.out.print("\n");
		c2.credito=true;
		c2.debito=150;
		c2.especial=1000;
		c2.saldo=300;
		c2.transferencia();
		c2.credito();
	}
}
