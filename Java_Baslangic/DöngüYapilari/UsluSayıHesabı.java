package DöngüYapilari;

import java.util.Scanner;

public class UsluSayıHesabı {

	public static void main(String[] args) {
		int carpim = 1;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen taban sayısını giriniz: ");
		int k = input.nextInt();
		System.out.print("Girilen sayısının üssünü giriniz: ");
		int j = input.nextInt();

		for (int i = 1; i <= j; i++) {
			carpim *= k;
			
		}
		System.out.print(carpim);
		
	}

}
