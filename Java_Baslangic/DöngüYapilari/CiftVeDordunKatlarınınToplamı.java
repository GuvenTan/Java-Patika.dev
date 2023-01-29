package DöngüYapilari;

import java.util.Scanner;

public class CiftVeDordunKatlarınınToplamı {

	public static void main(String[] args) {
		
		int toplam = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen sayı giriniz: ");
		int k = input.nextInt();
		
		if (k % 2 == 1) {
			for (int i  = 0; i <= k; i++) {
				if (i % 4 == 0 ) { 
					toplam += i;
					System.out.println(i + "  " + toplam);
				}else {
					continue;
				}
				
			}
			
			
		}else {
			System.out.print("Tek sayı girmediniz");
		}
			
	}

}
