package Metot;

import java.util.Scanner;

public class Power {
	
	static int power(int x, int y) {
		
		int result = 1;
		for (int i = 1; i<=y; i++) {
			
			result *= x;
		}
		
		
		return result;
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    	System.out.print("Tabanı giriniz: ");
    	int n = input.nextInt();
    	
    	System.out.print("Power: ");
    	int m = input.nextInt();
    	
    	System.out.print(power(n,m));

	}

}
