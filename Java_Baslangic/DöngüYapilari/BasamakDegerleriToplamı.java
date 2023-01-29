package DöngüYapilari;

import java.util.Scanner;

public class BasamakDegerleriToplamı {

	public static void main(String[] args) {
		
		int toplam = 0;
		int bolum = 1;
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen sayıyı giriniz: ");
		int k = input.nextInt();
		boolean iszero = false;
		
		while (k != 0) {
			
			toplam += k % 10;
			k = k / 10;
			
			System.out.println(toplam + " " + k);
			
		}
		
		
	}

}
