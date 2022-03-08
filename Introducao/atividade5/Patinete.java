package Introducao.atividade5;

public class Patinete {
	
	boolean ligado, acelerador;
	int combustivel;
	
	public void ligado() {
		if (this.ligado==true && this.combustivel>0) {
			System.out.println("Ligando Motor...");
			System.out.println("Patinete em movimento...");
			System.out.println("Estado atual de gasolina "+combustivel+"TL.");
		} else if (this.combustivel==0) {
			System.out.println("O Patine está sem gasolina.");
		} 
	}
	
	public void acelerar() {
		if (acelerador==true) {
				System.out.println("Acelerando...");
		}
	}
}