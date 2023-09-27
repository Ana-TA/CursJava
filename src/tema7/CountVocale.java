package tema7;

public class CountVocale {
	
	String text = "Eu invat Java";
	char[] vocale = {'a', 'e', 'i', 'o', 'u'};
	
	public void Vocale() {
		
		text = text.toLowerCase();
		int count = 0;
		
		for(char vocala: vocale) {
			for (int i = 0; i < text.length(); i++) {
				if (vocala == text.charAt(i)) {
					count += 1;
				}
			}
		}
		
		System.out.println("Numarul de vocale este: " + count);
	}
}
