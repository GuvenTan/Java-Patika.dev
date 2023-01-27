package KosulluIfadeler;

import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		
		double n1, n2;
		int islem;
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("1. Sayıyı Giriniz: ");
		n1 = input.nextDouble();
		System.out.print("2. Sayıyı Giriniz: ");
		n2 = input.nextDouble();
		
		System.out.print("Yapmak istediğiniz işlemin numarısını giriniz\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme): ");
		islem = input.nextInt();
		
		
		switch (islem) {
			case 1:
				System.out.print("Toplam: " + (n1 + n2));
				break;
			case 2:
				System.out.print("Fark: " + (n1 - n2));
				break;
			case 3:
				System.out.print("Çarpma: " + (n1 * n2));
				break;
			case 4:
				System.out.print("Bölme: " + (n1 / n2));
				break;
			default:
				System.out.print("Geçersiz işlem numarası");
			
		}
		
	}

}
