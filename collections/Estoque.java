package collections;

public class Estoque {
	
	private String item;
	private int ea;
	
	public Estoque(String i, int q) {
		this.item=i;
		this.ea=q;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getEa() {
		return ea;
	}

	public void setEa(int ea) {
		this.ea = ea;
	}
	
	public String toString() {
		return "\nUnidade: "+this.item+" - "+this.ea+" sobrando\n";
	}
}
