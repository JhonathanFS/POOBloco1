package Introducao.atividade6;

public class Conta {
	
	double saldo, transferencia, especial, debito;
	boolean credito;
	
		public void transferencia() {
			if (this.saldo>this.debito) {
				System.out.println("A tranferencia está sendo efetuada...");
				System.out.println("Saldo atual é "+(this.saldo-this.debito));
			} else {
				System.out.println("Sem saldo para transferencia");
			}
		}
		
		public void credito() {
			if (this.credito==true) {
				System.out.println("Liberando credito no valor de "+this.especial);
				this.saldo=this.especial+this.saldo;
				System.out.println("Saldo: "+this.saldo);
			}
		}
}
