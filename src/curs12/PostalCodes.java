package curs12;

import java.util.HashMap;
import java.util.Map;

public class PostalCodes {
	
	Map<Integer, String> map = new HashMap<>();
	
	public PostalCodes() {
		
		map.put(100, "Cluj");
		map.put(117, "Pitesti");
		map.put(300, "Ploiesti");
		map.put(400, "Bucuresti");
		map.put(501, "Oradea");
		map.put(701, "Constanta");
	}
	
	
	public String findCity(int codPostal) throws PostalCodeException{
		
		if (map.containsKey(codPostal)) {
			return map.get(codPostal);
		}else {
			throw new PostalCodeException("This postal code does not exists!");
		}
	}

}
