package Metot;

import java.util.Scanner;

public class Palindrom {

	static boolean isPalindrom(int number) {
		
		int temp = number;
		int lastnumber;
		int reversenumber = 0;
		
		while (temp != 0) {
			lastnumber = temp % 10;
			temp = temp / 10;
			reversenumber = reversenumber * 10 + lastnumber;
			
		}
		
		
		return number == reversenumber;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen sayı giriniz: ");
		int number = input.nextInt();
		
		
		if (isPalindrom(number) == true) {
			System.out.print("girmiş olduğunuz sayı palindrom sayı: " + isPalindrom(number) + "\nSayı: " + number);
		}else {
			System.out.print("girmiş olduğunuz sayı palindrom sayı değildir: " + isPalindrom(number) + "\nSayı: " + number);
		}
		
		

	}

}
