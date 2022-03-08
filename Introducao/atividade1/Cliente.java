package Introducao.atividade1;

	public class Cliente {
	
		String nome, email, tel;
		int idade;
		boolean maior18, cadastro=false;
				
		public void status() {
				if (this.cadastro==true) {
					System.out.println("Nome: "+this.nome);
					System.out.println("Maior de Idade: "+this.maior18);
					System.out.println("Email: "+this.email);
					System.out.println("Tel: "+this.tel);
					} else { 
						System.out.println("Não foi cadastrado.");
					}
		}
		
		public void venda() {
				
			if (this.cadastro==false) {
				System.out.println("Não foi cadastrado.");
			} else if (this.maior18==true) {
				System.out.println("A venda pode ser efetuada");
			} else {
				System.out.println("Precisa de autorização de um responsável");
			}
		
		}
}
