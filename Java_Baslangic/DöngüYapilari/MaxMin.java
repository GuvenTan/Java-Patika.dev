package DöngüYapilari;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		
		int max = 0,min = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Sayı adedi giriniz: ");
		int adet = input.nextInt();
		
		for(int i = 1; i<=adet; i++) {
			
			System.out.print(i + ". Sayıyı giriniz: ");
			int sayi = input.nextInt();
		
			if (i == 1) {
				max = sayi;
				min = sayi;
			}
		
			if (max < sayi) {
				max = sayi;
			}
		
			if (min > sayi) {
				min = sayi;
			}
			
			
		}
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		

	}

}
