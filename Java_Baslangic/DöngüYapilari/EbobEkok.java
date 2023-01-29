package DöngüYapilari;

import java.util.Scanner;

public class EbobEkok {

	public static void main(String[] args) {
		
		
		int sayi1, sayi2,b,ebob;
		
		Scanner input = new Scanner(System.in);
		System.out.print("1. sayıyı giriniz: ");
		sayi1 = input.nextInt();
		System.out.print("2. sayıyı giriniz: ");
		sayi2 = input.nextInt();
		
		if (sayi1 < sayi2) {
			b = sayi1;
		}else {
			b = sayi2;
		}
		
		int i = 1;
		ebob = 0;
		while(i <= b) {
			
			int mod1 = sayi1 % i;
			int mod2 = sayi2 % i;
			
			if (mod1 == mod2) {
				//System.out.println(i);
				ebob = i;
			}
			i++;
		}
		System.out.println("ebob: " + ebob);
		
		int ekok = (sayi1 * sayi2)/ebob;
		System.out.print("ekok: " + ekok);
	
		

	}

}
