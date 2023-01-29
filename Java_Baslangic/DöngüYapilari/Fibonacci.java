package DöngüYapilari;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		int a,b;
		
		int toplam;
		a = 0;
		b = 1;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Kaç değer dönecek: ");
		int number = input.nextInt();
		
		
		for (int i = 0; i <= number; i++) {
			toplam = a + b;
			System.out.println(a + "+" + b + "=" + toplam);
			a = b;
			b = toplam;
			
			
		}
		
		
		

	}

}
