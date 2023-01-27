package Baslangic;

import java.util.Scanner;

public class Hipotenus {

	public static void main(String[] args) {
		
		double a, b, c, u;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("a kenarını giriniz: ");
		a = input.nextDouble();
		
		System.out.println("b kenarını giriniz: ");
		b = input.nextDouble();
		
		c = Math.sqrt((a*a) + (b*b));
		System.out.println("Hipotenüs: " + c);
		
		u = (a+b+c)/2;

		double area = Math.sqrt(u*(u-a)*(u-b)*(u-c));
		double cevre = 2*u;
		System.out.println("Alan: " + area);
		System.out.println("Çevre: " + cevre);
		
	}

}
