package curs12;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		
		map.put("T", "Tester");
		map.put("D", "Developer");
		map.put("M", "Manager");
		map.put("P", "ProductOwner");
		
		System.out.println(map.size());
		
		System.out.println(map.get("T"));
		
		System.out.println(map);
		
		map.put("T", "Automation");
		System.out.println(map);  //duplicate keys-not allowed
		
		System.out.println("---------------------------------------------------------------");
		
		System.out.println("contains key: " + map.containsKey("X"));
		System.out.println("contains value: " + map.containsValue("Automation"));
		
		System.out.println("---------------------------------------------------------------");
		
		for(String key : map.keySet()) {
			System.out.println(key);
		}
		
		System.out.println("---------------------------------------------------------------");
		
		for(String value : map.values()) {
			System.out.println(value);
		}
		
		System.out.println("---------------------------------------------------------------");
		
		System.out.println(map.size());
		map.remove("T");
		System.out.println(map.size());
		
		for(String value : map.values()) {
			System.out.println(value);
		}
		
		System.out.println("---------------------------------------------------------------");
		
		map.replace("D", "Director");
		for(String value : map.values()) {
			System.out.println(value);
		}
		
	}

}
