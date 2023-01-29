package DöngüYapilari;

import java.util.Scanner;

public class Kombinasyon {

	public static void main(String[] args) {
		int carpim1 = 1;
		int carpim2 = 1;
		int carpim3 = 1;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen kombinasyonu hesaplanacak sayıyı giriniz: ");
		int k = input.nextInt();
		System.out.print("Kaçlı kombinasyonu hesaplanacak: ");
		int j = input.nextInt();

		for (int i = 1; i<=k; i++) {
			carpim1 *= i;
		}
		
		for (int i = 1; i<=j; i++) {
			carpim2 *= i;
		}
		
		for (int i = 1; i<=(k-j); i++) {
			carpim3 *= i;
		}
		
		int kom = carpim1 / (carpim2 * carpim3);
		System.out.print(kom);
		
		
		
	}

}
