package Introducao.atividade1;

public class ExemploCliente {
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		
		c2.status();
		c2.venda();
		System.out.print("\n");
		c1.cadastro = true;
		c1.nome="Fernando Perreira";
		c1.maior18 = true;
		c1.email = "generico@mail.com";
		c1.tel="(11)966724657";
		c1.status();
		c1.venda();
	}
}
