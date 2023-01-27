package KosulluIfadeler;

public class SwitchCase {

	public static void main(String[] args) {
		
		int day = 1;
		
		switch (day) {
			case 1: 
				System.out.print("Pazartesi");
				break;
			case 2: 
				System.out.print("salı");
				break;
			case 3: 
				System.out.print("çarşamba");
				break;
			case 4: 
				System.out.print("Perşembe");
				break;
			case 5: 
				System.out.print("cuma");
				break;
			case 6: 
				System.out.print("cumartesi");
				break;
			case 7: 
				System.out.print("Pazar");
				break;
			default: 
				System.out.print("hatalı gün sayısı verdiniz.");
		}
		

	}

}
