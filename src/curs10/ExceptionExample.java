package curs10;

public class ExceptionExample {

	public static void main(String[] args) {
		
		String[] days = {"L", "M", "Mi", "J", "V", "S", "D"};
		//index: 0-->6
		System.out.println(days.length);
		
		try {
			System.out.println(days[7]);
		}catch(ArrayIndexOutOfBoundsException error) {
			System.out.println("Exception occured");
		}
		
		System.out.println("Alta linie de cod");

	}

}
