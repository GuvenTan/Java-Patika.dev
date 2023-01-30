package Metot;

import java.util.Scanner;

public class DeseneGore {
	
	static int desen1(int sayi2, int kontrol) {
		System.out.print(sayi2 + " ");
		
		if (kontrol == sayi2) {
			return sayi2;
		}
		
		
		return desen1(sayi2 + 5, kontrol);
	}
	
	
	static int desen(int sayi, int sayi3) {
		System.out.print(sayi + " ");
		
		if (sayi <= 0) {
			
			return desen1(sayi , sayi3);
		}
		
		return desen(sayi - 5 , sayi3); 
	}
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen bir sayı giriniz: ");
		int n = input.nextInt();
		
		desen(n,n);
		

	}

}
