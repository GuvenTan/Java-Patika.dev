package DöngüYapilari;

import java.util.Scanner;

public class GirilenSayıyaKadarDordunVeBesinKatları {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen sayı giriniz: ");
		int sayi = input.nextInt();
		
		System.out.println("Beşin kuvvetleri: ");
		for (int i = 1; i<=sayi; i=i*5) {
			if (i>0) {
				System.out.println(i);
			}
		}
		System.out.println("Dördün kuvvetleri: ");
		for (int j = 1; j<=sayi; j=j*4) {
			if (j>0) {
				System.out.println(j);
			}
		}

	}

}
