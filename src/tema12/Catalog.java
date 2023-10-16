package tema12;

import java.util.HashMap;
import java.util.Map;

public class Catalog {
	
	Map<String, Integer> mapCatalog = new HashMap<>();
	
	public void populateCatalog() {
		
		mapCatalog.put("Andrei", 8);
		mapCatalog.put("Elena", 9);
		mapCatalog.put("Maria", 10);
		mapCatalog.put("Alin", 10);
		mapCatalog.put("Stefan", 7);
		mapCatalog.put("Marius", 8);
	}
	
	public void displayCatalog() {
		
		for (String key : mapCatalog.keySet()) {
			
			System.out.println("Numele elevului este: " + key + " iar nota lui este: " + mapCatalog.get(key));
		}
	}
	
	public Integer getNoteForName(String name) {
		
		for (String key : mapCatalog.keySet()) {
			if (key.equals(name)) {
				return mapCatalog.get(key);
			}
		}
		return 0;
	}
	
	public Boolean findNameInCatalog(String name) {
		
		for (String key : mapCatalog.keySet()) {
			if (key.equals(name)) {
				return true;
			}
		}
		return false;
	}
	
	public void updateCatalatog(String nume, Integer nota, Boolean replace) {
		
		if (replace) {
			mapCatalog.replace(nume, nota);
		}else {
			mapCatalog.put(nume, nota);
		}
	}
}
