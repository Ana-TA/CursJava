package curs11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample2 {

	public static void main(String[] args) {
		
		String[] culori = {"alb", "galben", "negru", "rosu", "verde", "mov"};
		
		List<String> list = new ArrayList<>(Arrays.asList(culori));
		
		System.out.println(list);
		
		System.out.println(list.size());
		list.add("portoaliu");
		System.out.println(list.size());
		System.out.println("---------------------------");
		//contine element
		System.out.println(list.contains("maro"));
		
		System.out.println("---------------------------");
		//fac update unui element
		System.out.println(list.get(0));
		list.set(0, "gri");
		System.out.println(list.get(0));
		System.out.println("---------------------------");

		for(String element : list) {
			System.out.println(element);
		}
		System.out.println("---------------------------");

		//sterg mai multe elemente
		list.subList(0, 3).clear();
		
		for(String element : list) {
			System.out.println(element);
		}
	}

}
