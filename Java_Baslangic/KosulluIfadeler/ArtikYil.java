package KosulluIfadeler;

import java.util.Scanner;

public class ArtikYil {

	public static void main(String[] args) {
		
		int year;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Yılı giriniz: ");
		year = input.nextInt();
		
		if ((year%100) == 0) {
			
			if((year % 400) == 0) {
				System.out.print("Artık Yıl " + year);
			}else {
				System.out.print("Artık Yıl değil " + year);
			}
			
		}else if((year%4) == 0) {
			System.out.print("Artık Yıl " + year);
		
		}else {
			System.out.print("Artık Yıl değil " + year);
		}
		
		
	}

}
