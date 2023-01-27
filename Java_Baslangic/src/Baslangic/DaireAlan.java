package Baslangic;

import java.util.Scanner;

public class DaireAlan {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double pi = 3.14;
		
		System.out.println("Dairenin yarı çapını giriniz (cm): ");
		double r = input.nextDouble();
		System.out.println("Dairenin kaç derecelik alanı hesaplanacak (0<x<360): ");
		double angle = input.nextDouble();
		
		double cevre = (2 * pi * r * angle) /360;
		double alan = (pi * r * r * angle)/360;
		System.out.println("Çevre: " + cevre + "(cm)");
		System.out.println("Alan: " + alan + "(cm kare)");
	}

}
