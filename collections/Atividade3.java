package collections;

import java.util.*;

public class Atividade3 {
	
	public static void main(String[] args) {
		
		Estoque ea1 = new Estoque("Pikachu",10);
		Estoque ea2 = new Estoque("Bulbasaur",20);
		Estoque ea3 = new Estoque("Squirtle",18);
		Estoque ea4 = new Estoque("Charmander",13);
		
		ArrayList<Estoque> lista = new ArrayList<>();
		
		
		
		lista.add(ea1);
		lista.add(ea2);
		lista.add(ea3);		
		lista.add(ea4);
		System.out.println(lista);
		
		lista.remove(ea4);
		System.out.println(lista);
	
		lista.set(0, ea4);
		System.out.println(lista);

	}
}
