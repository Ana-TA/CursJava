package curs12;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>(); // nu permite duplicate, nu are index, neordonata. Lista permite duplicate, are index. 
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		
		set.add("mov");
		set.add("galben");
		set.add("rosu");
		set.add("alb");
		set.add("portocaliu");
		set.add("verde");
		
		for(String element : set) {
			System.out.println(element);
		}
		
		System.out.println("---------------------------------------------------------------");
		
		System.out.println(set.contains("mov"));
		set.remove("alb");
		System.out.println(set);
		set.removeAll(set);
		System.out.println(set);
		set.removeAll(set);
		//set.clear();

	}

}
