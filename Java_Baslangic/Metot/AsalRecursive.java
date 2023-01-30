package Metot;

import java.util.Scanner;

public class AsalRecursive {
	
	static boolean asal(int sayi, int eksi) {
		
		
		if (sayi <= 1) {
			return false;
		}
		
		if (eksi == 1) {
			return true;
		}
		if (sayi % eksi == 0) {
			return false;
		}
		
		return asal(sayi, eksi - 1);
	}
	
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen bir sayı giriniz: ");
		int n = input.nextInt();
		int m = n-1;
		
		System.out.print(asal(n,m));
		
		
	}

}
