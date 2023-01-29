package DöngüYapilari;

import java.util.Scanner;

public class GirilenDegereKadarUcVeDordeBolunenSayılar {

	public static void main(String[] args) {

		int toplam = 0;
		int adet = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Lütfen sayı giriniz: ");
		int k = input.nextInt();
		
		for(int i = 1; i<=k; i++) {
			
			if ((i % 3 == 0) && (i % 4 == 0)) {
				System.out.println(i);
				toplam += i;
				adet = adet + 1;
			}
			
		}
		System.out.println("3 ve 4'e bölünen sayıların toplamı: " + toplam + " ve adeti: " + adet);
		double ortalama = toplam / adet;
		System.out.print("Ortalamaları: " + ortalama);
	}

}
