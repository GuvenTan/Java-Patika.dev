package KosulluIfadeler;

import java.util.Scanner;

public class GecmeSistemi {

	public static void main(String[] args) {
		int mat, fiz, turk, kim, muz;
		double ort;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Matematik notunuzu giriniz: ");
		mat = input.nextInt();
		
		System.out.print("Fizik notunuzu giriniz: ");
		fiz = input.nextInt();
		
		System.out.print("Türkçe notunuzu giriniz: ");
		turk = input.nextInt();
		
		System.out.print("Kimya notunuzu giriniz: ");
		kim = input.nextInt();
		
		System.out.print("Müzik notunuzu giriniz: ");
		muz = input.nextInt();
		
		ort = (mat + fiz + turk + kim + muz)/5;
				
		if (ort >= 55 && ort <= 100) {
			System.out.print("Geçtiniz: " + ort);
		}else if (ort <= 55 && ort > 0){
			System.out.print("Kaldınız: " + ort);
		}else {
			System.out.print("Geçersiz ortlama hesaplandı notları kontrol ediniz.");
		}
		
		
	}

}
