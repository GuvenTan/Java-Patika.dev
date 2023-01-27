package Baslangic;

import java.util.Scanner;

public class VucutKitle {

	public static void main(String[] args) {
		
		double kilo, boy;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Kilonuzu giriniz: ");
		kilo = input.nextDouble();
		
		System.out.println("Boyunuzu giriniz (m): ");
		boy = input.nextDouble();
		
		double kitle = kilo / (boy*boy);
		
		System.out.println("Vücut Kilte Endeksinizi: " + kitle);
		
	}

}
