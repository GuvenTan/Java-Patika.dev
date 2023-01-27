package KosulluIfadeler;

import java.util.Scanner;

public class EtkinlikRehberi {

	public static void main(String[] args) {
		
		int derece;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Bugün hava kaç derece: ");
		derece = input.nextInt();
		
		if (derece < 5) {
			System.out.print("Kayak");
		}else if (derece > 5 && derece < 15) {
			System.out.print("Sinema");
		}else if (derece > 15 && derece < 25) {
			System.out.print("Piknik");
		}else if (derece > 25) {
			System.out.print("Yüzme");
		}else {
			System.out.print("Plan bulunamadı.");
		}

	}

}
