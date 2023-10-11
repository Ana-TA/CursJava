package curs11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		List<String> list =  new ArrayList<>();		
		System.out.println(list.size());
		//adaugare elemente in lista
		list.add("Oana");
		list.add("Gabriel");
		list.add("Ion");
		list.add("Maria");
		list.add("Ion");

		System.out.println(list.size());

		for(String nume : list) {
			System.out.println(nume);
		}
		System.out.println("----------------------");
		//citesc element din lista
		System.out.println(list.get(3));
		
		System.out.println("----------------------");
		
		for(String nume : list) {
			System.out.println(list.indexOf(nume) + " : " + nume);
		}
		
		System.out.println(list.get(4));

		System.out.println("----------------------");

		list.add(0, "Mara");
		//stergem din lista
		list.remove(5);	
		//list.remove("Ion");
		
		for(String nume : list) {
			System.out.println(list.indexOf(nume) + " : " + nume);
		}
		
		System.out.println("----------------------");

		list.add(5, "fabio");
		list.add(6, "Ioana");
		
		for(String nume : list) {
			System.out.println(list.indexOf(nume) + " : " + nume);
		}
		
		//stergem toata lista
		list.clear();
		
		System.out.println(list.size());
		
	}

}
