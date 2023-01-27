package KosulluIfadeler;

import java.util.Scanner;

public class UçakBileti {

	public static void main(String[] args) {
		
		double km = 0.10;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Uçuş mesafesi (km): ");
		int mesafe = input.nextInt();
		
		System.out.print("Yaş: ");
		int yas = input.nextInt();
		
		System.out.print("Yolculuk tipi (1-2): ");
		int tip = input.nextInt();
		
		double tutar = mesafe * km;
		System.out.println("Tutar: " + tutar);
		
		
		if (yas < 12) {
			tutar -= tutar*0.5; 
		}else if (yas >= 12 && yas < 24) {
			tutar -= tutar*0.1; 
		}else if (yas >= 65) {
			tutar -= tutar*0.3;
		}
		
		
		if (tip == 1) {
			tutar = tutar;
		}else {
			tutar -= tutar*0.1;
		}
		
		System.out.print("Yeni tutar: " + tutar);

	}

}
