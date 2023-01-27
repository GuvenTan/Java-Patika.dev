package Baslangic;

import java.util.Scanner;

public class NotOrtalama {

	public static void main(String[] args) {
		
		int Mat, Fiz, Kim, Türkçe, Tarih, Müz;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Mat notunuzu giriniz: ");
		Mat = input.nextInt();
		
		System.out.print("Fizik notunuzu giriniz: ");
		Fiz = input.nextInt();
		
		System.out.print("Kimya notunuzu giriniz: ");
		Kim = input.nextInt();
		
		System.out.print("Türkçe notunuzu giriniz: ");
		Türkçe = input.nextInt();
		
		System.out.print("Tarih notunuzu giriniz: ");
		Tarih = input.nextInt();
		
		System.out.print("Müzik notunuzu giriniz: ");
		Müz = input.nextInt();
		
		double Ortalama = (Mat + Fiz + Kim + Tarih + Türkçe + Müz)/6;
		
		String sonuc = (Ortalama >= 60) ? "Sınıfı Geçti." : " Sınıfta Kaldı.";
		System.out.print(sonuc + " Ortalama: " + Ortalama);

	}

}
