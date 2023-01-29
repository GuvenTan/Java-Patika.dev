package DöngüYapilari;

import java.util.Scanner;

public class HarmonicSeries {

	public static void main(String[] args) {
		double toplam = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen sayıyı giriniz: ");
		int k = input.nextInt();

		for (int i = 1; i<=k; i++) {
			
			toplam += 1.0/i;
			System.out.println(toplam);
			
		}
		
	}

}
