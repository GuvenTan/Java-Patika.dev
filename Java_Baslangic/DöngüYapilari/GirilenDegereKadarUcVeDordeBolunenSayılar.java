package DöngüYapilari;

import java.util.Scanner;

public class GirilenDegereKadarUcVeDordeBolunenSayılar {

	public static void main(String[] args) {

		int i = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Lütfen sayı giriniz: ");
		int k = input.nextInt();
		
		for(i = 0; i<k; i++) {
			
			if ((i % 3 == 0) && (i % 4 == 0)) {
				System.out.println(i);
			}
			
		}

	}

}
