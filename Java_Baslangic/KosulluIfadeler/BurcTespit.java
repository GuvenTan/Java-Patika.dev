package KosulluIfadeler;

import java.util.Scanner;

public class BurcTespit {

	public static void main(String[] args) {
		
		int day, month;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Kaçıncı ayda doğrunuz (1-12): ");
		month = input.nextInt();
		
		System.out.print(month + ". ayın kaçıncı gününde doğdunuz: ");
		day = input.nextInt();
		

		if(month == 1) {
			
			if (day <= 21) {
				System.out.print("Oğlak");
			}else {
				System.out.print("Kova");
			}
			
		}else if(month == 2) {
			if (day <= 19) {
				System.out.print("Kova");
			}else {
				System.out.print("Balık");
			}
			
		}else if(month == 3) {
			if (day <= 20) {
				System.out.print("Balık");
			}else {
				System.out.print("Koç");
			}
			
		}else if(month == 4) {
			if (day <= 20) {
				System.out.print("Koç");
			}else {
				System.out.print("Boğa");
			}
			
		}else if(month == 5) {
			if (day <= 21) {
				System.out.print("Boğa");
			}else {
				System.out.print("İkizler");
			}
			
		}else if(month == 6) {
			if (day <= 22) {
				System.out.print("İkizler");
			}else {
				System.out.print("Yengeç");
			}
			
		}else if(month == 7) {
			if (day <= 22) {
				System.out.print("Yengeç");
			}else {
				System.out.print("Aslan");
			}
			
		}else if(month == 8) {
			if (day <= 22) {
				System.out.print("Aslan");
			}else {
				System.out.print("Başak");
			}
			
		}else if(month == 9) {
			if (day <= 22) {
				System.out.print("Başak");
			}else {
				System.out.print("Terazi");
			}
			
		}else if(month == 10) {
			if (day <= 22) {
				System.out.print("Terazi");
			}else {
				System.out.print("Akrep");
			}
			
		}else if(month == 11) {
			if (day <= 21) {
				System.out.print("Akrep");
			}else {
				System.out.print("Yay");
			}
			
		}else if(month == 12) {
			if (day <= 21) {
				System.out.print("Yay");
			}else {
				System.out.print("Oğlak");
			}
			
		}else {
			System.out.print("Geçersiz ay sayısı girdiniz.");
		}
		
	
	}

}
