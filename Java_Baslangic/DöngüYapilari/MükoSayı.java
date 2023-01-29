package DöngüYapilari;

import java.util.Scanner;

public class MükoSayı {

	public static void main(String[] args) {
		
		int sayi;
		int toplam = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen bir sayı giriniz: ");
		sayi = input.nextInt();
		
		boolean müko = false;
		for(int i = 1; i<sayi; i++) {
			int mod = sayi%i;
			if(mod == 0) {
				toplam += i;
				if (toplam == sayi) {
					müko = true;
				}
				
			}else {
				continue;
			}
		}
		if(müko == true) {
			System.out.print("Müko");
		}else {
			System.out.print("Müko değil");
		}
		

	}

}
